package org.lessons.java.shop;

public class Cuffie extends Prodotto{
    private String coloreCuffie;
    private boolean wirless;
    public Cuffie(String nome, String descrizione, double prezzo, int iva, String coloreCuffie, boolean wirless){
        super(nome,descrizione,prezzo,iva);
        this.wirless = wirless;
        this.coloreCuffie= coloreCuffie;
    }

    public String getColoreCuffie() {
        return coloreCuffie;
    }

    public void setColoreCuffie(String coloreCuffie) {
        this.coloreCuffie = coloreCuffie;
    }

    public boolean isWirless() {
        return wirless;
    }

    public void setWirless(boolean wirless) {
        this.wirless = wirless;
    }
}
