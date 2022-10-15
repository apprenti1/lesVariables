package main.java.exoBoucleMoha;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("entrez le premier nombre: ");
            long nb1 = sc.nextLong();
            System.out.println("entrez le deuxieme nombre: ");
            long nb2 = sc.nextLong();
            if (nb1<10){
                System.out.println("c un chiffre");
            }
            else {
                System.out.println("c un nombre");
            }
            for (long i = 1; i <= nb2; i++) {
                System.out.println(nb1+" X "+i+" = "+(i*nb1));
            }
        }
        catch(Exception e){
            System.out.println("c'est un nombre trop long ou une chaine de charactere\nwsh t con ou koi\n"+e);
        }



    }
}
