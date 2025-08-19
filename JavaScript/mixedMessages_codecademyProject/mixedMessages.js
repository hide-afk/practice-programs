
const jokeTypes = ['frontEnd','backEnd','qa'];
let frontEndJokes = [];
let backEndJokes = [
    "Backend devs’ favorite pickup line:\nI’ve got great uptime, baby",
    "Backend devs are like magicians: \nThe user never knows what’s happening behind the curtain.",
    ""
];
let qaJokes = [
    "A QA walks into a bar and orders a beer. \nThen he orders 0 beers. \nThen he orders -1 beers. \nThen he orders 999999 beers. \nThe bartender explodes.",
    "",
    ""
];

function chooseTypeOfJoke(){
    const randomInt = 0;
    return jokeTypes[Math.floor((Math.random() * 3))]; // return a random type of joke from its array 
}
console.log("# Mixed Messages Codecademy project - By Marc Abad, aka hide-afk #");
console.log("Type of joke randomized: " + chooseTypeOfJoke());


