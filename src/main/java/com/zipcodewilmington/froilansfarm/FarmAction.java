package com.zipcodewilmington.froilansfarm;

public class FarmAction {
    private static FarmAction INSTANCE;
    private Farm farm;

    public static FarmAction getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FarmAction();
        }
        return INSTANCE;
    }

    private FarmAction() {
        farm = new Farm();
        farm.creationDay();

    }
    public void monday() {

    }


}

