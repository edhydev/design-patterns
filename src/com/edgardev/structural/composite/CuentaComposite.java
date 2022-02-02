package com.edgardev.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CuentaComposite implements CuentaComponent {
    List<CuentaComponent> childAccounts;

    public CuentaComposite() {
        this.childAccounts = new ArrayList<>();
    }

    @Override
    public void showAccountName() {
        for (CuentaComponent account : childAccounts) {
            account.showAccountName();
        }
    }

    @Override
    public Double getAmount() {
        Double totalAmount = 0.0;
        for (CuentaComponent account : childAccounts) {
            totalAmount += account.getAmount();
        }
        System.out.println("La cantidad de dinero es: " + totalAmount);
        return totalAmount;
    }

    public void addAccount(CuentaComponent account) {
        childAccounts.add(account);
    }

    public void removeAccount(CuentaComponent account) {
        childAccounts.remove(account);
    }
}
