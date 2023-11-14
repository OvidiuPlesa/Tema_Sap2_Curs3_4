package com.itFactory.tema.problema15.componente;

public class CutieDeViteze {

    private String marcaProductie;

    private double pretVanzare;

    private boolean automata;

    public CutieDeViteze(String marcaProductie, double pretVanzare, boolean automata){
        this.marcaProductie = marcaProductie;
        this.pretVanzare = pretVanzare;
        this.automata = automata;
    }

    public String getMarcaProductie(){
        return marcaProductie;
    }

    public double getPretVanzare(){
        return pretVanzare;
    }

    public boolean isAutomata(){
        return automata;
    }

    public void setAutomata(boolean automata) {
        this.automata = automata;
    }

    public void setAutomata(){

    }

}
