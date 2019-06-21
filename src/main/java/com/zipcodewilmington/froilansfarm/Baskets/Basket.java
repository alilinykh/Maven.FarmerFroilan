package com.zipcodewilmington.froilansfarm.Baskets;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;

import java.util.ArrayList;

public class Basket <T extends Edible> implements Edible {
    ArrayList<T> list;


}
