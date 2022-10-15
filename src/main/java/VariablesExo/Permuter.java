package main.java.VariablesExo;

import java.util.Scanner;

public class Permuter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("a: ") ;
        float a = reader.nextFloat();
        System.out.print("b: ") ;
        float b = reader.nextFloat();
        float varechange = a;
        a=b;
        b=varechange;

        System.out.println("a = "+a+"\nb = "+b);
}}
