package zadOwocki;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.stream.Collectors;

public class ProduktReader {
    public Collection<Produkt> wczytajProdukty(String path) throws IOException {
            return Files.lines(Paths.get(path)).map(linia -> {
                final String[] daneFormularza = linia.split(";");
                final String rodzaj = daneFormularza[0];
                final String nazwa = daneFormularza[1];
                int cena = Integer.parseInt(daneFormularza[2]);
                final int ilosc = Integer.parseInt(daneFormularza[3]);
                final Produkt produkt = new Produkt(Rodzaj.valueOf(rodzaj),
                        nazwa,
                        cena,
                        ilosc);
                return produkt;
            }).collect(Collectors.toList());
        }
    }

