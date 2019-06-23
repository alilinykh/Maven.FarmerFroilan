package com.zipcodewilmington.froilansfarm.VehicleRelated;

import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TractorTest {

    @Test
    public void makeNoise() {

        Tractor tractor = new Tractor();
        String expected = "Tractor noise";

        String actual = tractor.makeNoise();

        Assert.assertEquals(expected, actual);
    }


}