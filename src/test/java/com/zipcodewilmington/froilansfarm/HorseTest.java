package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.Baskets.CornBasket;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.PersonRelated.Farmer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {
    Horse horse;
    Basket cornBasket;
    EarCorn earCorn;
    Farmer farmer;


    @Before
    public void setUp() throws Exception {
        horse = new Horse();
        cornBasket = new Basket();
        earCorn = new EarCorn();
        farmer = new Farmer();
    }

    @Test
    public void mount() {
        horse.mount();
        Assert.assertTrue(horse.getReadyToBeRidden());
    }

    @Test
    public void dismount() {
        horse.dismount();
        Assert.assertFalse(horse.getReadyToBeRidden());
    }

    @Test
    public void makeNoise() {
        String expected = "chickenNoise";
        String actual = horse.makeNoise();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eat() {
//         see how much corn in the basket
        Integer expected = cornBasket.size() - 3;
        horse.eat(earCorn);
        Integer actual = cornBasket.size();

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