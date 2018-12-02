package programowanie_funkcyjne;

import java.util.Arrays;
import java.util.List;

public class Departamenty {

    public static final Departament HR = new Departament("HR");
    public static final Departament IT = new Departament("IT");
    public static final Departament KSIEGOWOSC = new Departament("KSIEGOWOSC");

    public static final List<Departament> DEPARTAMENTY = Arrays.asList(HR, IT, KSIEGOWOSC);
}
