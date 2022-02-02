package com.edgardev.structural.decorator;

public class InternatinalPaymentDecorator extends CreditDecorator {
    public InternatinalPaymentDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        super.showCredit();
        configInternationalPayment();
    }

    private void configInternationalPayment() {
        System.out.println("La tarjeta ha sido configurada para hacer pagos internacionales");
    }
}
