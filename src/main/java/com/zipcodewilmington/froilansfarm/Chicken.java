package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce<Egg> {
    private boolean HBF;


    public void makeNoise() {

    }

    public Egg yield() {
        return new Egg();
    }

    public void eat(Edible edible) {

    }
}
