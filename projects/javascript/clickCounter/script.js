let clickNumber = document.getElementById('clickCounter');
let clickButton = document.getElementById('clickButton');
let resetButton = document.getElementById('resetButton');

let counter = 0;

clickButton.onclick = function () {
    counter++;
    clickNumber.innerHTML = counter;
}

resetButton.onclick = function () {
    counter = 0;
    clickNumber.innerHTML = counter;
}