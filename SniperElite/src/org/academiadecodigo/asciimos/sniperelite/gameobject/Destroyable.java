package org.academiadecodigo.asciimos.sniperelite.gameobject;

public interface Destroyable {

    void hit(int damage);

    boolean isDestroyed();

}
