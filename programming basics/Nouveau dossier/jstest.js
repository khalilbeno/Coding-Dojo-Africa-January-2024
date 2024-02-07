function setActive(element) {
    if(element.classList.contains("dark-mode")) {
        element.innerText = "Switch to light mode";
        element.classList.remove("dark-mode");
    } else {
        element.innerText = "Switch to dark mode";
        element.classList.add("dark-mode");
    }
}