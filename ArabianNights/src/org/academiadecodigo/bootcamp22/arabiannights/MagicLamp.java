package org.academiadecodigo.bootcamp22.arabiannights;

public class MagicLamp {

    private int maxNumberOfGenies;
    private int remainingGenies;
    private int numberOfRecicles;

    public MagicLamp(int maxNumberOfGenies) {
        this.maxNumberOfGenies = maxNumberOfGenies;
        this.remainingGenies = maxNumberOfGenies;
    }

    public Genie rub() {

        if(remainingGenies == 0) {
            System.out.println("demon returned");
            this.remainingGenies--;
            return new RecyclableDemon(3);
        }


        if (remainingGenies > 0) {

            switch (remainingGenies % 2) {

                case 0:
                    System.out.println("happy returned");
                    remainingGenies--;
                    return new HappyGenie(3);
                default:
                    System.out.println("grunpy returned");
                    remainingGenies--;
                    return new GrumpyGenie(3);


            }

        }

        System.out.println("THAT DEMON IS THE LAST FKING THING U WILL GET OUT OF THIS LAMP");
        return null;

    }

    public void compareTo(MagicLamp lamp) {
        System.out.println("First lamp:");
        System.out.println("Capacity: " + this.maxNumberOfGenies);
        System.out.println("Genies Remaining: " + this.remainingGenies);
        System.out.println("Times recycled: " + this.numberOfRecicles);
        System.out.println("-----------------------------");
        System.out.println("Second lamp:");
        System.out.println("Capacity: " + lamp.maxNumberOfGenies);
        System.out.println("Genies Remaining: " + lamp.remainingGenies);
        System.out.println("Times recycled: " + lamp.numberOfRecicles);

    }

    public void reset(RecyclableDemon demon) {
        System.out.println("lamp recicled omgggggg");
        this.remainingGenies = this.maxNumberOfGenies;
        numberOfRecicles++;

    }

}
