package main.java.VariablesExo;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("VariablesExo.Table de: ") ;
        float Table = reader.nextFloat();
        for (int i = 0; i < 10; i++) {
            System.out.println(Table + " x " + i + " = " + Table*i+1);


        }

    }
}
