package main.java.exoBoucle;


import java.util.Scanner;


public class table1 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("entre le premier nombre: \n");
            int nombre1 = sc.nextInt();
            System.out.println("entre le deuxieme nombre: \n");
            int nombre2 = sc.nextInt();

            if (nombre1 <10){
                System.out.println("c un chiffre");
            }
            else{
                System.out.println("c un nombre");}
            for (int i = 0; i <= nombre2; i++) {
                System.out.println(nombre1+" X "+i+" = "+(nombre1 * i));


            }}
        catch(Exception e){
            System.out.println("charactere entré non valide");
        }


    }
}
