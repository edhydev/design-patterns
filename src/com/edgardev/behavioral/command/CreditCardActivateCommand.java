package com.edgardev.behavioral.command;

public class CreditCardActivateCommand implements Command {
    CreditCard creditCard;

    public CreditCardActivateCommand(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        this.creditCard.sendPinNumberToCustomer();
        this.creditCard.activate();
        this.creditCard.sendSMSToCustomerActivated();
    }
}
