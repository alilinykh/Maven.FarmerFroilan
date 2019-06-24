package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.FieldRelated.*;

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
        farm.getFroilan().ride(farm.getTractor());
        Integer counter = 0;
        for (CropRow row: farm.getCropRows()
             ) {
            if (row.getCrop().getClass().equals(CornStalk.class)) {
                farm.getTractor().harvest(row, farm.getCornBasket());
                System.out.println("harvested some corn!");
            } else if (row.getCrop().getClass().equals(PotatoPlant.class)) {
                farm.getTractor().harvest(row, farm.getPotatoBasket());
                System.out.println("harvested some potatoes!");
            } else if (row.getCrop().getClass().equals(TomatoPlant.class)) {
                farm.getTractor().harvest(row, farm.getTomatoBasket());
                System.out.println("harvested some tomatoes!");
            }
        }
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
