package com.edgardev.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Card card = Card.getINSTANCE();
        card.setCardNumber("0000 0000 0000 VISA");

        System.out.println("Tarjeta con número: " + card.getCardNumber());
    }
}
