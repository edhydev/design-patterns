package com.edgardev.structural.adapter;

public class GoldCreditCard implements Secure {
    @Override
    public void payWithSecureLevelA() {
        //no implementar
    }

    @Override
    public void payWithSecureLevelZ() {
        System.out.println("Tarjeta Gol: Pagando con seguridad BAJA nivel Z");
    }
}
