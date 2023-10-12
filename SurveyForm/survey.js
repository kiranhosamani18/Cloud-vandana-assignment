function submitForm() {
    var form = document.getElementById("surveyForm");
    if (form.checkValidity()) {
        var popupContent = "";
        var inputs = form.elements;
        for (var i = 0; i < inputs.length; i++) {
            if (inputs[i].type !== "button") {
                popupContent += `<p><strong>${inputs[i].name}:</strong> ${inputs[i].value}</p>`;
            }
        }
        document.getElementById("popupContent").innerHTML = popupContent;
        document.getElementById("popup").style.display = "block";

        form.reset();

    }
    else {
        alert("Please fill in all required fields.");
    }
}

function resetForm() {
    document.getElementById("surveyForm").reset();
}

function closePopup() {
    document.getElementById("popup").style.display = "none";
}