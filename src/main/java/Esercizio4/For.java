package Esercizio4;

import VariabiliGlobali.VariabiliGlobali;

import java.util.Scanner;

public class For {
    public static void contoRovescia() {
        for (int i = VariabiliGlobali.getNumero(); i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int numeroInput = Integer.parseInt(scanner.nextLine());
        VariabiliGlobali.setNumero(numeroInput);
        contoRovescia();
    }
}
