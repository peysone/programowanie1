package dzienniczek.beta;

import ocenyZPrzedmiotow.Przedmiot;
import sun.security.ssl.HandshakeInStream;

public class Main {
    public static void main(String[] args) {
        Dzienniczek dzienniczek = new Dzienniczek();
//        System.out.println("Wstawiam ocenę z GEOGRAFIA: "
//                + dzienniczek.wstawOcene(Przedmiot.GEOGRAFIA, 4));
//        System.out.println("Wstawiam ocenę z MATEMATYKA: "
//                + dzienniczek.wstawOcene(Przedmiot.MATEMATYKA, 2));
//        System.out.println("Wstawiam ocenę z HISTORIA: "
//                + dzienniczek.wstawOcene(Przedmiot.HISTORIA, 4));
//        System.out.println("Wstawiam ocenę z WF: "
//                + dzienniczek.wstawOcene(Przedmiot.WF, 5));

        dzienniczek.wstawOcene(Przedmiot.GEOGRAFIA, 4);
        dzienniczek.wypisz();
        dzienniczek.wstawOcene(Przedmiot.MATEMATYKA, 2);
        dzienniczek.wypisz();
        dzienniczek.wstawOcene(Przedmiot.HISTORIA, 4);
        dzienniczek.wypisz();
        dzienniczek.wstawOcene(Przedmiot.WF, 5);
        dzienniczek.wypisz();
        System.out.println("---------------");
        System.out.println("POBIERANIE");
        System.out.println();
        try {
            System.out.println("udało się pobrać ocenę z historii: "
            + dzienniczek.odczytajOcene(Przedmiot.HISTORIA));
            System.out.println("Udało się pobrać ocenę z WF: "
            + dzienniczek.odczytajOcene(Przedmiot.PLASTYKA));
        } catch (BrakOcenyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---------------");
        System.out.println("POPRAWIANIE");
        System.out.println();
        try {
            System.out.println("udało się poprawić ocenę z matematyki: "
                    + dzienniczek.poprawOcene(Przedmiot.MATEMATYKA));
        } catch (BrakOcenyException e) {
            System.out.println(e.getMessage());
        }
    }
}
