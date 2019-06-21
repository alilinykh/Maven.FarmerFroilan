package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;

public class Chicken extends Animal implements Produce<Egg> {
    private boolean hasBeenFertilized;

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public String makeNoise() {
        return "chickenNoise";
    }

    public Egg yield() {
        return new Egg();
    }

    public void eat(Edible edible) {

    }
}
