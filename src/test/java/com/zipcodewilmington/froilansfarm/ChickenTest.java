package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {
    Chicken chicken;

    @Before
    public void setUp() throws Exception {
        chicken = new Chicken();
    }

    @Test
    public void makeNoise() {
        String expected = "chickenNoise";
        String actual = chicken.makeNoise();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void yield() {
    }

    @Test
    public void eat() {
    }
}