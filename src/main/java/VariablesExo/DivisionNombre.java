package main.java.VariablesExo;

import java.util.Scanner;

public class DivisionNombre {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("nombre1: ") ;
        float number = reader.nextFloat();
        System.out.print("nombre2: ") ;
        number = number/reader.nextFloat();

        System.out.println(number);











        reader.close();

    }
}
