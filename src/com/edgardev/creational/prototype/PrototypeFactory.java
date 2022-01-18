package com.edgardev.creational.prototype;

import java.util.HashMap;
import java.util.Map;

import static com.edgardev.creational.prototype.PrototypeFactory.CardType.AMEX;
import static com.edgardev.creational.prototype.PrototypeFactory.CardType.VISA;

public class PrototypeFactory {
    public static class CardType {
        public static final String VISA = "VISA";
        public static final String AMEX = "AMEX";
    }

    private static Map<String, PrototypeCard> prototypes = new HashMap<>();

    public static PrototypeCard getInstance(final String type) throws CloneNotSupportedException {
        return prototypes.get(type).clone();
    }

    public static void loadCard() {
        Visa visa = new Visa();
        visa.setName("Lorenza");
        prototypes.put(VISA, visa);

        Amex amex = new Amex();
        visa.setName("Canelo");
        prototypes.put(AMEX, amex);
    }
}
