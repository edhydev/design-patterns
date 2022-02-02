package com.edgardev.structural.facade;

public class Gold implements Credit {
    @Override
    public void showCredit() {
        System.out.println("La tarjeta Gold tiene un Crédito de 5 000");
    }
}
