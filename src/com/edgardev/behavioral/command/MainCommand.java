package com.edgardev.behavioral.command;

public class MainCommand {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        CreditCard creditCardDesactivateCommand = new CreditCard();

        CreditCardInvoker invoker = new CreditCardInvoker();
        invoker.setCommand(new CreditCardDesactivateCommand(creditCard));
        invoker.run();
        System.out.println("---------------------------------");

        invoker.setCommand(new CreditCardActivateCommand(creditCardDesactivateCommand));
        invoker.run();
    }
}
