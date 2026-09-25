function toggleMenu() {

    const nav = document.getElementById("mainNav");

    if (nav.style.display === "flex") {
        nav.style.display = "none";

    }

    else {
        nav.style.display = "flex";
    }

}


function toggleTheme() {

    const button =
        document.getElementById("themeButton");

    document.body.classList.toggle("dark-mode");


    if (document.body.classList.contains("dark-mode")) {
        button.innerHTML = "☀️ Light Mode";

    }

    else {
        button.innerHTML = "🌙 Dark Mode";
    }

}

function showNotification() {

    const notification =
        document.getElementById("notification");

    notification.style.display = "block";

    setTimeout(function () {

        notification.style.display = "none";

    }, 3000);

}

function openModal() {

    const modal =document.getElementById("myModal");
    modal.style.display = "block";

}

function closeModal() {

    const modal =
        document.getElementById("myModal");


    modal.style.display = "none";

}

window.onclick = function(event) {

    const modal =
        document.getElementById("myModal");

    if (event.target === modal) {

        modal.style.display = "none";

    }

};

let images = [

    "images/student.png",
    "images/college-bg.jpg",
    "images/graduation.png"

];


let currentImage = 0;

function nextImage() {

    currentImage++;

    if (currentImage >= images.length) {
        currentImage = 0;

    }

    document.getElementById("sliderImage").src =images[currentImage];

}

function previousImage() {
    currentImage--;

    if (currentImage < 0) {
        currentImage = images.length - 1;

    }


    document.getElementById("sliderImage").src =
        images[currentImage];

}

function toggleFAQ(id) {

    const answer =
        document.getElementById(id);


    if (answer.style.display === "block") {
        answer.style.display = "none";

    }

    else {
        answer.style.display = "block";

    }

}