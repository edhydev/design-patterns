package com.edgardev.behavioral.visitor;

public class MainVisitor {
    public static void main(String[] args) {
        OfertaElement ofertaElement = new OfertaGasolina();
        ofertaElement.accept(new BlackCreditCardVisitor());

        ofertaElement = new OfertaVuelos();
        ofertaElement.accept(new ClassicCreditCardVisitor());

    }
}
