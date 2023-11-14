package com.itFactory.tema;

import java.util.Scanner;

/**
 * Andrei este elev in clasa a5-a.
 * Andrei a fost obraznic iar profesoara l-a pus sa scrie pe tabla de 100 de ori "Nu o sa mai fiu obraznic".
 * Andrei este insa inteligent si se foloseste de programare pentru a scrie pe table mesajul de 100 de ori.
 * Ajutati-l pe Andrei.
 */

public class Problema5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Andrei este obraznic: true sau false: ");
        boolean obraznic = scanner.hasNextBoolean();

        String textTabla = "Nu o sa mai fiu obraznic";

        if (obraznic != false){
        for (int i=1; i<=5; i++){
                System.out.println(textTabla);
            }
        } else {
            System.out.println("Anrei este \"Ascultator\" ");
        }
    }
}
