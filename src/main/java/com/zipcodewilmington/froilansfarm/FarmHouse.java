package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.PersonRelated.Person;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse {
    private List <Person> farmHouse;

    public FarmHouse() {
        farmHouse = new ArrayList<>();
    }

    public List<Person> getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(List<Person> farmHouse) {
        this.farmHouse = farmHouse;
    }


    public FarmHouse(List<Person> farmHouse) {
        this.farmHouse = farmHouse;
    }

    public void add(Person person){
        farmHouse.add(person);
    };
    public void remove(Person person){
        farmHouse.remove(person);
    };
    public Integer size(){
        return farmHouse.size();
    };

}
