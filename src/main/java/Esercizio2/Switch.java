package Esercizio2;

import VariabiliGlobali.VariabiliGlobali;

import java.util.Scanner;

public class Switch {
    public static void switchNumero() {
        switch (VariabiliGlobali.getNumero()) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("Il numero " + VariabiliGlobali.getNumero() + " non è tra quelli utilizzabili");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int numeroInput = Integer.parseInt(scanner.nextLine());
        VariabiliGlobali.setNumero(numeroInput);
        switchNumero();
    }
}
