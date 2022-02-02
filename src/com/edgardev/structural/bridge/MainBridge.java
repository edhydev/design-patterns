package com.edgardev.structural.bridge;

public class MainBridge {
    public static void main(String[] args) {
        CreditCard classic = new ClassicCreditCard(new UnsecureCreditCard());
        classic.realizarPago();

        classic = new ClassicCreditCard(new SecureCreditCard());
        classic.realizarPago();
    }
}
