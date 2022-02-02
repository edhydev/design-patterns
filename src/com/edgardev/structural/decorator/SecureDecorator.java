package com.edgardev.structural.decorator;

public class SecureDecorator extends CreditDecorator {
    public SecureDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        super.showCredit();
        configureSecureConfig();
    }

    private void configureSecureConfig() {
        System.out.println("La tarjeta ha sido configurada con seguridad máxima");
    }
}
