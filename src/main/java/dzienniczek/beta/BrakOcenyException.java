package dzienniczek.beta;

import ocenyZPrzedmiotow.Przedmiot;

public class BrakOcenyException extends Exception{

    private Przedmiot przedmiot;
    public BrakOcenyException(Przedmiot przedmiot){
        this.przedmiot = przedmiot;
    }

    @Override
    public String getMessage(){
        return "Brak oceny z przedmiotu: " + przedmiot;
    }
}
