package VariabiliGlobali;
import lombok.Getter;

public class VariabiliGlobali {
    @Getter
    private static String stringa;
    @Getter
    private static Float anno;
    @Getter
    private static Integer numero;
    @Getter
    private static Boolean startWhile = true;

    public static void setStringa(String stringa) {
        VariabiliGlobali.stringa = stringa;
    }

    public static void setAnno(Float anno) {
        VariabiliGlobali.anno = anno;
    }

    public static void setNumero(Integer numero) {
        VariabiliGlobali.numero = numero;
    }

    public static void setStartWhile(Boolean startWhile) {
        VariabiliGlobali.startWhile = startWhile;
    }
}

