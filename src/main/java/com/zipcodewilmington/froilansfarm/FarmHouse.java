package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.PersonRelated.Person;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse {
    private List <Person> farmHouse = new ArrayList<>();

    public List<Person> getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(List<Person> farmHouse) {
        this.farmHouse = farmHouse;
    }


    public FarmHouse(List<Person> farmHouse) {
        this.farmHouse = farmHouse;
    }

    public void add(Person person){};
    public void remove(Person person){};
}
