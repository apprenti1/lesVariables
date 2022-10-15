package main.java.exoBoucleMoha;

import java.util.Scanner;

public class nombre1er {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("rentres un nombre !");


        int nombre = sc.nextInt();

        System.out.print("2");
        for (int nb = 3; nb <= nombre; nb++) {

            boolean premier = true;
            for (int i = 2; i < nb; i++) {
                if (nb%i == 0) {
                    premier = false;
                }
            }
            if (premier == true) {
                System.out.print(", " + nb);
            }
        }

    }
}
//hello je t'ai piraté//
