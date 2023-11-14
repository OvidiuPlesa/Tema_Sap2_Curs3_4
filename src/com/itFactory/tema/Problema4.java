package com.itFactory.tema;

import java.util.Scanner;

public class Problema4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sirCaractere = "";

        while (!sirCaractere.equals("stop")){
            System.out.println("Introduceti textul: ");
            sirCaractere = scanner.nextLine();
        }
    }
}
