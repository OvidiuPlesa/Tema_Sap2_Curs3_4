package com.itFactory.tema.Problema12new;

public class Ram {

    private String tipMemorieRam;

    private String unitateDeMasuraMemorieRam;

    private int capacitateMemorieRam;

    public Ram(String tipMemorieRam, String unitateDeMasuraMemorieRam, int capacitateMemorieRam) {
        this.tipMemorieRam = tipMemorieRam;
        this.unitateDeMasuraMemorieRam = unitateDeMasuraMemorieRam;
        this.capacitateMemorieRam = capacitateMemorieRam;
    }

    public String getTipMemorieRam() {
        return tipMemorieRam;
    }

    public String getUnitateDeMasuraMemorieRam(){
        return unitateDeMasuraMemorieRam;
    }

    public int getCapacitateMemorieRam(){
        return capacitateMemorieRam;
    }

    public void setTipMemorieRam(String tipMemorieRam) {
        this.tipMemorieRam = tipMemorieRam;
    }

    public void setUnitateDeMasuraMemorieRam(String unitateDeMasuraMemorieRam) {
        this.unitateDeMasuraMemorieRam = unitateDeMasuraMemorieRam;
    }

    public void setCapacitateMemorieRam(int capacitateMemorieRam){
        this.capacitateMemorieRam = capacitateMemorieRam;
    }
}
