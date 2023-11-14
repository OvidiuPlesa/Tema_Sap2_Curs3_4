package com.itFactory.tema.problema15.componente;

public class Motor {

    private String marcaProductie;

    private int capacitateMotor;

    private double pretDeVanzare;

    public Motor(String marcaProductie, int capacitateMotor, double pretDeVanzare){
        this.marcaProductie = marcaProductie;
        this.capacitateMotor = capacitateMotor;
        this.pretDeVanzare = pretDeVanzare;
    }

    public String getMarcaProductie(){
        return marcaProductie;
    }

    public int getCapacitateMotor(){
        return capacitateMotor;
    }

    public double getPretDeVanzare(){
        return  pretDeVanzare;
    }

    public void setMarcaProductie(){
        this.marcaProductie = marcaProductie;
    }

    public void setCapacitateMotor(){
        this.capacitateMotor = capacitateMotor;
    }

    public void setPretDeVanzare(){
        this.pretDeVanzare = pretDeVanzare;
    }
}
