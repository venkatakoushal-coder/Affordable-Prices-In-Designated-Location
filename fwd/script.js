/* ========= PRODUCTS DATA ========= */

// Automatically prefill search inputs from index.html
window.addEventListener("DOMContentLoaded", () => {
    const prefillProduct = localStorage.getItem("searchProduct");
    const prefillLocation = localStorage.getItem("searchLocation");

    if (prefillProduct && prefillLocation) {
        document.getElementById("searchProduct").value = prefillProduct;
        document.getElementById("searchLocation").value = prefillLocation;
        searchProduct(); // automatically show the result
        localStorage.removeItem("searchProduct");
        localStorage.removeItem("searchLocation");
    }
});

const products = {
    "samsung galaxy s21": {
        "Secunderabad": [
            { store: "Reliance Digital", price: 41500 },
            { store: "Croma", price: 42000 }
        ],
        "Kukatpally": [
            { store: "Reliance Digital", price: 41800 },
            { store: "Croma", price: 42800 }
        ],
        "Ameerpet": [
            { store: "Croma", price: 43200 }
        ]
    },
    "hp pavilion": {
        "Kukatpally": [
            { store: "Croma", price: 61000 }
        ],
        "Secunderabad": [
            { store: "Reliance Digital", price: 63500 }
        ]
    }
};

/* ========= CART LOGIC ========= */
let cart = JSON.parse(localStorage.getItem("cart")) || [];
updateCartCount();

function addToCart(productName, location, store, price) {
    cart.push({ productName, location, store, price });
    localStorage.setItem("cart", JSON.stringify(cart));
    updateCartCount();
    alert(`${productName} added to cart!`);
}

function updateCartCount() {
    const countEl = document.getElementById("cart-count");
    if (countEl) countEl.innerText = cart.length;
}

function openCart() {
    document.getElementById("cartModal").style.display = "block";
    displayCartItems();
}

function closeCart() {
    document.getElementById("cartModal").style.display = "none";
}

function displayCartItems() {
    const list = document.getElementById("cart-items");
    const total = document.getElementById("total-price");
    list.innerHTML = "";
    let sum = 0;
    cart.forEach(item => {
        sum += item.price;
        const li = document.createElement("li");
        li.innerText = `${item.productName} (${item.location} - ${item.store}) - ₹${item.price}`;
        list.appendChild(li);
    });
    total.innerText = sum;
}

function buyNow() {
    if(cart.length === 0) {
        alert("Cart is empty!");
        return;
    }
    alert("Purchase successful! Thank you for shopping.");
    cart = [];
    localStorage.removeItem("cart");
    updateCartCount();
    closeCart();
}

/* ========= SEARCH & DYNAMIC DISPLAY ========= */
function searchProduct() {
    const productInput = document.getElementById("searchProduct").value.toLowerCase();
    const locationInput = document.getElementById("searchLocation").value;

    const resultsDiv = document.getElementById("searchResults");
    resultsDiv.innerHTML = "";

    if (!products[productInput]) {
        resultsDiv.innerHTML = `<p style="color:red;">Product not found!</p>`;
        return;
    }

    const productLocations = products[productInput];
    if (!productLocations[locationInput]) {
        resultsDiv.innerHTML = `<p style="color:red;">No deals available in ${locationInput}!</p>`;
        return;
    }

    // Find lowest price in location
    const deals = productLocations[locationInput];
    let lowest = deals[0];
    for (let i = 1; i < deals.length; i++) {
        if (deals[i].price < lowest.price) lowest = deals[i];
    }

    // Create dynamic card
    const card = document.createElement("div");
    card.className = "product-card highlight";
    card.innerHTML = `
        <h3>${capitalize(productInput)}</h3>
        <p>📍 ${locationInput}</p>
        <p>Store: ${lowest.store}</p>
        <p class="price">₹${lowest.price}</p>
        <span class="tag best">Best Price</span>
        <div class="card-actions">
            <button onclick="addToCart('${capitalize(productInput)}','${locationInput}','${lowest.store}',${lowest.price})">
                Add to Cart
            </button>
            <button class="explore-btn" onclick="exploreProduct('${capitalize(productInput)}','${locationInput}','${lowest.store}',${lowest.price})">
                Explore
            </button>
        </div>
    `;
    resultsDiv.appendChild(card);
}

/* ========= EXPLORE ========= */
function exploreProduct(productName, location, store, price) {
    alert(`Product: ${productName}\nLocation: ${location}\nStore: ${store}\nPrice: ₹${price}`);
}

/* ========= UTILITY ========= */
function capitalize(str) {
    return str.replace(/\b\w/g, c => c.toUpperCase());
}