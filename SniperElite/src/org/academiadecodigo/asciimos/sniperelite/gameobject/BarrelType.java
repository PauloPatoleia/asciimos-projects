package org.academiadecodigo.asciimos.sniperelite.gameobject;

public enum BarrelType {

    PLASTIC(50),
    WOOD(100),
    METAL(200);

    private int maxDamage;

    BarrelType(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }
}
