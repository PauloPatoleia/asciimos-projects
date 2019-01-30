package org.academiadecodigo.asciimos.sniperelite.gameobject;

public abstract class Enemy extends GameObject implements Destroyable {

    private int health;
    private boolean dead;

    public Enemy(int health) {
        this.health = health;
        this.dead = false;
    }

    @Override
    public void hit(int damage) {
        this.health -= damage;

        if (this.health <= 0) {
            this.dead = true;
        }
    }

    @Override
    public boolean isDestroyed() {
        return this.dead;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
