package com.zipcodewilmington.froilansfarm.FieldRelated;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;

public class TomatoPlant extends Crop implements Produce<Tomato> {


    public Tomato yield() {
        return new Tomato();
    }
}
