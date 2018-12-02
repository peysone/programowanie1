package programowanie_funkcyjne;

import java.security.cert.CollectionCertStoreParameters;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static programowanie_funkcyjne.Pracownicy.PRACOWNICY;

public class Main {
    public static void main(String[] args) {
        PRACOWNICY.stream().forEach(System.out::println);
        System.out.println("--------------");
        final long liczbaPracowników = PRACOWNICY.stream().collect(Collectors.counting());
        System.out.println("Liczba pracowników " + liczbaPracowników);
        System.out.println("---------------");

        final Optional<Integer> zsumowaneZarobki = PRACOWNICY.stream()
                .map(Pracownik::getPensja)
                .collect(Collectors.reducing((pensja1, pensja2)->Integer.sum(pensja1, pensja2)));
        System.out.println("Zsumowane zarobki: " + zsumowaneZarobki);
        System.out.println("---------------");
        final Map<Departament, List<Pracownik>> pracownicyWDepartamentach =
                PRACOWNICY.stream().collect(Collectors.groupingBy(pracownik -> pracownik.getDepartament()));
        pracownicyWDepartamentach.forEach((departament, listaPracownikow) ->{
            System.out.println();
            System.out.println(departament);
            listaPracownikow.stream().forEach(System.out::println);
            });
        System.out.println("---------------");

        final Map<Boolean, List<Pracownik>> czyKobiety = PRACOWNICY.stream()
                .collect(Collectors.partitioningBy(pracownik -> Plec.K.equals(pracownik.getPlec())));

        czyKobiety.forEach((czyKobieta, listaPracownikow) -> {
            System.out.println("Czy kobieta? " + czyKobieta);
            listaPracownikow.stream().forEach(System.out::println);
            System.out.println("---------------");
        });
        final Map<String, Integer> imieNaZarobki =
        PRACOWNICY.stream().collect(Collectors.toMap(Pracownik::getImie, Pracownik::getPensja));
        imieNaZarobki.forEach((imie, zarobki) -> System.out.println(imie + " " + zarobki));
//        PRACOWNICY.stream().collect(Collectors.toMap(
//                pracownik -> pracownik.getImie(),
//                pracownik -> pracownik.getPensja();
//        pierwsze to Method reference, drugie to sasmo tylko z uzyciem lambdy
        System.out.println();
        System.out.println();
        System.out.println("Łączne zarobki na płeć.");

        System.out.println("---------------");



        Map<Plec, Integer> zarobkiNaPlec = PRACOWNICY.stream()
                .collect(Collectors.toMap(Pracownik::getPlec, Pracownik::getPensja, Integer::sum));
//        PRACOWNICY.stream().collect(Collectors.toMap
//                (Pracownik::getPlec, Pracownik::getPensja,
//                        (pensja1, pensja2)->Integer.sum(pensja1, pensja2)));
//        to u góry to jest to samo, tylko że z użyciem lambdy
        zarobkiNaPlec.forEach((plec, laczneZarobki) -> System.out.println(plec + " " + laczneZarobki));
    }
}
