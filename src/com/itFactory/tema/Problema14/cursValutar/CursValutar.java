package com.itFactory.tema.Problema14.cursValutar;

public class CursValutar {

    double cursEUR;
    double cursUSD;
    double cursGBP;
    double valoareRON;

    public CursValutar(double cursEUR, double cursUSD, double cursGBP){
        this.cursEUR = cursEUR;
        this.cursUSD = cursUSD;
        this.cursGBP = cursGBP;
    }

    public CursValutar(double valoareRON){
        this.valoareRON = valoareRON;
    }

    public double getcursEUR(){
        return cursEUR;
    }

    public double getcursUSD() {
        return cursUSD;
    }

    public double getcursGBP() {
        return cursGBP;
    }

    public double getValoareRON(){
        return valoareRON;
    }

    public void setcursEUR(double cursEUR){
        this.cursEUR = cursEUR;
    }

    public void setcursUSD(double cursUSD){
        this.cursUSD = cursUSD;
    }

    public void setcursGBP(double cursGBP){
        this.cursGBP = cursGBP;
    }

    public void setValoareRON(double valoareRON){
        this.valoareRON = valoareRON;
    }

    public double schimbaInEuro(double valoareRON){
        return valoareRON / cursEUR;
    }

    public double schimbaInUSD(double valoareRON){
        return valoareRON / cursUSD;
    }

    public double schimbaInGBP(double valoareRON){
        return valoareRON / cursGBP;
    }



}

