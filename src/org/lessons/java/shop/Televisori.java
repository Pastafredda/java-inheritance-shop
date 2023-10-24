package org.lessons.java.shop;

public class Televisori extends Prodotto {
    private int pollici;
    private boolean smartTv;
    public Televisori(String nome, String descrizione, double prezzo, int iva, int pollici, boolean smartTv){
        super(nome,descrizione,prezzo,iva);

        this.pollici = pollici;
        this.smartTv = smartTv;
    }

    public int getPollici() {
        return pollici;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    public boolean isSmartTv() {
        return smartTv;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }
}
