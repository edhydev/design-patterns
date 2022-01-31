package com.edgardev.behavioral.visitor;

public class BlackCreditCardVisitor implements CreditCardVisitor {
    @Override
    public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
        System.out.println("Descuento del  6% en Gasolina con tu tarjeta Black");
    }

    @Override
    public void ofertaVuelos(OfertaVuelos ofertaVuelos) {
        System.out.println("Descuento del  12% en Gasolina con tu tarjeta Black");
    }
}
