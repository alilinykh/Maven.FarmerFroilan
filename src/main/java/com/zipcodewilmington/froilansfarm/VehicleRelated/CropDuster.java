package com.zipcodewilmington.froilansfarm.VehicleRelated;

import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.FieldRelated.Crop;

import com.zipcodewilmington.froilansfarm.PersonRelated.Froilanda;
import com.zipcodewilmington.froilansfarm.PersonRelated.Pilot;

import java.util.ArrayList;

import static com.zipcodewilmington.froilansfarm.PersonRelated.Froilanda.*;

public class CropDuster extends Vehicle implements Aircraft {


    private boolean isFlying;
    private Vehicle vehicle;
    Aircraft aircraft = new CropDuster();

    public void fly() {
        if(isFlying = true)
            System.out.println("Cropduster is flying");
    }

    public String makeNoise() {

        return "CropDuster noise";

    }

    public boolean isFlying() {

        return isFlying;
    }

    public void fertilize(CropRow cropRow) {

        cropRow.fertilize();

    }
}
