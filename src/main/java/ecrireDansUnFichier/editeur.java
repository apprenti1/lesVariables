package main.java.ecrireDansUnFichier;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
-créer un fichier,
    si créé: file created
    sinon: file exist
 -ecrire le contenu du fichier dans la console
 tant que la variable stop == false
 faire un scann à l'utilisateur, nextline
 si le scann commance par !stop alors variable stop = true
 sinon si le scann commance par !suppr, lire le nombre qui suit et supprimer la ligne correspondante,
 si le nombre en question est 0 alors supprimer tout le fichier
 sinon si le scann commence par !modify alors ajouter une ligne modifiable dans la console, faire un scann pour la récup et l'incerer à la place de la ligne du numéro correspondant
*/
public class editeur {

    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {}

        try {
            String file_path = "src/main/java/ecrireDansUnFichier/file.txt";
            List history = new ArrayList();
            int timeline = 0;
            String helptext = ("\t\u001B[38;2;232;255;109m\u001B[1m$-------------------Help core-------------------$\u001B[0m" +
                    "\n\t vous pouvez écrire normalement, " +
                    "\n\t il faudra simplement mettre \"\\N\" pour chaque saut de ligne.\n" +
                    "\n\t \u001B[1m\u001B[4m\u001B[38;2;232;162;109m!stop\u001B[0m \t\t\t\t\tcette commande vous permettra de stopper le programme" +
                    "\n\t -------------------------------------------------------------------------------------------------" +
                    "\n\t \u001B[1m\u001B[4m\u001B[38;2;232;162;109m!suppr\u001B[0m \t\t\t\tline cette commande vous permettra de supprimer une ligne " +
                    "\n\t \t\t\t\t\t\ten remplassant line par le numéro de la ligne ou tout le document " +
                    "\n\t \t\t\t\t\t\ten le remplassant par 0 " +
                    "\n\t -------------------------------------------------------------------------------------------------" +
                    "\n\t \u001B[1m\u001B[4m\u001B[38;2;232;162;109m!modify\u001B[0m\u001B[1m\u001B[38;2;232;162;109m line content\u001B[0m  \tcette commande vous permettra de remplacer la ligne voulu spécifié " +
                    "\n\t \t\t\t\t\t\tà la place de line par le contenu voulu spécifié à la place de content" +
                    "\n\t -------------------------------------------------------------------------------------------------" +
                    "\n\t \u001B[1m\u001B[4m\u001B[38;2;232;162;109m!open\u001B[0m  \t\t\t\tcette commande vous permettra d'ouvrir dans l'éditeur n'importe " +
                    "\n\t \t\t\t\t\t\tquel doccument sur l'appareil et l'éditer" +
                    "\n\t -------------------------------------------------------------------------------------------------" +
                    "\n\t \u001B[1m\u001B[4m\u001B[38;2;232;162;109m!reload\u001B[0m  \t\t\t\tcette commande vous permettra de recharger le fichier ouvert" +
                    "\n\t -------------------------------------------------------------------------------------------------" +
                    "\n\t \u001B[1m\u001B[4m\u001B[38;2;232;162;109m!helpturn\u001B[0m\u001B[1m\u001B[38;2;232;162;109m boolean\u001B[0m  \tcette commande vous permettra d'activer ou désactiver l'aide " +
                    "\n\t \t\t\t\t\t\tà la commande en remplassant boolean par on ou off" +
                    "\n\t\u001B[38;2;232;255;109m\u001B[1m$-------------------Help core-------------------$\u001B[0m\n");
            /*-créer un fichier,
            si créé: file created
            sinon: file exist
            */
            cls(20);
            System.out.println(helptext);
            File file = new File(file_path);
            if (file.createNewFile()) {
                System.out.println(
                        "\t\u001B[38;2;66;216;109m\u001B[1m$------------------File created-----------------$\u001B[0m");
            } else {
                System.out.println(
                        "\t\u001B[38;2;66;216;109m\u001B[1m$---------------File already exist--------------$\u001B[0m");
            }
            refresh(file_path);
            //déclare la variable conditionelle à la boucle qui permet à l'utilisateur d'éditer le fichier
            boolean stop = false;
            //declare l'objet sc en tant que scanner qui va lire l'entrée clavier
            Scanner sc = new Scanner(System.in);
            //boucle d'édition du fichier
            boolean helpTurn = true;
            boolean save_history = true;
            while (stop == false) {

                if (save_history == true) {
                    try {
                        Scanner scfile = new Scanner(new File(file_path));
                        StringBuffer sb = new StringBuffer();
                        while (scfile.hasNext()) {
                            sb.append(scfile.nextLine() + "\n");
                        }
                        scfile.close();
                        history.add(timeline, sb);
                    } catch (Exception e) {}
                }
                save_history = true;



                System.out.print("\t\t\u001B[38;2;66;216;217m\u001B[1m>>\u001B[0m\t");
                String enter = sc.nextLine().replace("\\N","\n");
                cls(20);
                if (enter.startsWith("!stop")){
                    stop = true;
                }
                else if (enter.startsWith("!suppr")){
                    try {
                        if (Integer.valueOf(enter.substring(7, enter.length())) == 0) {
                            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(file_path));
                            bufWriter.flush();
                            bufWriter.close();
                        } else {
                            Scanner scfile = new Scanner(new File(file_path));
                            StringBuffer sb = new StringBuffer();
                            for (int i = 1; scfile.hasNext(); i++) {
                                if (Integer.valueOf(enter.substring(7, enter.length())) != i) {
                                    sb.append(scfile.nextLine() + "\n");
                                    System.out.println(i);
                                } else {
                                    scfile.nextLine();
                                }
                            }
                            scfile.close();
                            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(file_path));
                            bufWriter.write(sb.toString());
                            bufWriter.close();
                        }
                    }
                    catch (Exception e){
                        System.out.println("\t\u001B[38;2;211;156;109m\u001B[1m$--------------error in suppression-------------$\u001B[0m");
                    }
                }
                else if (enter.startsWith("!modify")){
                    try {
                        Scanner scfile = new Scanner(new File(file_path));
                        StringBuffer sb = new StringBuffer();
                        for (int i = 1; scfile.hasNext(); i++) {
                            if (Integer.valueOf(enter.substring(8, enter.length()).substring(0, enter.substring(8, enter.length()).lastIndexOf(" "))) != i) {
                                sb.append(scfile.nextLine() + "\n");
                            } else {
                                sb.append(enter.substring(enter.substring(8, enter.length()).lastIndexOf(" ") + 9, enter.length()) + "\n");
                                scfile.nextLine();
                            }
                        }
                        scfile.close();
                        BufferedWriter bufWriter = new BufferedWriter(new FileWriter(file_path));
                        bufWriter.write(sb.toString());
                        bufWriter.close();
                    }
                    catch (Exception e){
                        System.out.println("\t\u001B[38;2;211;156;109m\u001B[1m$------------error in modification-------------$\u001B[0m");

                    }
                }
                else if (enter.startsWith("!open")){
                    try {
                        FileDialog hh = new FileDialog((java.awt.Frame) null);
                        hh.setVisible(true);
                        file_path = hh.getDirectory() + "/" + hh.getFile();
                    }
                    catch (Exception e){}
                }
                else if (enter.startsWith("!reload")){}
                else if (enter.startsWith("!helpturn")){
                    if (enter.substring(10, enter.length()).equals(("on"))){
                        helpTurn = true;
                    }
                    else if (enter.substring(10, enter.length()).equals(("off"))) {
                        helpTurn = false;
                    }
                }
                else if (enter.startsWith("!easter-egg")){
                    for (int i = 0; i <40; i++) {
                        System.out.print("\n\t\t");
                        for (int j = 0; j <200; j++) {
                            System.out.print("\u001B[38;2;255;"+(int)(((float)i)/40*255)+";"+(int)(((float)j)/200*255)+"m\u001B[1m█\u001B[0m");
                        }
                    }
                    System.out.println("\n");
                }
                else if (enter.startsWith("!table")){
                    //-----------------------------------------------------------pas fini --------------------------------------------------------------//
                    System.out.println("148 44 255 quel est le nombre de colonnes de ton tableau");
                    int collumn_tab = sc.nextInt();
                    System.out.println("148 44 255 quel est le nombre de lignes de ton tableau");
                    int line_tab = sc.nextInt();
                    List table = new ArrayList();
                    for (int i = 0; i < collumn_tab; i++) {
                        table.add(sc.nextLine());

                    }


                }
                else if (enter.startsWith("!undo")){
                    try{
                        if (timeline+2 < history.size()) {
                            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(file_path));
                            bufWriter.write(history.get(timeline + 1).toString().substring(0, history.get(timeline + 1).toString().length() - 1));
                            bufWriter.close();
                            timeline++;
                            save_history = false;
                        }
                    }
                    catch (Exception e){

                    }
                }
                else if (enter.startsWith("!redo")){
                    try{
                        if (timeline-2 >= 0 ) {
                            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(file_path));
                            bufWriter.write(history.get(timeline - 1).toString().substring(0, history.get(timeline - 1).toString().length() - 1));
                            bufWriter.close();
                            timeline--;
                            save_history = false;
                        }
                    }
                    catch (Exception e){

                    }

                }
                else {
                    BufferedWriter bufWriter = new BufferedWriter(new FileWriter(file_path, true));
                    bufWriter.write(enter);

                    bufWriter.close();
                }
                if (helpTurn == true){System.out.println(helptext);}
                refresh(file_path);

            }


        }
        catch (Exception e) {
            System.out.println("erreur");
        }
    }

    public static void cls(int nb) {
        for (int i = 0; i < nb; i++) {
            System.out.println("\n");
        }
    }

    public static void refresh(String file_path) throws FileNotFoundException {
        String file = file_path;
        //declare l'objet scfile en tant que Scanner qui va scanner le contennu du fichier texte
        Scanner scfile = new Scanner(new File(file));
        //ecrire les lignes une par une dans la consolle
        System.out.println("\t\u001B[38;2;66;216;217m\u001B[1m$---------------Début du document---------------$\u001B[0m");
        for (int i = 1; scfile.hasNext(); i++) {
            System.out.println("\t\t" + i + ".\t" + scfile.nextLine());
        }
        scfile.close();
    }
}
