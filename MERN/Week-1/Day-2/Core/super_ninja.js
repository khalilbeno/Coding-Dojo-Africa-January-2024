class Ninja {
    constructor(name) {
        this.name = name;
        this.health = 90;
        this.speed = 3;
        this.strength = 3;
    }

    sayName() {
        console.log(this.name);
    }
    showStats() {
        console.log("Stats ");
        console.log("Name: ", this.name);
        console.log("strength: ", this.strength);
        console.log("speed: ", this.speed);
        console.log("health: ", this.health);
    }
    drinkSake() {
        console.log("Drinking Sake ");
        this.health = + 10;
        console.log("health: ", this.health);
    }

}

class Sensei extends Ninja {
    constructor(name) {
        super(name);
        this.wisdom = 10;
    }

    speakWisdom() {
        super.drinkSake();
        console.log("spkwisdom")
    }

}

const superSensei = new Sensei("Master Splinter");
superSensei.speakWisdom();
