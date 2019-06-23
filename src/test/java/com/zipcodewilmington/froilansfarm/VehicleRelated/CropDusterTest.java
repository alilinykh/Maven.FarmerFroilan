package com.zipcodewilmington.froilansfarm.VehicleRelated;

import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropDusterTest {

    @Test
    public void fly() {

    }

    @Test
    public void makeNoise() {
        CropDuster cropDuster = new CropDuster();
        String expected = "CropDuster noise";

        String actual = cropDuster.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isFlying() {

    }

    @Test
    public void fertilize() {
        CropDuster cropDuster = new CropDuster();
        CropRow cropRow = new CropRow();
        cropDuster.fertilize(cropRow);
        Boolean expected = true;
        Boolean actual = cropRow.getHasBeenFertilized();
        Assert.assertEquals(expected, actual);
    }
}