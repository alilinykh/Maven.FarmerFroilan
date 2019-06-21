package com.zipcodewilmington.froilansfarm.Baskets;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class CornBasketTest {

    @Before
    public void setUp() throws Exception {
    }

    public void addTest(){
        EarCorn corn = new EarCorn();
        CornBasket basket = new Basket<CornBasket>;
        basket.add(corn);
        Integer answer = basket.size();
        Integer expected = 1;
        

    }

    @After
    public void tearDown() throws Exception {
    }
}