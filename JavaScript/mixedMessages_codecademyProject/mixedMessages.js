
// defining variables and arrays with the needed content
const jokeTypes = ['frontEnd','backEnd','qa'];
let frontEndJokes = [
    "How do frontend developers like their coffee? Responsive",
    "Why did the CSS file go to the party alone? Because it had no class",
    "Why did the frontend developer bring a ladder to work? To deal with z-index problems"
];
let backEndJokes = [
    "Backend devs’ favorite pickup line: I’ve got great uptime, baby",
    "Backend devs are like magicians:  The user never knows what’s happening behind the curtain.",
    "Why do backend developers hate nature? Too many bugs"
];
let qaJokes = [
    "A QA walks into a bar and orders a beer. \nThen he orders 0 beers. \nThen he orders -1 beers. \nThen he orders 999999 beers. \nThe bartender explodes.",
    "Why don’t QA engineers ever get invited to parties? Because they always find the flaws",
    "QA prayer: “Dear system, give me this day my daily bug”"
];

// empty variables to store the randomized options
let jokeTypeSelected;
let jokeSelected;

// set a random type of joke
function chooseTypeOfJoke(){
    jokeTypeSelected = (jokeTypes[Math.floor((Math.random() * 3))] + "Jokes");
    console.log("Type of joke randomized: " + jokeTypeSelected);
}

// set a random joke based on their type
function randomJoke(){
    if (jokeTypeSelected === "backEndJokes"){
        jokeSelected = backEndJokes[(Math.floor(Math.random() * 3))];
    } else if (jokeTypeSelected === "frontEndJokes"){
        jokeSelected = frontEndJokes[(Math.floor(Math.random() * 3))];
    } else {
        jokeSelected = qaJokes[(Math.floor(Math.random() * 3))];
    }
    console.log("Joke selected:\n" + jokeSelected);
}

console.log("# Mixed Messages Codecademy project - By Marc Abad, aka hide-afk #");
chooseTypeOfJoke();
randomJoke();

console.log(jokeTypes.length);