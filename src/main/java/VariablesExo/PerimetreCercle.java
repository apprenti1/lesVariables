package main.java.VariablesExo;

import java.util.Scanner;

public class PerimetreCercle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("rayon cercle: ");
        float rayon = reader.nextFloat();

        System.out.println("perimetre = " + 2 * 3.14 * rayon + "\nsurface = " + Math.pow(rayon, 2) * 3.14);


    }


}