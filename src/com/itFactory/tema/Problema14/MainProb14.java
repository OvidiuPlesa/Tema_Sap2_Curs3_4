package com.itFactory.tema.Problema14;

import com.itFactory.tema.Problema14.cursValutar.CursValutar;

import java.util.Scanner;

public class MainProb14 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        CursValutar cursValutar = new CursValutar(4.97, 4.7, 5.7);

        System.out.println();
        while (true){
            System.out.println("Optiuni: " +
                    "\n 1 - Schimb bani " +
                    "\n 2 - schimba cursul valutar " +
                    "\n 3 - se iese din program" +
                    "\n Selectati Optiunea Dorita: ");
            int optiune = scanner.nextInt();

            switch (optiune){

                case 1:
                    System.out.println("Introduce-ti suma in Ron:");
                    double valoareRon = scanner.nextInt();

                    System.out.println("Selectati Moneda in care doriti sa schimbati: " +
                            "\n1 - Euro " +
                            "\n2 - USD " +
                            "\n3 - GBP");
                    int optiuneValuta = scanner.nextInt();
                    double sumaFinala = 0;
                    switch (optiuneValuta){
                        case 1:
                            sumaFinala = cursValutar.schimbaInEuro(valoareRon);
                            System.out.println("Suma schimbata in Euro este: " + sumaFinala);
                            break;

                        case 2:
                            sumaFinala = cursValutar.schimbaInUSD(valoareRon);
                            System.out.println("Suma schimbata in USD este: " + sumaFinala);
                            break;

                        case 3:
                            sumaFinala = cursValutar.schimbaInGBP(valoareRon);
                            System.out.println("Suma schimbata in GBP este: " + sumaFinala);
                            break;
                        default:
                            System.out.println("Nu ati ales moneda dorita!!!");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Selectati cursul Valutar pe care doriti sa il chimbati: " +
                            "\n 1 - Euro " +
                            "\n 2 - Dolar " +
                            "\n 3 - LireSterline ");
                    int optiuneValutaSchimb = scanner.nextInt();
                    System.out.println("Introduce-ti noul curs pentru moneta aleasa: \nNoul Curs: ");
                    double noulCurs = scanner.nextDouble();

                    switch (optiuneValutaSchimb){
                        case 1:
                            cursValutar.setcursEUR(noulCurs);
                            System.out.println("Noul curs valutar pentru Euro este: " + noulCurs);
                            break;

                        case 2:
                            cursValutar.setcursUSD(noulCurs);
                            System.out.println("Noul curs valutar pentru USD este: " + noulCurs);
                            break;

                        case 3:
                            cursValutar.setcursGBP(noulCurs);
                            System.out.println("Noul curs valutar pentru GBP este: " + noulCurs);
                            break;
                        default:
                            System.out.println("Nu ati selectat o optiune valida pentru Schimbare Curs Valutar !!!");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Program terminat");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Optiune Invalida");
                    break;
            }
        }
    }
}
