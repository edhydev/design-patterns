package com.edgardev.behavioral.strategy;

public class MainStrategy {
    public static void main(String[] args) {
        Context context = new Context(new CapitalStrategyTextFormatter());
        context.publishText("Texto que sera convertido a MAYUSCULAS a traves del algoritmo");

        context = new Context(new LowerStrategyTextFormatter());
        context.publishText("texto que SERA CONVERTIDO A MINUSCULAS a traves del algoritmo");
    }
}
