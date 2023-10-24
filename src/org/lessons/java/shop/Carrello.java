package org.lessons.java.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti prodotti vuoi inserire?");
        int prodottiDaInserire = Integer.parseInt(scanner.nextLine());
        Prodotto[] prodottoLista = new Prodotto[prodottiDaInserire];
        int scelta = 0;
        System.out.println("Scegli il tipo di prodotto che vuoi acquistare inserendo il numero del prodotto");
        System.out.println("Inserisci nome prodotto");
        String nome = scanner.nextLine();
        System.out.println("Inserisci descrizione prodotto");
        String descrizione = scanner.nextLine();
        System.out.println("Inserisci prezzo");
        double prezzo= Double.parseDouble((scanner.nextLine()));
        System.out.println("Inserisci iva in %");
        int iva = Integer.parseInt(scanner.nextLine());
        while (true){
            System.out.println("1 Smartphone, 2 Televisori, 3 Cuffie , 0 esci");
            scelta = Integer.parseInt(scanner.nextLine());
            if(scelta == 1){
                System.out.println("Inserisci memoria telefono");
                int memoria = Integer.parseInt(scanner.nextLine());
                Smartphone smartphone = new Smartphone(nome, descrizione,prezzo,iva,memoria);
            } else if (scelta == 2) {
                System.out.println("Inserisci dimensioni televisore");
                int pollici = Integer.parseInt(scanner.nextLine());
                System.out.println("Inserisci se è Smart Tv");
                boolean smartTv = Boolean.parseBoolean(scanner.nextLine());
                Televisori televisori = new Televisori(nome, descrizione,prezzo,iva,pollici,smartTv);
            } else if (scelta == 3) {
                System.out.println("Inserisci colore cuffie");
                String coloreCuffie = scanner.nextLine();
                System.out.println("Inserisci se sono wirless o cablate");
                boolean wirless = Boolean.parseBoolean(scanner.nextLine());
                Cuffie cuffie = new Cuffie(nome, descrizione, prezzo,iva,coloreCuffie,wirless);
            } else if (scelta == 0) {
                 break;
            }
        }


        scanner.close();
    }
}
