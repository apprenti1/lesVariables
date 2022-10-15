package main.java.exoBoucle;

import java.util.Scanner;

public class puissance {
    public static void main(String[] args){
        try{

            Scanner sc = new Scanner(System.in);
            System.out.println("quel est ton nombre?");
            int nombre = sc.nextInt();
            System.out.println("quel sera la puissance de ton nombre?");
            int puissance = sc.nextInt();
            int result = nombre;
            for (int i = 1; i < puissance; i++) {
                result = result * nombre;
            }
            System.out.println(nombre + "à la puissance de " + puissance + " = " + result);
        }
        catch(Exception e){
            System.out.println("ce n'est pas un chiffre valide");
        }
    }
}
