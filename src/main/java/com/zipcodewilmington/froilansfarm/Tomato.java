package com.zipcodewilmington.froilansfarm;

public class Tomato extends Crop implements Produce {
    public boolean fertilized() {
        return false;
    }

    public boolean harvested() {
        return false;
    }
}
