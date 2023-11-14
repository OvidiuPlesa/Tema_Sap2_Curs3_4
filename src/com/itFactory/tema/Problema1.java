package com.itFactory.tema;

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {
        String user = "Ionel";
        int password = 123 ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu username: ");
        String usertastatura = scanner.nextLine();

        System.out.println("Introdu parola: ");
        String passwordCititDeLaTastatura = scanner.nextLine();

        int passwordTastatura = Integer.parseInt(passwordCititDeLaTastatura);

        if(user.equals(usertastatura) && password == passwordTastatura){
            System.out.println("Userul" + usertastatura + " s-a logat in aplicatie");
        } else {
            System.out.println("Username / password incorecte");
        }
    }
}
