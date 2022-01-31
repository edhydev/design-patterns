package com.edgardev.behavioral.visitor;

public interface OfertaElement {
    void accept(CreditCardVisitor visitor);
}
