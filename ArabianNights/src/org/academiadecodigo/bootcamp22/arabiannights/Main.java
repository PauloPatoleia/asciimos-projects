package org.academiadecodigo.bootcamp22.arabiannights;

public class Main {

    public static void main(String[] args) {

        MagicLamp lamp = new MagicLamp(3);

        Genie gudGenie = lamp.rub();
        gudGenie.wish();
        gudGenie.wish();
        gudGenie.wish();
        gudGenie.wish();
        gudGenie.wish();
        Genie gudGenie2 = lamp.rub();
        gudGenie2.wish();
        gudGenie2.wish();
        gudGenie2.wish();
        gudGenie2.wish();
        gudGenie2.wish();
        gudGenie2.wish();
        Genie gudGenie3 = lamp.rub();
        gudGenie3.wish();
        gudGenie3.wish();
        gudGenie3.wish();
        gudGenie3.wish();
        gudGenie3.wish();
        gudGenie3.wish();
        gudGenie3.wish();

        Genie gudGenie4 = lamp.rub();
        gudGenie4.wish();
        gudGenie4.wish();
        gudGenie4.wish();

        lamp.reset((RecyclableDemon) gudGenie4);

        Genie gudGenie7= lamp.rub();
        gudGenie7.wish();
        gudGenie7.wish();
        gudGenie7.wish();
        gudGenie7.wish();
        gudGenie7.wish();
        gudGenie7.wish();
        gudGenie7.wish();

        Genie gudGenie9= lamp.rub();
        gudGenie9.wish();
        gudGenie9.wish();
        gudGenie9.wish();
        gudGenie9.wish();
        gudGenie9.wish();
        gudGenie9.wish();
        gudGenie9.wish();

        MagicLamp lamp2 = new MagicLamp(3);
        Genie gudGenie11 = lamp2.rub();
        gudGenie11.wish();
        gudGenie11.wish();
        gudGenie11.wish();
        gudGenie11.wish();


        lamp.compareTo(lamp2);
    }
}
