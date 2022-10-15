package main.java.exoScann;

import java.util.Scanner;

public class distributeur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        switch(code){
            case "1A":
                System.out.println("coca");
                break;
            case "2A":
                System.out.println("canette ice tea");
                break;
            case "3A":
                System.out.println("eau");
                break;
            case "1B":
                System.out.println("mirinda");
                break;
            case "2B":
                System.out.println("orangina");
                break;
            case "3B":
                System.out.println("pepsi");
                break;
            case "1C":
                System.out.println("7'UP");
                break;
            case "2C":
                System.out.println("selecto");
                break;
            case "3C":
                System.out.println("oasis");
                break;
            default:
            System.out.println("erreur dans la commande");


        }

        }
}
