package main.java.VariablesExo;

import java.util.Scanner;
public class myname {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("quel est ton nom: ") ;
        String name = reader.nextLine();
        reader.close();
        System.out.print("Ton nom est: " + name) ;

    }

}
