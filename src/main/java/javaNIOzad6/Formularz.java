package javaNIOzad6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Formularz implements FormularzI {

    private List<String> odpowiedz = new ArrayList<>();

    public void dodajOdpowiedz(String odpowiedz) {
        this.odpowiedz.add(odpowiedz);

    }

    public String transformuj(String delimiter) {

        return String.join(delimiter, odpowiedz);
    }


}
