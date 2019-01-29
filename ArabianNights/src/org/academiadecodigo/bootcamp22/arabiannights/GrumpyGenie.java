package org.academiadecodigo.bootcamp22.arabiannights;

public class GrumpyGenie extends Genie {

    public GrumpyGenie(int maxNumberOfWishes) {
        super(maxNumberOfWishes);
    }


    @Override
    public void wish() {
        if (getWishesGranted() < 1)
            super.wish();

        System.out.println("No more wishes for you bitch!");

        }

    public void kill() {
        System.out.println("U ARE DEAD");
    }
    }

