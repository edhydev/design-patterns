package com.edgardev.structural.bridge;

public class ClassicCreditCard extends CreditCard {
    public ClassicCreditCard(ICreditCard tarjeta) {
        super(tarjeta);
    }

    @Override
    public void realizarPago() {
        this.tarjeta.realizarPago();
    }
}
