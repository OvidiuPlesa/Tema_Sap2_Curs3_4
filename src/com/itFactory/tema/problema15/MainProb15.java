package com.itFactory.tema.problema15;

import com.itFactory.tema.problema15.componente.CutieDeViteze;
import com.itFactory.tema.problema15.componente.Motor;
import com.itFactory.tema.problema15.reparatie.Reparatie;

public class MainProb15 {

    public static void main(String[] args) {

        Motor motor = new Motor("Audi", 2000, 10500);
        CutieDeViteze cutieDeViteze = new CutieDeViteze("Audi", 4000, false);

//        Cazul cu cutie Automata
//        cutieDeViteze.setAutomata(true);

        Reparatie reparatie = new Reparatie("Audi", 2000, motor, cutieDeViteze);

        double costTotalAlReparatie = reparatie.costToalReparatie();
    }



}
