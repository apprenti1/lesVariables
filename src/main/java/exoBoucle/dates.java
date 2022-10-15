package main.java.exoBoucle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class dates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("merci d'indiquer les dates sous la forme dd/mm/aa\n1ere date : ");
            String date1_text = sc.nextLine();
            LocalDate date1 = LocalDate.parse(date1_text, DateTimeFormatter.ofPattern("d/MM/uuuu"));
            System.out.println("2eme date : ");
            String date2_text = sc.nextLine();
            LocalDate date2 = LocalDate.parse(date2_text, DateTimeFormatter.ofPattern("d/MM/uuuu"));
            if (date1.getYear() >= 0
                    && date2.getYear() >= 0
                    && date1.getMonthValue() > 0
                    && date1.getMonthValue() <= 12
                    && date2.getMonthValue() > 0
                    && date2.getMonthValue() <= 12
                    &&date1.getDayOfMonth()<=jourmax(date1.getMonthValue(), date1.getYear())
                    &&date2.getDayOfMonth()<=jourmax(date2.getMonthValue(), date2.getYear())){
                System.out.println("il y a "+Math.abs((int)( (java.sql.Date.valueOf(date1).getTime() - java.sql.Date.valueOf(date2).getTime()) / (1000 * 60 * 60 * 24)))+" jours qui séparent ces deux dates.");
            }
            else {
                System.out.println("cette date ne peut etre correcte.");
            }
        }
        catch (Exception e){
            System.out.println("/!\\le format de la date entrée n'est pas correcte/!\\");
        }
    }
    public static int daysBetween(Date d1, Date d2){
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }
    public static int jourmax(int mois, int an){
        int max;
        if (mois == 4 ||mois == 6 ||mois == 9 ||mois == 11){max = 30;}
        else if (mois == 2) {
            if (an%4==0&&an%100==1||an%400==0){max=29;}
            else {max = 28;}}
        else {max=31;}
        return max;
    }
}

