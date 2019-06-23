package com.zipcodewilmington.froilansfarm.VehicleRelated;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.FieldRelated.Crop;
import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;

import java.util.ArrayList;

public class Tractor extends Vehicle implements FarmVehicle {


    Crop crop = new Crop();
    Tractor tractor = new Tractor();

    public String makeNoise() {

        return "Tractor noise";
    }

    public void harvest(Crop crop) {


    }
}