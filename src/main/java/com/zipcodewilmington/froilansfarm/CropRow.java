package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.FieldRelated.Crop;
import com.zipcodewilmington.froilansfarm.FieldRelated.Field;

import java.util.ArrayList;
import java.util.List;

public class CropRow extends Field {



    private Boolean hasBeenFertilized;
    private List<Crop> cropRow;


    public CropRow(){
        hasBeenFertilized=false;
        cropRow= new ArrayList<Crop>();
    }

    public void add(Crop crop){
        add(crop);
    }

    public List<Crop> getCropRow(){
        return cropRow;
    }

    public Integer count(){
        return cropRow.size();
    }

    public void fertilize() {
        hasBeenFertilized = true;
    }

    public void remove(Crop crop){
        remove(crop);
    }


    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }
}
