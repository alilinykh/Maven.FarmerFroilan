package com.zipcodewilmington.froilansfarm;

public class Person implements Eater, NoiseMaker{
    Integer meals;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public void eat(Meals meals) {

    }

    public void makeNoise() {

    }

    @Override
    public void eat(Edible edible) {

    }
}
