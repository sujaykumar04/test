let navbar = document.querySelector('.header .navbar');
document.querySelector('#menu-btn').onclick = () => {
  navbar.classList.add('active');
};
document.querySelector('#nav-close').onclick = () => {
  navbar.classList.remove('active');
};

// Toggle Search Form
const searchBtn = document.getElementById('search-btn');
const closeSearch = document.getElementById('close-search');
const searchForm = document.querySelector('.search-form');

searchBtn.addEventListener('click', () => {
  searchForm.classList.add('active');
});
closeSearch.addEventListener('click', () => {
  searchForm.classList.remove('active');
});

// Scroll Navbar Effect
window.onscroll = () => {
  navbar.classList.remove('active');
  document.querySelector('.header').classList.toggle('active', window.scrollY > 0);
};
window.onload = () => {
  document.querySelector('.header').classList.toggle('active', window.scrollY > 0);
};

// Contact Form Submission
document.addEventListener("DOMContentLoaded", function () {
  const form = document.getElementById('contactForm');

  if (form) {
    form.addEventListener('submit', async function (e) {
      e.preventDefault();

      const formData = {
        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        phone: document.getElementById("phone").value,
        subject: document.getElementById("subject").value,
        message: document.getElementById("message").value,
      };

      try {
        const res = await fetch("http://localhost:3000/api/contact", {
          method: "POST",
          headers: {
            "Content-Type": "application/json",
          },
          body: JSON.stringify(formData),
        });

        if (res.ok) {
          alert("✅ Message sent successfully!");
          form.reset();
        } else {
          alert("❌ Failed to send message.");
        }
      } catch (error) {
        alert("⚠️ Error: " + error.message);
      }
    });
  }
});
