package com.zipcodewilmington.froilansfarm.VehicleRelated;

import com.zipcodewilmington.froilansfarm.FieldRelated.Crop;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TractorTest {



    @Test
    public void makeNoise() {
        Tractor tractor = new Tractor();
        String expected = "Aircraft noise";
        String actual = tractor.makeNoise();
        Assert.assertEquals(expected,actual);
    }
}