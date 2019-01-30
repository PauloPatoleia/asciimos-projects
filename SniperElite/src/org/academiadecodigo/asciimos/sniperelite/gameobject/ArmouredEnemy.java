package org.academiadecodigo.asciimos.sniperelite.gameobject;

public class ArmouredEnemy extends Enemy {

    private int armour;

    public ArmouredEnemy(int health, int armour) {
        super(health);
        this.armour = armour;
    }

    @Override
    public void hit(int hit) {

        if(armour >= hit) {
            armour -= hit;
            return;
        }

        hit -= armour;
        armour -= armour;
// TODO: 30/01/2019 usar math.abs para isto
        super.hit(hit);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
