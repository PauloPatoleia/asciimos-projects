package org.academiadecodigo.asciimos.sniperelite;

import org.academiadecodigo.asciimos.sniperelite.gameobject.Destroyable;

public class SniperRifle {

    private int bulletDamage;


    public SniperRifle(int bulletDamage) {
        this.bulletDamage = bulletDamage;
    }

    public void shoot(Destroyable obj) {

        obj.hit(Math.floor(Math.random()) > 0.5 ? 0 :  bulletDamage);

    }

}
