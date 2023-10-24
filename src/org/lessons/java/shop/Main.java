package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creare 3 prodotti
        Scanner scanner= new Scanner(System.in);
        System.out.println("Inserisci nome prodotto");
        String nome = scanner.nextLine();
        System.out.println("Inserisci descrizione prodotto");
        String descrizione = scanner.nextLine();
        System.out.println("Inserisci prezzo");
        double prezzo= Double.parseDouble((scanner.nextLine()));
        System.out.println("Inserisci iva in %");
        int iva = Integer.parseInt(scanner.nextLine());

        Prodotto prodotto = new Prodotto( nome, descrizione, prezzo,iva);
        System.out.println(prodotto.nomeCompleto());
        System.out.println(prodotto.prezzoIva() + "€");
        scanner.close();
    }
}
