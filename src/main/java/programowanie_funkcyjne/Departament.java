package programowanie_funkcyjne;

public class Departament {
    private String nazwa;

    public Departament(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String toString() {
        return this.nazwa;
    }
}
