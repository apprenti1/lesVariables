package main.java.exoBoucle;


import java.util.Scanner;


public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre le premier nombre: \n");
        int nombre1 = sc.nextInt();
        System.out.println("entre le deuxieme nombre: \n");
        int nombre2 = sc.nextInt();

        for (int i = nombre1; i <= nombre2; i++) {
            System.out.println("voici la table de" + i + "\n");
            for (int j = 0; j < 10; j++) {
                System.out.println(i*j);
            }
            System.out.println("\n");

        }

    }
}
