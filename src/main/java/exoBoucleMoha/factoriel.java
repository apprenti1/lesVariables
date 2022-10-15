package main.java.exoBoucleMoha;

import java.util.Scanner;

public class factoriel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        int result = 1;
        System.out.print(1);
        for (int i = 2; i <= nb; i++) {
            result = result*i;
            System.out.print(" X "+i);
        }
        System.out.println(" = "+result);
    }
}
