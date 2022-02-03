package com.edgardev.structural.flyweight;

import java.util.Random;

public class MainFlyweight {
    private static String[] enemyType = {"Private", "Detective"};
    private static String[] weapon = {"Fusil", "Revolver", "Pistola", "Metralleta", "Lanza Granadas", "9mm"};

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            Enemy enemy = EnemyFactory.getEnemy(getRandomEnemyType());
            enemy.setWeapon(getRandomWeapon());
            enemy.lifePoints();
        }
    }

    private static String getRandomEnemyType() {
        Random r = new Random();
        int randInt = r.nextInt(enemyType.length);
        return enemyType[randInt];
    }

    private static String getRandomWeapon() {
        Random r = new Random();
        int randInt = r.nextInt(weapon.length);
        return weapon[randInt];
    }
}
