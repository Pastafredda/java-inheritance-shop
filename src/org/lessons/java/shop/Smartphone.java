package org.lessons.java.shop;

import java.util.Random;

public class Smartphone extends Prodotto{
    private String codiceImei;
    private int memoria;


    public Smartphone(String nome, String descrizione, double prezzo, int iva, int memoria){
        super(nome,descrizione,prezzo,iva);
        this.codiceImei= imeiCasuale();
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setCodiceImei(String codiceImei) {
        this.codiceImei = codiceImei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getCodiceImei() {
        return codiceImei;
    }

    private String imeiCasuale(){
        Random random = new Random();
        String imei = "";

        for (int i = 0; i < 15; i++) {
            int cifraRandom = random.nextInt(10);
            imei += cifraRandom;
        }
        return imei;
    }

}
