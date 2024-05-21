package com.khalil.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething(){
        this.energy -= 5;
        System.out.println("The gorilla is throwing something");
    }

    public void eatBanans(){
        this.energy += 10;
        System.out.println("The gorilla is eating bananas");
    }

    public void climb(){
        this.energy -= 10;
        System.out.println("The gorilla is climbing a tree");
    }
}
