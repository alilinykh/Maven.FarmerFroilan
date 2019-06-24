package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.FieldRelated.CornStalk;
import com.zipcodewilmington.froilansfarm.FieldRelated.PotatoPlant;
import com.zipcodewilmington.froilansfarm.FieldRelated.TomatoPlant;

public class farmersLife {
    private Farm farm = new Farm();


    public void sunday() {
        System.out.println("Its sunday!");
        farm.everyday();
        System.out.println("num of eggs " + farm.getEggBasket().size());
        System.out.println("num of corn " + farm.getCornBasket().size());
        System.out.println("num of potato " + farm.getPotatoBasket().size());
        System.out.println("num of tomato " + farm.getTomatoBasket().size());

        farm.getFroilan().plants(new CornStalk(), farm.getField().getCropRows().get(0),5);
        farm.getFroilan().plants(new PotatoPlant(),farm.getField().getCropRows().get(1),5);
        farm.getFroilan().plants(new TomatoPlant(),farm.getField().getCropRows().get(2),5);
    }

    public void monday() {
        farm.everyday();
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
