package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.AnimalStorage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.AnimalStorage.Stable;
import com.zipcodewilmington.froilansfarm.FieldRelated.Field;

public class Farm {

    private static Farm INSTANCE = null;
    private Stable stable;
    private ChickenCoop chickenCoop;
    private FarmHouse farmhouse;
    private Field field;

    public static Farm getINSTANCE() {
        return INSTANCE;
    }

    public FarmHouse getFarmhouse() {
        return farmhouse;
    }


//    public static Farm getInstanceOf() {
//
//        if(INSTANCE  == null) {
//            INSTANCE= new Farm();
//        }
//        return INSTANCE;
//    }

//   public FarmHouse getFarmhouse(){
//        return farmhouse;
//   }
}
