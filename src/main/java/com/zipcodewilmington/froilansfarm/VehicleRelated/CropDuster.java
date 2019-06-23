package com.zipcodewilmington.froilansfarm.VehicleRelated;
import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;

public class CropDuster extends Vehicle implements Aircraft {

    private boolean isFlying;
    private Vehicle vehicle;
    //Aircraft aircraft = new CropDuster();

    public void fly() {
            if(isFlying = true)
                System.out.println("aircraft is flying");
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
