package main.java.exoBoucleMoha;

import java.util.Scanner;

public class puissances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("indique ton nombre: ");
        int nb = sc.nextInt();
        System.out.print("indique la puissance ");
        int puissance = sc.nextInt();
        int result = 1;
        for (int i = 0; i < puissance; i++) {
            result = result*nb;
        }
        System.out.println("le resultat est: "+result);
    }
}
