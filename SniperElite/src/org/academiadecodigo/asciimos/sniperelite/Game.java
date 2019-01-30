package org.academiadecodigo.asciimos.sniperelite;

import org.academiadecodigo.asciimos.sniperelite.gameobject.Destroyable;
import org.academiadecodigo.asciimos.sniperelite.gameobject.GameObject;
import org.academiadecodigo.asciimos.sniperelite.gameobject.GameObjectsFactory;

public class Game {

    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;
    private int shotsFired;

    public Game(int numberOfObjects, int sniperDamage) {
        this.sniperRifle = new SniperRifle(sniperDamage);
        createObjects(numberOfObjects);
    }

    public void start() {

        for (int i = 0; i < gameObjects.length; i++) {

            if(gameObjects[i] instanceof Destroyable) {

                Destroyable obj = (Destroyable) gameObjects[i];

                while(!obj.isDestroyed()) {
                    sniperRifle.shoot(obj);
                    shotsFired++;
                }

            }
        }

        System.out.println(shotsFired + " bullets wasted on those infidels.");
    }

    private void createObjects(int number) {
// TODO: 30/01/2019 inicializar o array no construtor
        this.gameObjects = new GameObject[number];

        for (int i = 0; i < gameObjects.length; i++) {

            gameObjects[i] = GameObjectsFactory.getGameObject();

        }
    }
}
