package ocenyZPrzedmiotow;

import java.util.*;

public class HashMapOcena {
    public static void main(String[] args) {

        Map<Przedmiot, Integer> oceny = new HashMap<>();
        Arrays.stream(Przedmiot.values()).forEach(przedmiot -> {
            oceny.put(przedmiot, new Random().nextInt(5) + 1);
        });
        oceny.forEach((przedmiot, integer) -> System.out.println(przedmiot + "=[" + integer + "]"));
        System.out.println("------------");

        oceny.put(Przedmiot.HISTORIA, 15);
        System.out.println(oceny.entrySet());
        System.out.println("------------");

        oceny.putIfAbsent(Przedmiot.MATEMATYKA, 3);
        System.out.println(oceny.entrySet());
        System.out.println("------------");

        oceny.remove(Przedmiot.MATEMATYKA);


        System.out.println("------------");

        System.out.println(oceny.entrySet());

        oceny.computeIfAbsent(Przedmiot.MATEMATYKA, przedmiot -> 20);
        System.out.println(oceny.entrySet());


        Map<Przedmiot, Integer> oceny1 = new LinkedHashMap<>();

    }
}