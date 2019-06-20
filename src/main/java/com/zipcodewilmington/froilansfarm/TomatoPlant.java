package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop implements Produce<Tomato>{


    public Tomato yield() {
        return new Tomato();
    }
}
