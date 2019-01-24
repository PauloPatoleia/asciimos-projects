package org.academiadecodigo.bootcamp22.arabiannights;

public class RecyclableDemon extends Genie {

    public boolean alive = true;

    public RecyclableDemon(int maxNumberOfWishes) {

        super(maxNumberOfWishes);
    }

    @Override
    public void wish() {
        if(alive)
        super.wish();
    }

    public void suicide() {
        this.alive = false;
    }
}
