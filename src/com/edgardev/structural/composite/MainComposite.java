package com.edgardev.structural.composite;

public class MainComposite {
    public static void main(String[] args) {
        CuentaComponent cuentaCorriente = new CuentaCorriente(1000.0, "Edgar");
        CuentaComponent cuentaAhorro = new CuentaAhorro(20000.0, "Edgar");

        CuentaComposite cuentaComposite = new CuentaComposite();
        cuentaComposite.addAccount(cuentaCorriente);
        cuentaComposite.addAccount(cuentaAhorro);

        cuentaComposite.showAccountName();
        cuentaComposite.getAmount();
    }
}
