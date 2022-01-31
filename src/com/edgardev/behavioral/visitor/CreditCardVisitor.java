package com.edgardev.behavioral.visitor;

public interface CreditCardVisitor {
    void ofertaGasolina(OfertaGasolina ofertaGasolina);

    void ofertaVuelos(OfertaVuelos ofertaVuelos);
}
