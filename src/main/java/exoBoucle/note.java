package main.java.exoBoucle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class note {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List notes = new ArrayList();
        notes.add(sc.nextInt());
        while(notes.stream().mapToInt(i -> (int)i).sum()/(float)notes.size()<12 || notes.size()<=3){
            if (notes.size() > 3 ){
                System.out.println("\tmoyenne: "+notes.stream().mapToInt(i -> (int) i).sum()/(float)notes.size());
            }
            System.out.println(notes.size()+" notes saisies");
            notes.add(sc.nextInt());

        }
        //tant que moyenne de liste de note < 12
        //si longueure de la liste >3 alors écrire la moyenne \n nombre de nottes
        //sinon il n'y a pas encore assez de nottes \n nombre de notes
        //en dehors de la condition demmander la note à l'utilisateur
        //en dehors du while mettre, vottre moyenne a depassé 12!!!, moyenne:... nb de notes...

        //pas oublier de faire un try-catch Exception pour monsieur Lemoine
    }
}
