package Esercizio3;

import VariabiliGlobali.VariabiliGlobali;

import java.util.Scanner;

public class While {
    public static void separateString() {
        if (VariabiliGlobali.getStringa().equals(":q")) {
            VariabiliGlobali.setStartWhile(false);
        } else {
            String result = String.join(",", VariabiliGlobali.getStringa().split(""));
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (VariabiliGlobali.getStartWhile()) {
            System.out.println("Inserisci una stringa");
            VariabiliGlobali.setStringa(scanner.nextLine());
            separateString();
        }


    }
}
