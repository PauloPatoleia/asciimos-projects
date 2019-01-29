package org.academiadecodigo.bootcamp22.arabiannights;

public class Genie {

    private int maxNumberOfWishes;
    private int wishesGranted;

    public Genie(int maxNumberOfWishes) {
        this.maxNumberOfWishes = maxNumberOfWishes;
        this.wishesGranted = 0;
    }

    public void wish() {
        System.out.println("You wish has been granted!");
        wishesGranted++;
        System.out.println(wishesGranted);}



    public int getMaxNumberOfWishes() {
        return maxNumberOfWishes;
    }

    public int getWishesGranted() {
        return wishesGranted;
    }

}
