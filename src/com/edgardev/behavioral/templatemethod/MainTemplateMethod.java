package com.edgardev.behavioral.templatemethod;

public class MainTemplateMethod {
    public static void main(String[] args) {
        Payment payment = new Paypal();
        payment.makePayment();

        payment = new Visa();
        payment.makePayment();
    }
}
