package com.itFactory.tema;
/**
 * Sa se creeze un program in care se calculeaza pretul unei cantitati de produse.
 * Pentru aceasta se vor citi urmatoarele 3 variabile: numele produsului, pretul produsului si cantitatea.
 * Se cere ca in functie de datele introduse sa se calculeze pretul final.
 * Se va afisa un mesaj similar: "Pentru produsele de tip {nume produs} si cantitatea {cantitate} , pretul este de {pret calculat}";
 * Aspecte:
 * 1. "Cumpar atatea produse cu numele pe care il citesc si calculez pretul total"
 *
 */


import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu numele produsului: ");
        String numeProdus = scanner.nextLine();

// ** Trebuie schimbat pe un While :

        if (numeProdus.length() != 0) {

            System.out.println("Introdu pretul produsului: ");
            Float pretProdus = scanner.nextFloat();

            if (pretProdus != 0) {

                System.out.println("Introdu cantitatea produsului: ");
                Float cantitateProdus = scanner.nextFloat();

                if (cantitateProdus != 0) {
                    System.out.println("Cumpar cantitatea: " + cantitateProdus + " cu numele: " + numeProdus + " avand pretul total de: " + (cantitateProdus * pretProdus));
                } else {
                    System.out.println("Nu ati introdus cantitatea produsului");
                }
            } else {
                System.out.println("Nu ati introdus pretul produsului!");
            }
        } else {
            System.out.println("Nu ati introdus numele produsului!");
        }
    }
}