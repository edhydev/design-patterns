package com.edgardev.structural.decorator;

public class MainDecorator {
    public static void main(String[] args) {
        Credit gold = new Gold();
        Credit blackInternationalPayment = new Black();
        blackInternationalPayment = new InternatinalPaymentDecorator(blackInternationalPayment);

        Credit goldSecureInternational = new Gold();
        goldSecureInternational = new InternatinalPaymentDecorator(goldSecureInternational);
        goldSecureInternational = new SecureDecorator(goldSecureInternational);

        System.out.println("----- Tarjeta Gold con configuración -----");
        blackInternationalPayment.showCredit();

        System.out.println("----- Tarjeta Black con configuración -----");
        gold.showCredit();

        System.out.println("----- Tarjeta Gold2 con configuración -----");
        goldSecureInternational.showCredit();
    }
}
