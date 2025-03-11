package Esercizio1;

import VariabiliGlobali.VariabiliGlobali;
import java.util.Scanner;

public class StringaPariDispari {

    public static void stringaPariDispari() {
        if (VariabiliGlobali.getStringa().length() % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inserisci una stringa");
            VariabiliGlobali.setStringa(scanner.nextLine());
            stringaPariDispari();
    }
}
