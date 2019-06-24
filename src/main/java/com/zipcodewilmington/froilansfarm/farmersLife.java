package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.FieldRelated.CornStalk;
import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;
import com.zipcodewilmington.froilansfarm.FieldRelated.PotatoPlant;
import com.zipcodewilmington.froilansfarm.FieldRelated.TomatoPlant;
import com.zipcodewilmington.froilansfarm.VehicleRelated.CropDuster;

public class farmersLife {
    private Farm farm = new Farm();


    public void sunday() {
        System.out.println("Its sunday!");
        farm.everyday();


        farm.getFroilan().plants(new CornStalk(), farm.getField().getCropRows().get(0),5);
        farm.getFroilan().plants(new PotatoPlant(),farm.getField().getCropRows().get(1),5);
        farm.getFroilan().plants(new TomatoPlant(),farm.getField().getCropRows().get(2),5);
    }

    public void monday() {
        farm.everyday();
        farm.getFroilanda().fly(farm.getCropDuster());
        for (int i = 0; i <farm.cropRows.size(); i++) {
            System.out.println("Row "+ (i+1) + ":" );
            farm.getCropDuster().fertilize(farm.cropRows.get(i));

        }
        //cropDuster
    }
    public void tuesday() {
        farm.everyday();
        //tractor harvest
    }
    public void wednesday() {
        farm.everyday();
    }
    public void thursday() {
        farm.everyday();
    }
    public void friday() {
        farm.everyday();
    }
    public void saturday() {
        farm.everyday();
    }


}
