package com.zipcodewilmington.froilansfarm.VehicleRelated;

import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;

public class CropDuster extends Vehicle implements Aircraft {
    public Boolean fly() {
        return true;
    }
    public void fertilize(CropRow cropRow) {

    }

    public String makeNoise() {
        return "vooooom";

    }
}
