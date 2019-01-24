package org.academiadecodigo.bootcamp22.arabiannights;

public class HappyGenie extends Genie {

    public HappyGenie(int maxNumberOfWishes) {
        super(maxNumberOfWishes);
    }



    @Override
    public void wish() {
        if (getWishesGranted() < getMaxNumberOfWishes()) {
            super.wish();
            return;
        }

        System.out.println("No more wishes for you bitch!");
    }
}
