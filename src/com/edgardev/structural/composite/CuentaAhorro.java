package com.edgardev.structural.composite;

public class CuentaAhorro implements CuentaComponent {
    private Double amount;
    private String name;

    public CuentaAhorro(Double amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void showAccountName() {
        System.out.println("Cueenta de ahorro: " + name);
    }

    @Override
    public Double getAmount() {
        return amount;
    }
}
