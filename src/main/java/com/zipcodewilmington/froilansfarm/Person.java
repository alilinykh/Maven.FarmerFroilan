package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;

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

    public String makeNoise() {
        return null;

    }

    public void eat(Edible edible) {

    }
}
