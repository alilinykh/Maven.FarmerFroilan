package com.zipcodewilmington.froilansfarm.FieldRelated;

public class Crop {

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public void fertilize(){
        hasBeenFertilized = true;
    }
    public boolean isHasBeenFertilized(){
        return  hasBeenFertilized;
    }
    public boolean isHasBeenHarvested(){
        return hasBeenHarvested;
    }
}
