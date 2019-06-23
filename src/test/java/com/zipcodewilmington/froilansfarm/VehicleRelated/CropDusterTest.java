package com.zipcodewilmington.froilansfarm.VehicleRelated;

import com.zipcodewilmington.froilansfarm.Farmer;
import com.zipcodewilmington.froilansfarm.FieldRelated.CornStalk;
import com.zipcodewilmington.froilansfarm.FieldRelated.Crop;
import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;
import com.zipcodewilmington.froilansfarm.FieldRelated.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Person;
import com.zipcodewilmington.froilansfarm.PersonRelated.Froilanda;
import com.zipcodewilmington.froilansfarm.PersonRelated.Pilot;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CropDusterTest {

    @Test
    public void fly() {
        //Given
        Farmer farmer = new Farmer();
        CropDuster cropDuster = new CropDuster();
        Froilanda froilanda = Froilanda.getInstance();
        farmer.mount(cropDuster);

        //When
        boolean actual = cropDuster.isFlying();
        //Then
        Assert.assertTrue(actual);

    }

    @Test
    public void fertilize() {
        //Given
        CropDuster cropDuster = new CropDuster();
        CropRow cropRow = new CropRow();
        Crop constalk = new CornStalk();
        Crop tomato = new TomatoPlant();

        //When
        cropDuster.fertilize(cropRow);
        Boolean actual1 = false;
        actual1 = constalk.isHasBeenFertilized();
        Boolean actual2 = false;
        actual2 = tomato.isHasBeenFertilized();
        //Then
        Assert.assertTrue(actual1);
        Assert.assertTrue(actual2);


    }

    @Test
    public void makeNoise() {
        CropDuster cropDuster = new CropDuster();
        String expected = "CropDuster noise";
        String actual = cropDuster.makeNoise();
        Assert.assertEquals(expected,actual);
    }
}