package main.java.exoBoucle;

import java.util.Scanner;

public class factoriel {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        int nombre = sc.nextInt();
        int result = 1;
        System.out.print("1");
        for (int i = 2; i <= nombre; i++) {
            System.out.print(" X "+i);
            result = result * i;
        }
        System.out.println(" = "+result);}
        catch(Exception e){
            System.out.println("charractere non valide");
        }
    }
}
