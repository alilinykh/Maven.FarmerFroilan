package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Baskets.CornBasket;
import com.zipcodewilmington.froilansfarm.Baskets.EggBasket;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {
    Chicken chicken;
    CornBasket cornBasket;
    EarCorn earCorn;
    EggBasket eggBasket;


    @Before
    public void setUp() throws Exception {
        chicken = new Chicken();
        cornBasket = new CornBasket();
        earCorn = new EarCorn();
        eggBasket = new EggBasket();

    }

    @Test
    public void makeNoise() {
        String expected = "chickenNoise";
        String actual = chicken.makeNoise();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void makeNoise1() {
        String expected = "wrongNoise";
        String actual = chicken.makeNoise();
        Assert.assertFalse(expected.equals(actual));
    }

    @Test
    public void yield() {
//        Integer expected = eggBasket.size() + 1;
//        chicken.yield();
//        Integer actual = eggBasket.size();
//
//        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eat() {
        // see how much corn in the basket
        //Integer expected = cornBasket.size() - 1;
        //chicken.eat(cornBasket.get(earCorn));
        //Integer actual = cornBasket.size();

        //Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {
        Assert.assertTrue(chicken instanceof Animal);
    }

    @Test
    public void testImplementation() {
        Assert.assertTrue(chicken instanceof Produce);

    }
}