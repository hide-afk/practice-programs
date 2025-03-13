// function to get the numnber of hours slept on every day of the week
function getSleepHours(day) {
    day = day.toLowerCase();
    switch (day) {
        case 'monday':
            return 8;
        case 'tuesday':
            return 9;
        case 'wednesday':
            return 8;
        case 'thursday':
            return 8;
        case 'friday':
            return 8;
        case 'saturday':
            return 8;
        case 'sunday':
            return 8;
    }
}

// function to return the actual hours slept calculated from the previous function
const getActualSleepHours = () => {
    return getSleepHours('monday') + getSleepHours('tuesday') + getSleepHours('wednesday') + getSleepHours('thursday') + getSleepHours('friday') + getSleepHours('saturday') + getSleepHours('sunday');
}

// function to determine and return the ideal sleep hours in a whole week
const getIdealSleepHours = () => {
    let idealHours = 8;
    return idealHours * 7;
}

// function to calculate the sleep debt between the actualSleepHours and idealSleepHours
const calculateSleepDebt = () => {
    let actualSleepHours = getActualSleepHours();
    let idealSleepHours = getIdealSleepHours();

    if (actualSleepHours === idealSleepHours) {
        console.log(`Congrats! You got the perfect amount of sleep: ${idealSleepHours} hours`);
    } else if (actualSleepHours < idealSleepHours) {
        console.log(`Oops... I think you'll need more sleep hours...`);
        console.log(`Hours under: ${idealSleepHours - actualSleepHours}h`);
    } else if (actualSleepHours > idealSleepHours) {
        console.log(`WOW! You got more sleep than the ideal amount: ${idealSleepHours}h`);
        console.log(`Hours over: ${actualSleepHours - idealSleepHours}h`);
    }
}

calculateSleepDebt();