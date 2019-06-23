package com.zipcodewilmington.froilansfarm.WeekTest;



import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;
import com.zipcodewilmington.froilansfarm.PersonRelated.Farmer;
import com.zipcodewilmington.froilansfarm.PersonRelated.Pilot;
import com.zipcodewilmington.froilansfarm.VehicleRelated.Aircraft;
import com.zipcodewilmington.froilansfarm.VehicleRelated.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class Monday {



    protected Farmer froilan = new Farmer();
    protected Pilot pilotFroilanda = new Pilot();


    CropDuster cropDuster = new CropDuster();
    CropRow cropRow = new CropRow();
    Aircraft aircraft = new CropDuster();


    @Test
    public void fertilizeTest(){
        cropDuster.fertilize(cropRow);
        Boolean expected = true;
        Boolean actual = cropRow.getHasBeenFertilized();
        Assert.assertEquals(expected, actual);


    }
    @Test
    public void harvestTest(){

    }


}
