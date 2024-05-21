package com.khalil.zookeeper;

public class Mammal {
	public int energy;

    public Mammal(){
        this.energy = 100;
    }

    public void diplayEnergy(){
        System.out.printf("The energy level is : %s. %n", this.energy);
    }
}
