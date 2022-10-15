package main.java.exoBoucleMoha;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class conv_monnaie {
    public static void main(String[] args) {
        List monnaies = Arrays.asList("euro","dolar","yen");
        List monnaies_coef = Arrays.asList(1f, 1f, 0.0070f);
        Scanner sc = new Scanner(System.in);
        float nb = sc.nextFloat();
        sc.nextLine();
        String monnaie_start = sc.nextLine();
        nb = (nb*(float) monnaies_coef.get(monnaies.indexOf(monnaie_start)));
        while (true){
            monnaie_start = sc.nextLine();
            if (monnaie_start.isEmpty()){
                break;
            }
            System.out.println(nb+"*"+nb* (float)monnaies_coef.get(monnaies.indexOf(monnaie_start)));

        }
    }
}
