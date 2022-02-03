package com.edgardev.structural.flyweight;

import java.util.HashMap;

public class EnemyFactory {
    private static HashMap<String, Enemy> enemies = new HashMap<>();

    public static Enemy getEnemy(String type) {
        Enemy enemy = null;
        if (enemies.containsKey(type)) {
            enemy = enemies.get(type);
        } else {
            switch (type) {
                case "Private":
                    System.out.println("Soldado ha sido creado");
                    enemy = new Private();
                    break;
                case "Detective":
                    System.out.println("Detective ha sido creado");
                    enemy = new Detective();
                    break;
                default:
                    System.out.println("No se ha creado enemigo");
            }
            enemies.put(type, enemy);
        }
        return enemy;
    }
}
