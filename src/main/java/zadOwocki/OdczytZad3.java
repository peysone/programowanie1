package zadOwocki;

import java.io.IOException;
import java.util.Collection;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class OdczytZad3 {
    public static void main(String[] args) throws IOException {
        Collection<Produkt> produkty = new ProduktReader().wczytajProdukty("produkty.txt");
        produkty.forEach(System.out::println);

        int iloscO = produkty.stream()
                .filter(produkt -> Rodzaj.O.equals(produkt.getRodzaj()))
                .collect(Collectors.toSet()).size();
        int iloscW = produkty.stream()
                .filter(produkt -> Rodzaj.W.equals(produkt.getRodzaj()))
                .collect(Collectors.toSet()).size();

        System.out.println("Ilość O: " + iloscO);
        System.out.println("Ilość W: " + iloscW);
        System.out.println("Proporcja O/W: " + (iloscO/iloscW));

        OptionalDouble sredniaCena = produkty.stream()
                .filter(produkt -> Rodzaj.O.equals(produkt.getRodzaj()))
                .mapToInt(produkt -> (int) produkt.getCena())
//                    .mapToInt(Produkt::getCena)
                .average();
        if (sredniaCena.isPresent()) {
            System.out.println("Średnia cena O: " + sredniaCena.getAsDouble());
        }

        sredniaCena = produkty.stream()
                .filter(produkt -> Rodzaj.W.equals(produkt.getRodzaj()))
                .mapToInt(produkt2 -> (int) produkt2.getCena())
                .average();
        if (sredniaCena.isPresent()) {
            System.out.println("Średnia cena W: " + sredniaCena.getAsDouble());
        }

        sredniaCena = produkty.stream()
                .mapToInt(produkt1 -> (int) produkt1.getCena())
                .average();
        if (sredniaCena.isPresent()) {
            System.out.println("Średnia cena: " + sredniaCena.getAsDouble());
        }

        OptionalInt najwyzszaCenaZaWarzywo = produkty.stream()
                .filter(produkt -> Rodzaj.W.equals(produkt.getRodzaj()))
                .mapToInt(produkt1 -> (int) produkt1.getCena())
                .max();
        if (najwyzszaCenaZaWarzywo.isPresent()) {
            System.out.println("Najwyższa cena za warzywo: " + najwyzszaCenaZaWarzywo.getAsInt());
        }

        produkty.stream()
                .filter(produkt -> Rodzaj.W.equals(produkt.getRodzaj()) && produkt.getIlosc() > 5)
                .forEach(warzywo -> { System.out.println("Więcej niż 5: " + warzywo.getNazwa());});

        produkty.stream()
                .filter(produkt -> Rodzaj.O.equals(produkt.getRodzaj()) && produkt.getCena() < 3)
                .forEach(owoc -> { System.out.println("Tańszy niż 3: " + owoc.getNazwa());});
    }
}

