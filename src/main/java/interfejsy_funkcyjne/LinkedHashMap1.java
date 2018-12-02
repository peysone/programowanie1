package interfejsy_funkcyjne;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        Map<Integer, Integer> wygrane = new LinkedHashMap<>();
        wygrane.put(2017, 7770);
        wygrane.put(2012, 555555);
        wygrane.put(2018, 30000);
        wygrane.put(2009, 1000);
        wygrane.put(1996, 20000);

        System.out.println("Wygrane: ");
        wygrane.forEach((key, value) -> System.out.println(key + "=[" + value + "]"));
        System.out.println("--------------------");
        final Set<Map.Entry<Integer, Integer>> wpisy = wygrane.entrySet();
        wpisy.stream().sorted(Map.Entry.comparingByKey())
                .forEach(wpis -> System.out.println(wpis.getKey() + "=[" + wpis.getValue() + "]"));
        System.out.println("--------------------");
        wpisy.stream().sorted(Map.Entry.comparingByValue())
                .forEach(wpis -> System.out.println(wpis.getKey() + "=[" +wpis.getValue() + "]"));
        System.out.println("----------------");

        wpisy.stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(wpis -> System.out.println(wpis.getKey() + "=[" +wpis.getValue() + "]"));
    }
}
