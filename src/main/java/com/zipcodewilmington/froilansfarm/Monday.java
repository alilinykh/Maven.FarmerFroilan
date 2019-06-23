package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.AnimalStorage.Stable;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.FieldRelated.CornStalk;
import com.zipcodewilmington.froilansfarm.FieldRelated.Crop;
import com.zipcodewilmington.froilansfarm.PersonRelated.Froilanda;
import com.zipcodewilmington.froilansfarm.PersonRelated.Pilot;
import com.zipcodewilmington.froilansfarm.VehicleRelated.Aircraft;
import com.zipcodewilmington.froilansfarm.VehicleRelated.CropDuster;

public abstract class Monday {



    protected Farmer froilan = new Farmer();
    protected Pilot pilot = new Pilot();
    Froilanda froilanda = new Froilanda();
    Edible edible1 = new EarCorn();
    Edible edible2 = new Tomato();
    Edible edible3 = new Egg();
    CropDuster cropDuster = new CropDuster();
    CropRow cropRow = new CropRow();
    Aircraft aircraft = new CropDuster();
    public abstract void run();

    public void haveBreakFast(){

        froilandaEatBreakfast();
        froilanEatBreakfast();

    }

    private void flyAndFertilize(){
        froilanda.fly(aircraft);
        cropDuster.fertilize(cropRow);

    }
    public void froilanEatBreakfast() {
        froilan.eat(edible1);
        froilan.eat(edible2);
        froilan.eat(edible3);

    }
    private void froilandaEatBreakfast() {

        froilanda.eat(edible1);
        froilanda.eat(edible2);
        froilanda.eat(edible3);

    }

}
