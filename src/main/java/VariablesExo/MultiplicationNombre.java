package main.java.VariablesExo;

import java.util.Scanner;

public class MultiplicationNombre {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("nombre1: ") ;
        float number1 = reader.nextFloat();
        System.out.print("nombre2: ") ;
        float number2 = reader.nextFloat();

        System.out.println(number1+" X "+number2+" = "+number1*number2);
    }
}
