package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop implements Produce<EarCorn>{
    public EarCorn yield() {

        return new EarCorn();
    }
}
