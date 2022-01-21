package com.edgardev.behavioral.command;

public class CreditCardDesactivateCommand implements Command {
    CreditCard creditCard;

    public CreditCardDesactivateCommand(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        this.creditCard.desactivate();
        this.creditCard.sendSMSToCustomerDesactivate();
    }
}
