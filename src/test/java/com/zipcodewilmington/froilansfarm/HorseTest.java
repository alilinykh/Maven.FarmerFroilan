package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {
    Horse horse;

    @Before
    public void setUp() throws Exception {
        horse = new Horse();
    }

    @Test
    public void mount() {

    }

    @Test
    public void dismount() {
    }

    @Test
    public void makeNoise() {
        String expected = "chickenNoise";
        String actual = horse.makeNoise();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eat() {
        // see how much corn in the basket
        //Integer expected = cornBasket.size() - 3;
        //horse.eat(cornBasket.get(earCorn));
        //Integer actual = cornBasket.size();

        //Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInheritance() {
        Assert.assertTrue(horse instanceof Animal);
    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(horse instanceof Ridable);

    }

}