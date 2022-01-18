package com.edgardev.creational.factorymethod;

public class CardPayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pagando con Tarjeta de credito");
    }
}
