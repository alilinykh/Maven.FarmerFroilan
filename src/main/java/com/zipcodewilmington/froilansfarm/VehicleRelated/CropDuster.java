package com.zipcodewilmington.froilansfarm.VehicleRelated;

import com.zipcodewilmington.froilansfarm.FieldRelated.Crop;
import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;
import com.zipcodewilmington.froilansfarm.Person;
import com.zipcodewilmington.froilansfarm.PersonRelated.Froilanda;
import com.zipcodewilmington.froilansfarm.PersonRelated.Pilot;

import java.util.ArrayList;

import static com.zipcodewilmington.froilansfarm.PersonRelated.Froilanda.*;

public class CropDuster extends Vehicle implements Aircraft, FarmVehicle {

    private Person pilot;
    private boolean isFlying;
    String person = "";
    private Vehicle vehicle;
    FarmVehicle farmVehicle = new CropDuster();
    Aircraft aircraft = new CropDuster();


    public void fly() {
        if(vehicle == farmVehicle && vehicle == aircraft) {
            isFlying = true;
        }
        System.out.println("Froilanda is flying");
    }

    public void fertilize(CropRow cropRow) {


    }

    public String makeNoise() {

        return "CropDuster noise";

    }

    public boolean isFlying() {

        return isFlying;
    }

    public void harvest(Crop crop) {


    }


}
