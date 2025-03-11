package Esercizio1;
import VariabiliGlobali.VariabiliGlobali;

import java.time.Year;
import java.util.Scanner;

public class AnnoBisestile {
    public static void annoBisestile() {
        if (VariabiliGlobali.getAnno() % 4 == 0) {
            if (VariabiliGlobali.getAnno() % 100 == 0) {
                if (VariabiliGlobali.getAnno() % 400 == 0) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            } else {
                System.out.println(true);
            }
        } else {
            System.out.println(false);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un anno");
        float annoInput = Integer.parseInt(scanner.nextLine());
        VariabiliGlobali.setAnno(annoInput);
        annoBisestile();
    }
}
