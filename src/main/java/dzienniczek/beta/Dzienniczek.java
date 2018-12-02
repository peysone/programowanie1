package dzienniczek.beta;

import ocenyZPrzedmiotow.Przedmiot;

import java.util.HashMap;
import java.util.Map;

public class Dzienniczek {

    private Map<Przedmiot, Integer> oceny = new HashMap<>();

    public boolean wstawOcene(Przedmiot przedmiot, int ocena) {
        if (oceny.get(przedmiot) == null) {
            oceny.put(przedmiot, ocena);
            return true;
        }
        return false;

//        return oceny.putIfAbsent(przedmiot, ocena)== NULL;
//          to samo co wyżej
    }

    public void wypisz() {
        System.out.println();
        System.out.println("Oceny w dzienniczku.");
        this.oceny.forEach(((przedmiot, ocena) -> System.out.println(przedmiot + " - " + ocena)));
    }

    public Integer odczytajOcene(Przedmiot przedmiot) throws BrakOcenyException {
        final Integer ocena = this.oceny.get(przedmiot);
        if (ocena == null) {
            throw new BrakOcenyException(przedmiot);
        }
        return ocena;
    }
    public Integer poprawOcene(Przedmiot przedmiot) throws BrakOcenyException {
        final Integer ocena = this.oceny.get(przedmiot);
        if (ocena == null){
            throw new BrakOcenyException(przedmiot);
        }
        final Integer poprawionaOcena = ocena +1;
        this.oceny.put(przedmiot, poprawionaOcena);
        return poprawionaOcena;
    }

}
