package com.zipcodewilmington.froilansfarm.WeekTest;

import com.zipcodewilmington.froilansfarm.AnimalStorage.Stable;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.FieldRelated.CornStalk;
import com.zipcodewilmington.froilansfarm.FieldRelated.Crop;
import com.zipcodewilmington.froilansfarm.PersonRelated.Farmer;
import com.zipcodewilmington.froilansfarm.PersonRelated.Froilanda;
import com.zipcodewilmington.froilansfarm.PersonRelated.Pilot;
import com.zipcodewilmington.froilansfarm.VehicleRelated.Aircraft;
import com.zipcodewilmington.froilansfarm.VehicleRelated.CropDuster;
import org.junit.Test;

public class Monday {



    protected Farmer froilan = new Farmer();
    protected Pilot pilotFroilanda = new Pilot();

    Edible edible1 = new EarCorn();
    Edible edible2 = new Tomato();
    Edible edible3 = new Egg();
    CropDuster cropDuster = new CropDuster();
    CropRow cropRow = new CropRow();
    Aircraft aircraft = new CropDuster();


    @Test
    public void fertilizeTest(){
        cropDuster.fertilize(cropRow);



    }


}
