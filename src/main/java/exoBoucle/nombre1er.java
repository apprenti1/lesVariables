package main.java.exoBoucle;

import java.util.Scanner;

public class nombre1er {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("écrit un nombre:\n   ");
        try {
            int nombre = sc.nextInt();
            if (nombre > 1) {
                System.out.print("les nombres premier jusqu'à to nombre sont : 2");
                for (int nb = 0; nb < nombre; nb++) {


                    boolean prem = false;
                    for (int i = 2; i < nb && nb % i != 0; i++) {
                        if (i == nb - 1) {
                            prem = true;
                        }

                    }
//            System.out.println(prem);
                    if (prem) {
                        System.out.print(", " + nb);
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println("la valeur entrée est incorrecte!!");
        }
    }

}

