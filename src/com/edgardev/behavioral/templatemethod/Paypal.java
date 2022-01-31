package com.edgardev.behavioral.templatemethod;

public class Paypal extends Payment {
    @Override
    void initialize() {
        System.out.println("Inicializando el pago con Paypal...");
    }

    @Override
    void startPayment() {
        System.out.println("Realizando el pago con Paypal....");
    }

    @Override
    void endPayment() {
        System.out.println("Finalizando el pago a través de los servidores Paypal...");
    }
}
