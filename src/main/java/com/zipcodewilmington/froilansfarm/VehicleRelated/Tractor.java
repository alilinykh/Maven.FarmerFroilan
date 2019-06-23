package com.zipcodewilmington.froilansfarm.VehicleRelated;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.FieldRelated.Crop;
import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;

import java.util.ArrayList;

public class Tractor extends Vehicle implements FarmVehicle {

    FarmVehicle farmVehicle = new Tractor();
    Vehicle vehicle = new Tractor();
    Tractor tractor = new Tractor();
    public void harvest(CropRow cropRow) {
        ArrayList<Crop> crops = cropRow.get();

    }

    public String makeNoise() {

        return "Tractor noise";



    }


    public void harvest(Crop crop) {

        if(vehicle== tractor && crop.isHasBeenFertilized()) {

            System.out.println("Tractor is harvesting");
        }

    }
}