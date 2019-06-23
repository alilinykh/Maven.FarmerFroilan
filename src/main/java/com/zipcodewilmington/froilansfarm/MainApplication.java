package com.zipcodewilmington.froilansfarm;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.creationDay();

        FarmAction farmAction = FarmAction.getInstance();
        farmAction.monday();


    }
}

