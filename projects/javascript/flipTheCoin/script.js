const randomButton = document.getElementById('flippingButton');
const headsCoin = document.getElementById('heads');
const tailsCoin = document.getElementById('tails');
const coinsContainer = document.getElementById('coins');

let binaryResult = null;

// Result = 0 => Heads
// Result = 1 => Tails
randomButton.onclick = function () {
    tailsCoin.style.display = 'none';
    headsCoin.style.display = 'none';
    binaryResult = Math.floor(Math.random() * 2);
    setTimeout(() => {
        if (binaryResult === 0){
            tailsCoin.style.display = 'none';
            

            headsCoin.style.display = 'block';
        } else if (binaryResult === 1){
            headsCoin.style.display = 'none';

            tailsCoin.style.display = 'block';
        }
      }, 200);
}