package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.AnimalStorage.AnimalStorage;
import com.zipcodewilmington.froilansfarm.AnimalStorage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.AnimalStorage.Stable;
import com.zipcodewilmington.froilansfarm.FieldRelated.Field;

public class Farm {
    //coops
    private AnimalStorage chickenCoop1 = new AnimalStorage<Chicken>();
    private AnimalStorage chickenCoop2 = new AnimalStorage<Chicken>();
    private AnimalStorage chickenCoop3 = new AnimalStorage<Chicken>();
    private AnimalStorage chickenCoop4 = new AnimalStorage<Chicken>();
    //stable
    private AnimalStorage stable1 = new AnimalStorage<Horse>();
    private AnimalStorage stable2 = new AnimalStorage<Horse>();
    private AnimalStorage stable3 = new AnimalStorage<Horse>();
    private FarmHouse farmhouse;
    private Field field;

    public Farm() {
    }

    public void creationDay() {
        fillChickenCoop();
        fillStables();
    }


    private void fillChickenCoop () {
        for (int i = 0; i <4 ; i++) {
            chickenCoop1.add(new Chicken());
            chickenCoop2.add(new Chicken());
            chickenCoop3.add(new Chicken());
            chickenCoop4.add(new Chicken());
        }
    }
    private void fillStables() {
        for (int i = 0; i < 3; i++) {
            stable1.add(new Horse());
            stable2.add(new Horse());
            stable3.add(new Horse());

        }
    }

}

