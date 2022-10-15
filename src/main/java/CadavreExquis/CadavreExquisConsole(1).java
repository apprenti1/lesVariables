package main.java.CadavreExquis;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class CadavreExquisConsole {
    public static void main(String[] args) {
        ArrayList sbj = new ArrayList();
        ArrayList vrb = new ArrayList();
        ArrayList cod = new ArrayList();
        ArrayList loc = new ArrayList();
        Random rand = new Random();
        Scanner reader = new Scanner(System.in);
        System.out.print("nombre de joueurs: ") ;
        int player = reader.nextInt();
        reader.nextLine();
        for (int i = 0; i < player; i++) {
            System.out.println("joueur "+(i+1)+" quel est ton sujet ?") ;
            sbj.add(reader.nextLine());
            System.out.println("joueur "+(i+1)+" quel est ton verbe ?") ;
            vrb.add(reader.nextLine());
            System.out.println("joueur "+(i+1)+" quel est ton complement ?") ;
            cod.add(reader.nextLine());
            System.out.println("joueur "+(i+1)+" quel est ton lieu ?") ;
            loc.add(reader.nextLine());
        }
        System.out.println(sbj.get(rand.nextInt(player))+" "+vrb.get(rand.nextInt(player))+" "+cod.get(rand.nextInt(player))+" "+loc.get(rand.nextInt(player))+" ");
    }
}
