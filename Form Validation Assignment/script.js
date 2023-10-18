function validateForm() {
    const fullName = document.getElementById("fullName").value;
    const phoneNumber = document.getElementById("phoneNumber").value;
    const email = document.getElementById("email").value;
    const website = document.getElementById("website").value;
    const password = document.getElementById("password").value;
    const confirmPassword = document.getElementById("confirmPassword").value;

    const namePattern = /^[A-Za-z]{3,}$/;
    const phonePattern = /^\d{3}-\d{3}-\d{4}$/;
    const passwordPattern = /^(?=.*[A-Z])(?=.*[a-z])(?=.*\d).{8,}$/;

    let isValid = true;

    // Full Name Validation
    if (!namePattern.test(fullName)) {
        isValid = false;
        document.getElementById("fullNameError").innerText = "Name should have at least 3 characters";
    } else {
        document.getElementById("fullNameError").innerText = "";
    }

    // Email Validation
    if (!isValidEmail(email)) {
        isValid = false;
        document.getElementById("emailError").innerText = "Please enter a valid email address";
    } else {
        document.getElementById("emailError").innerText = "";
    }

    // Phone Number Validation
    if (!phonePattern.test(phoneNumber)) {
        isValid = false;
        document.getElementById("phoneNumberError").innerText = "Phone should be in the format 555-555-5555";
    } else {
        document.getElementById("phoneNumberError").innerText = "";
    }

    // Website URL Validation
    if (!isValidURL(website)) {
        isValid = false;
        document.getElementById("websiteError").innerText = "Please enter a valid URL";
    } else {
        document.getElementById("websiteError").innerText = "";
    }

    // Password Validation
    if (!passwordPattern.test(password)) {
        isValid = false;
        document.getElementById("passwordError").innerText = "Password should include at least 1 uppercase character, 1 lowercase character, and 1 number (min 8 characters)";
    } else {
        document.getElementById("passwordError").innerText = "";
    }

    // Confirm Password Validation
    if (password !== confirmPassword) {
        isValid = false;
        document.getElementById("confirmPasswordError").innerText = "Passwords do not match";
    } else {
        document.getElementById("confirmPasswordError").innerText = "";
    }

    if (isValid) {
        console.log("Registration Successful!");
        console.log("Full Name: " + fullName);
        console.log("Phone Number: " + phoneNumber);
        console.log("Email Address: " + email);
        console.log("Website URL: " + website);
        return true;
    }

    return false;
}

function isValidEmail(email) {
    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return emailPattern.test(email);
}

function isValidURL(url) {
    const urlPattern = /^(https?|ftp):\/\/[^\s/$.?#].[^\s]*$/;
    return urlPattern.test(url);
}