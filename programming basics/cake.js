function howMuchLeftOverCake(numberOfPieces, numberOfPeople) {
    if (numberOfPeople <= 0) {
        return "Number of people must be greater than zero.";
    }

     piecesPerPerson = Math.floor(numberOfPieces / numberOfPeople);
     leftoverPieces = numberOfPieces % numberOfPeople;

    return leftoverPieces;
}

numberOfPieces = 12;
 numberOfPeople = 5;
 result = howMuchLeftOverCake(numberOfPieces, numberOfPeople);
console.log( numberOfPieces +"pieces of cake and "+numberOfPeople+" people, there are "+result+" pieces left over.");

//FEATURE2===========

function howMuchLeftOverCake(numberOfPieces, numberOfPeople) {
    if (numberOfPeople <= 0) {
        return "Number of people must be greater than zero.";
    }

    const piecesPerPerson = Math.floor(numberOfPieces / numberOfPeople);
    const leftoverPieces = numberOfPieces % numberOfPeople;

    console.log("With "+numberOfPieces+" pieces of cake and "+numberOfPeople+" people, there are "+leftoverPieces+" pieces left over.");

    if (leftoverPieces === 0) {
        console.log("No leftovers for you!");
    } else if (leftoverPieces <= 2) {
        console.log("You have some leftovers.");
    } else if (leftoverPieces <= 5) {
        console.log("You have leftovers to share.");
    } else {
        console.log("Hold another party!");
    }

    return leftoverPieces;
}


numberOfPieces = 12;
numberOfPeople = 5;
howMuchLeftOverCake(numberOfPieces, numberOfPeople);