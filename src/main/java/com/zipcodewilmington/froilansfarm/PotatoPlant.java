package com.zipcodewilmington.froilansfarm;

public class PotatoPlant extends Crop implements Produce<Potato> {
    public Potato yield() {
        return new Potato();
    }
}
