package interfejsy_funkcyjne;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {


        Map<Integer, String> liczbyNaLiczebniki = new HashMap<>();
        liczbyNaLiczebniki.put(8, "ósmy");
        liczbyNaLiczebniki.put(9, "dziewiąty");
        liczbyNaLiczebniki.put(10, "dziesiąty");
        liczbyNaLiczebniki.put(3, "trzeci");
        liczbyNaLiczebniki.put(4, "czwarty");
        liczbyNaLiczebniki.put(5, "piąty");
        liczbyNaLiczebniki.put(6, "szósty");
        liczbyNaLiczebniki.put(7, "siódmy");
        liczbyNaLiczebniki.put(11, "jedenasty");
        liczbyNaLiczebniki.put(12, "dwunasty");
        liczbyNaLiczebniki.put(1, "pierwszy");
        liczbyNaLiczebniki.put(2, "drugi");

        System.out.println(liczbyNaLiczebniki.containsKey(1));
        System.out.println(liczbyNaLiczebniki.containsValue("drugi"));
        System.out.println(liczbyNaLiczebniki.get(3));
        System.out.println(liczbyNaLiczebniki.get(1));
        liczbyNaLiczebniki.remove(1);
        liczbyNaLiczebniki.put(1, "nowa wartość");
        System.out.println(liczbyNaLiczebniki.get(1));
        System.out.println(liczbyNaLiczebniki.keySet());
        System.out.println(liczbyNaLiczebniki.values());
        System.out.println(liczbyNaLiczebniki.entrySet());
        System.out.println("---------------------------");

        liczbyNaLiczebniki.forEach((klucz, wartosc)-> System.out.println(klucz + "=[" + wartosc + "]"));
        System.out.println("---------------------------");



    }
}