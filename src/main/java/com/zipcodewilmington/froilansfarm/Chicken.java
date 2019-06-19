package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce {

    public boolean fertilized() {
        return false;
    }

    public boolean harvested() {
        return false;
    }
}
