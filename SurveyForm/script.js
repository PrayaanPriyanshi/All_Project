// JavaScript functions for handling form submission and reset
function submitForm() {
    const firstName = document.getElementById("firstName").value;
    const lastName = document.getElementById("lastName").value;
    const dob = document.getElementById("dob").value;
    const country = document.getElementById("country").value;
    const gender = document.querySelectorAll("input[name='gender']:checked");
    const profession = document.getElementById("profession").value;
    const email = document.getElementById("email").value;
    const mobile = document.getElementById("mobile").value;

    if (gender.length === 0) {
        alert("Please select a gender.");
        return;
    }

    // Construct a message with the selected values
    const message = `
        First Name: ${firstName}
        Last Name: ${lastName}
        Date of Birth: ${dob}
        Country: ${country}
        Gender: ${Array.from(gender).map(input => input.value).join(", ")}
        Profession: ${profession}
        Email: ${email}
        Mobile Number: ${mobile}
    `;

    // Display the message in a popup
    document.getElementById("popup").textContent = message;
    document.getElementById("popup").style.display = "block";

    // Reset the form
    resetForm();
}

function resetForm() {
    document.getElementById("surveyForm").reset();
}
