package com.zipcodewilmington.froilansfarm;


import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import com.zipcodewilmington.froilansfarm.AnimalStorage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.AnimalStorage.Stable;
import com.zipcodewilmington.froilansfarm.FieldRelated.Field;
import com.zipcodewilmington.froilansfarm.PersonRelated.Froilanda;

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
