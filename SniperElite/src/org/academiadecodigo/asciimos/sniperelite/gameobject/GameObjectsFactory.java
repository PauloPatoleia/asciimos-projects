package org.academiadecodigo.asciimos.sniperelite.gameobject;

public class GameObjectsFactory {


    // TODO: 30/01/2019 make this a ENUM, yes, an enum :(
    public static GameObject getGameObject() {

       int randomPick = (int) Math.floor(Math.random() * 4);

        switch (randomPick) {

            case 0:
                return new ArmouredEnemy(100, 100);
            case 1:
                return new SoliderEnemy(100);
            case 2:
                BarrelType type = BarrelType.values()[(int) Math.floor(Math.random() * BarrelType.values().length)];
                return new Barrel(type);
            case 3:
                return new Tree();
             default:
                 return null;

        }
    }
}
