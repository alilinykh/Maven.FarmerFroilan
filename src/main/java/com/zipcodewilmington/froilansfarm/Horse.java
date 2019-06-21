package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;

public class Horse extends Animal implements Ridable {
    boolean isReadyToBeRidden = false;

    public boolean getReadyToBeRidden() {
        return isReadyToBeRidden;
    }

    public void setReadyToBeRidden(boolean readyToBeRidden) {
        isReadyToBeRidden = readyToBeRidden;
    }


    public void mount() {

    }

    public void dismount() {

    }

    public String makeNoise() {
        return null;

    }

    public void eat(Edible edible) {

    }

}
