package zadOwocki;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Produkt {
    @Override
    public String toString() {
        return "Produkt{" +
                "rodzaj=" + rodzaj +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", ilosc=" + ilosc +
                '}';
    }

    private Rodzaj rodzaj;
    private String nazwa;
    private int cena;
    private int ilosc;
    public Produkt(Rodzaj rodzaj, String nazwa, int cena, int ilosc) {
        this.rodzaj = rodzaj;
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
    }

    public Produkt(Rodzaj o, String banan, int v) {
    }

    public Rodzaj getRodzaj() {
        return rodzaj;
    }
    public void setRodzaj(Rodzaj rodzaj) {
        this.rodzaj = rodzaj;
    }
    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public double getCena() {
        return cena;
    }
    public void setCena(int cena) {
        this.cena = cena;
    }
    public int getIlosc() {
        return ilosc;
    }
    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }
}

