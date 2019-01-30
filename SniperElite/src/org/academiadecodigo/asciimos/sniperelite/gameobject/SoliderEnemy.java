package org.academiadecodigo.asciimos.sniperelite.gameobject;

import org.academiadecodigo.asciimos.sniperelite.gameobject.Enemy;

public class SoliderEnemy extends Enemy {

    public SoliderEnemy(int health) {
        super(health);
    }

    // TODO: 30/01/2019 nao precisa de override to invoke so o super
    @Override
    public void hit(int hit) {
        super.hit(hit);
    }
}
