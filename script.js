function validateForm() {

    // Get values
    let name = document.getElementById("name").value.trim();
    let email = document.getElementById("email").value.trim();
    let mobile = document.getElementById("mobile").value.trim();
    let password = document.getElementById("password").value;
    let confirmPassword = document.getElementById("confirmPassword").value;

    let course = document.getElementById("course").value;
    let year = document.getElementById("year").value;
    let humanCheck = document.getElementById("humanCheck").checked;

    let gender = document.querySelector(
        'input[name="gender"]:checked'
    );

    let terms = document.getElementById("terms").checked;


    // Regular Expressions

    // Only letters and spaces
    let nameRegex = /^[A-Za-z ]{3,30}$/;

    // Email validation
    let emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    // Exactly 10 digits
    let mobileRegex = /^[0-9]{10}$/;

    // Minimum 8 characters, one uppercase, one lowercase,
    // one number and one special character
    let passwordRegex =
        /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;


    // Clear previous errors
    document.querySelectorAll("span").forEach(function(span) {
        span.innerHTML = "";
    });


    // Name validation
    if (!nameRegex.test(name)) {
        document.getElementById("nameError").innerHTML =
            "Enter a valid name (3-30 letters).";
        return false;
    }


    // Email validation
    if (!emailRegex.test(email)) {
        document.getElementById("emailError").innerHTML =
            "Enter a valid email.";
        return false;
    }


    // Mobile validation
    if (!mobileRegex.test(mobile)) {
        document.getElementById("mobileError").innerHTML =
            "Mobile number must contain exactly 10 digits.";
        return false;
    }


    // Password validation
    if (!passwordRegex.test(password)) {
        document.getElementById("passwordError").innerHTML =
            "Password must be 8+ characters with uppercase, lowercase, number and special character.";
        return false;
    }


    // Confirm password
    if (password !== confirmPassword) {
        document.getElementById("confirmError").innerHTML =
            "Passwords do not match.";
        return false;
    }


    // Course validation
    if (course === "") {
        document.getElementById("courseError").innerHTML =
            "Please select a course.";
        return false;
    }


    // Year validation
    if (year === "") {
        document.getElementById("yearError").innerHTML =
            "Please select your year.";
        return false;
    }


    // Gender validation
    if (!gender) {
        document.getElementById("genderError").innerHTML =
            "Please select your gender.";
        return false;
    }


    // Terms validation
    if (!terms) {
        document.getElementById("termsError").innerHTML =
            "You must accept the terms.";
        return false;
    }

    // Human verification
if (!humanCheck) {
    document.getElementById("captchaError").innerHTML =
        "Please verify that you are human.";
    return false;
}

    // Everything is valid
    alert("Registration successful!");

    return true;
}