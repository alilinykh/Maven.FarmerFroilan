package com.zipcodewilmington.froilansfarm.FieldRelated;

import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.Edibles.Potato;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.Produce;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PotatoPlantTest {
    Basket PotatoBasket;
    TomatoPlant PotatoPlant;


    @Before
    public void setUp() throws Exception {
        PotatoBasket = new Basket<Tomato>();
        PotatoPlant = new TomatoPlant();
    }

    @Test
    public void yieldTest() {
        //tomatoBasket.add(tomato);
        Integer expected = 1;
        PotatoBasket.add(PotatoPlant.yield());
        Integer actual = PotatoBasket.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void InheritanceTest() {
        Assert.assertTrue(PotatoPlant instanceof Crop);
    }

    @Test
    public void ImplementantationTest() {
        Assert.assertTrue(PotatoPlant instanceof Produce);
    }
}