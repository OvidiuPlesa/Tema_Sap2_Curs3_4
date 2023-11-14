package com.itFactory.tema.problema15.reparatie;

import com.itFactory.tema.problema15.componente.CutieDeViteze;
import com.itFactory.tema.problema15.componente.Motor;

public class Reparatie {

    private String marcaProductie;

    private int costReparatie;

    private Motor motor;

    private CutieDeViteze cutieDeViteze;

    public Reparatie(String marcaProductie, int costReparatie, Motor motor, CutieDeViteze cutieDeViteze) {
        this.marcaProductie = marcaProductie;
        this.costReparatie = costReparatie;
        this.motor = motor;
        this.cutieDeViteze = cutieDeViteze;
    }

    public double costToalReparatie() {
        if (marcaProductie.equals(motor.getMarcaProductie()) &&
                (marcaProductie.equals(cutieDeViteze.getMarcaProductie()))) {
            double costFinal = costReparatie;
            if (cutieDeViteze.isAutomata()) {
                costFinal = costReparatie + 2150.75;
            }
            System.out.println("Costul final al reparatie este: " + costFinal);
        } else {
            System.out.println("Costul de productie nu poate fi stabilit. Componente gresite");
        }
        return 0;
    }
}
