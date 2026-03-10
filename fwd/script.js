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
            { store: "Croma", price: 42000 },
            { store: "Vi Store", price: 43100 }
        ],
        "Kukatpally": [
            { store: "Reliance Digital", price: 41800 },
            { store: "Croma", price: 42800 },
            { store: "Poorvika", price: 43500 }
        ],
        "Ameerpet": [
            { store: "Croma", price: 43200 },
            { store: "Poorvika", price: 42500 },
            { store: "Big C Mobiles", price: 44000 }
        ],
        "Banjara Hills": [
            { store: "Reliance Digital", price: 42500 },
            { store: "Croma", price: 43000 },
            { store: "Samsung Store", price: 41900 }
        ],
        "Jubilee Hills": [
            { store: "Samsung Store", price: 42000 },
            { store: "Croma", price: 43500 },
            { store: "Reliance Digital", price: 42700 }
        ]
    },
    "hp pavilion": {
        "Secunderabad": [
            { store: "Reliance Digital", price: 63500 },
            { store: "HP World", price: 62000 },
            { store: "Croma", price: 64200 }
        ],
        "Kukatpally": [
            { store: "Croma", price: 61000 },
            { store: "Reliance Digital", price: 62500 },
            { store: "Laptop World", price: 60200 }
        ],
        "Ameerpet": [
            { store: "Laptop World", price: 60500 },
            { store: "Croma", price: 61800 },
            { store: "HP World", price: 62300 }
        ],
        "Banjara Hills": [
            { store: "HP World", price: 64000 },
            { store: "Croma", price: 63200 },
            { store: "Reliance Digital", price: 62800 }
        ],
        "Jubilee Hills": [
            { store: "Croma", price: 62000 },
            { store: "HP World", price: 61500 },
            { store: "Reliance Digital", price: 63000 }
        ]
    },
    "iphone 14": {
        "Secunderabad": [
            { store: "iStore", price: 72000 },
            { store: "Reliance Digital", price: 73500 },
            { store: "Croma", price: 74200 }
        ],
        "Kukatpally": [
            { store: "Croma", price: 73000 },
            { store: "Poorvika", price: 72800 },
            { store: "Reliance Digital", price: 74000 }
        ],
        "Ameerpet": [
            { store: "Poorvika", price: 72500 },
            { store: "Croma", price: 73800 },
            { store: "Big C Mobiles", price: 71900 }
        ],
        "Banjara Hills": [
            { store: "iStore", price: 71500 },
            { store: "Croma", price: 74000 },
            { store: "Reliance Digital", price: 72800 }
        ],
        "Jubilee Hills": [
            { store: "iStore", price: 71000 },
            { store: "Reliance Digital", price: 73200 },
            { store: "Croma", price: 72500 }
        ]
    },
    "sony wh-1000xm5": {
        "Secunderabad": [
            { store: "Reliance Digital", price: 26000 },
            { store: "Croma", price: 27500 },
            { store: "Sony Center", price: 25500 }
        ],
        "Kukatpally": [
            { store: "Reliance Digital", price: 26500 },
            { store: "Poorvika", price: 25800 },
            { store: "Croma", price: 27000 }
        ],
        "Ameerpet": [
            { store: "Croma", price: 27200 },
            { store: "Poorvika", price: 26800 },
            { store: "Reliance Digital", price: 26300 }
        ],
        "Banjara Hills": [
            { store: "Sony Center", price: 25500 },
            { store: "Croma", price: 27000 },
            { store: "Reliance Digital", price: 26200 }
        ],
        "Jubilee Hills": [
            { store: "Sony Center", price: 25000 },
            { store: "Reliance Digital", price: 26800 },
            { store: "Croma", price: 27300 }
        ]
    },
    "lg 4k tv 55": {
        "Secunderabad": [
            { store: "Reliance Digital", price: 89000 },
            { store: "Croma", price: 91500 },
            { store: "LG Shoppe", price: 88000 }
        ],
        "Kukatpally": [
            { store: "Croma", price: 88500 },
            { store: "LG Shoppe", price: 87000 },
            { store: "Reliance Digital", price: 89500 }
        ],
        "Ameerpet": [
            { store: "Electronics Hub", price: 88000 },
            { store: "LG Shoppe", price: 86500 },
            { store: "Croma", price: 89200 }
        ],
        "Banjara Hills": [
            { store: "LG Shoppe", price: 86500 },
            { store: "Reliance Digital", price: 90000 },
            { store: "Croma", price: 91000 }
        ],
        "Jubilee Hills": [
            { store: "LG Shoppe", price: 86000 },
            { store: "Croma", price: 89500 },
            { store: "Reliance Digital", price: 88500 }
        ]
    },
    "apple macbook air m2": {
        "Secunderabad": [
            { store: "Reliance Digital", price: 116500 },
            { store: "iStore", price: 114500 },
            { store: "Croma", price: 117000 }
        ],
        "Kukatpally": [
            { store: "Croma", price: 115500 },
            { store: "Reliance Digital", price: 116800 },
            { store: "Poorvika", price: 114800 }
        ],
        "Ameerpet": [
            { store: "iStore", price: 113500 },
            { store: "Poorvika", price: 115000 },
            { store: "Croma", price: 116200 }
        ],
        "Banjara Hills": [
            { store: "iStore", price: 114000 },
            { store: "Croma", price: 116000 },
            { store: "Reliance Digital", price: 115500 }
        ],
        "Jubilee Hills": [
            { store: "iStore", price: 113000 },
            { store: "Reliance Digital", price: 115000 },
            { store: "Croma", price: 114500 }
        ]
    },
    "canon eos r50": {
        "Secunderabad": [
            { store: "Camera World", price: 68000 },
            { store: "Reliance Digital", price: 70000 },
            { store: "Canon Store", price: 69500 }
        ],
        "Kukatpally": [
            { store: "Croma", price: 71000 },
            { store: "Camera World", price: 68500 },
            { store: "Reliance Digital", price: 69800 }
        ],
        "Ameerpet": [
            { store: "Camera World", price: 69500 },
            { store: "Canon Store", price: 68200 },
            { store: "Croma", price: 70500 }
        ],
        "Banjara Hills": [
            { store: "Canon Store", price: 67500 },
            { store: "Camera World", price: 69000 },
            { store: "Reliance Digital", price: 70200 }
        ],
        "Jubilee Hills": [
            { store: "Canon Store", price: 66500 },
            { store: "Camera World", price: 68000 },
            { store: "Croma", price: 69500 }
        ]
    },
    "samsung 65 qled": {
        "Secunderabad": [
            { store: "Reliance Digital", price: 95000 },
            { store: "Samsung Plaza", price: 93000 },
            { store: "Croma", price: 96500 }
        ],
        "Kukatpally": [
            { store: "Croma", price: 94000 },
            { store: "Samsung Plaza", price: 92500 },
            { store: "Reliance Digital", price: 95500 }
        ],
        "Ameerpet": [
            { store: "Electronics Hub", price: 92000 },
            { store: "Samsung Plaza", price: 91500 },
            { store: "Croma", price: 93500 }
        ],
        "Banjara Hills": [
            { store: "Samsung Plaza", price: 91000 },
            { store: "Croma", price: 95500 },
            { store: "Reliance Digital", price: 93000 }
        ],
        "Jubilee Hills": [
            { store: "Reliance Digital", price: 93500 },
            { store: "Samsung Plaza", price: 90500 },
            { store: "Croma", price: 94800 }
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
    const productInput = document.getElementById("searchProduct").value.toLowerCase().trim();
    const locationInput = document.getElementById("searchLocation").value.trim();

    const resultsDiv = document.getElementById("searchResults");
    resultsDiv.innerHTML = "";

    if (!products[productInput]) {
        resultsDiv.innerHTML = `<p style="color:red;">Product not found! Try: Samsung Galaxy S21, HP Pavilion, iPhone 14, Sony WH-1000XM5, LG 4K TV 55, Apple MacBook Air M2, Canon EOS R50, Samsung 65 QLED</p>`;
        return;
    }

    const productLocations = products[productInput];

    // Case-insensitive location matching
    const matchedLocation = Object.keys(productLocations).find(
        loc => loc.toLowerCase() === locationInput.toLowerCase()
    );

    if (!matchedLocation) {
        resultsDiv.innerHTML = `<p style="color:red;">No deals available in ${locationInput}!</p>`;
        return;
    }

    const deals = productLocations[matchedLocation];

    // Find the lowest price
    let lowest = deals[0];
    for (let i = 1; i < deals.length; i++) {
        if (deals[i].price < lowest.price) lowest = deals[i];
    }

    // Show a card for every store, highlight the cheapest one
    deals.forEach(deal => {
        const isBest = deal.price === lowest.price && deal.store === lowest.store;
        const card = document.createElement("div");
        card.className = isBest ? "product-card highlight" : "product-card";
        card.innerHTML = `
            <h3>${capitalize(productInput)}</h3>
            <p>📍 ${matchedLocation}</p>
            <p>Store: ${deal.store}</p>
            <p class="price">₹${deal.price}</p>
            ${isBest ? `<span class="tag best">✅ Recommended</span>` : ""}
            <div class="card-actions">
                <button onclick="addToCart('${capitalize(productInput)}','${matchedLocation}','${deal.store}',${deal.price})">
                    Add to Cart
                </button>
                <button class="explore-btn" onclick="exploreProduct('${capitalize(productInput)}','${matchedLocation}','${deal.store}',${deal.price})">
                    Explore
                </button>
            </div>
        `;
        resultsDiv.appendChild(card);
    });
}

/* ========= EXPLORE ========= */
function exploreProduct(productName, location, store, price) {
    alert(`Product: ${productName}\nLocation: ${location}\nStore: ${store}\nPrice: ₹${price}`);
}

/* ========= UTILITY ========= */
function capitalize(str) {
    return str.replace(/\b\w/g, c => c.toUpperCase());
}
