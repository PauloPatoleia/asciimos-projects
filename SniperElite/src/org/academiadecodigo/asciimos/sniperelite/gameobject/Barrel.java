package org.academiadecodigo.asciimos.sniperelite.gameobject;

public class Barrel extends GameObject implements Destroyable {

    private int currentDamage;
    private boolean destroyed;
    private BarrelType barrelType;

    public Barrel(BarrelType barrelType) {
        this.barrelType = barrelType;
    }

    @Override
    public void hit(int damage) {
        this.currentDamage += damage;

        if (currentDamage >= barrelType.getMaxDamage()) {
            this.destroyed = true;
        }
    }

    public boolean isDestroyed() {
        return this.destroyed;
    }

    public String getMessage() {
        return null;
    }
}
