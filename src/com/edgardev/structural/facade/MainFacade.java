package com.edgardev.structural.facade;

public class MainFacade {
    public static void main(String[] args) {
        CreditMarket creditMarket = new CreditMarket();
        creditMarket.showCreditGold();
        creditMarket.showCreditSilver();
        creditMarket.showCreditBlack();
    }
}
