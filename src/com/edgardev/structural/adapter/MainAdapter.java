package com.edgardev.structural.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.pay("classic");
        creditCard.pay("gold");
        creditCard.pay("black");
        creditCard.pay("silver");
    }
}
