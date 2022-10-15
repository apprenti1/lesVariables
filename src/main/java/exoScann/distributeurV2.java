package main.java.exoScann;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class distributeurV2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            List button_id = Arrays.asList("coca","pepsi","mirinda","oasis","selecto","7'up","ice tea","eau","caprisun");
            int collumn_number = 3;
            try{
            String commande = sc.nextLine();System.out.println(button_id.get((Integer.parseInt(commande.substring(0, 1)) - 1)*collumn_number + (((int) commande.substring(1, 2).toCharArray()[0]) - 65)));
            }
            catch (Exception e){System.out.println("erreur, cette commande n'existe pas");
            }
    }
}
//azy