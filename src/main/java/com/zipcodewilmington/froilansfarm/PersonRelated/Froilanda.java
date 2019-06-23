package com.zipcodewilmington.froilansfarm.PersonRelated;

public class Froilanda extends Pilot  {

    private String name;
    private static Froilanda froilanda;

    public Froilanda() {
        name = "Froilanda";
    }

    public static Froilanda getInstance() {

        if(froilanda == null) {
            froilanda = new Froilanda();
        }
        return froilanda;
    }
}
