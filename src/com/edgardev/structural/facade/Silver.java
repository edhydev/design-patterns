package com.edgardev.structural.facade;

public class Silver implements Credit {
    @Override
    public void showCredit() {
        System.out.println("La tarjeta Silver tiene un Crédito de 200 000");
    }
}
