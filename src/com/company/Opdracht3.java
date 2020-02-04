package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Opdracht3 {
    public static void main(String[] args){
        // Opdracht 3.1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Opdracht 3.1");
        int random1 = (int) (Math.random() * 10 + 1);
        int random2 = (int) (Math.random() * 10 + 1);
        System.out.print("Hoeveel is " + random1 + " + " + random2 + " ? : ");
        int userInput = scanner.nextInt();
        int uitkomst = random1 + random2;
        if (userInput == uitkomst){
            System.out.println("Klopt!");
        }
        else{
            System.out.println("Het antwoord is fout! Het juiste antwoord was " + uitkomst);
        }
        // Opdracht 3.2
        System.out.println("Opdracht 3.2");
        random1 = (int) (Math.random() * 10 + 1);
        random2 = (int) (Math.random() * 10 + 1);
        int random3 = (int) (Math.random() * 10 + 1);
        System.out.print("Hoeveel is " + random1 + " x " + random2 + " x " + random3 + " ? : ");
        userInput = scanner.nextInt();
        uitkomst = random1 * random2 * random3;
        if (userInput == uitkomst) {
            System.out.println("Klopt!");
        }
        else {
            System.out.println("Het antwoord is fout! Het juiste antwoord was" + uitkomst);
        }
        //Opdracht 3.3
        random1 = (int) (Math.random() * 12 + 1);
        String maand = "Onbekend";
        switch ( random1 ) {
            case 1: maand = "january"; break;
            case 2: maand = "februari"; break;
            case 3: maand = "maart"; break;
            case 4: maand = "april"; break;
            case 5: maand = "mei"; break;
            case 6: maand = "juny"; break;
            case 7: maand = "july"; break;
            case 8: maand = "augustus"; break;
            case 9: maand = "september"; break;
            case 10: maand = "oktober"; break;
            case 11: maand = "november"; break;
            case 12: maand = "december"; break;
        }
        System.out.println("het nummer is " + random1 + " en dat is maand: " + maand);

        //Opdracht 3.4
        System.out.println("Opdracht 3.4");
        System.out.print("Welke weekdag is het nu? ( 1 = ma / 2 = di / 3 = wo / 4 = do / 5 = vr / 6 = za / 7 = zo )");
        int weekday = scanner.nextInt();
        System.out.print("En van hoeveel dagen in de toekomst wil je de weekdag berekenen?");
        int daysAhead = scanner.nextInt();
        int result = weekday + daysAhead;
        if (result >= 7) {
           result = result % 7;
        }
        String[] weekDays = {"unknown","maandag","dinsdag","woensdag","donderdag","vrijdag","zaterdag","zondag"};
        System.out.println("Vandaag is het " + weekDays[weekday] + " en over " + daysAhead + " dagen is het " + weekDays[result] + ".");

        //Opdracht 3.5
        System.out.println("Opdracht 3.5");
        System.out.print("Wat is uw gewicht (kg)? ");
        double gewicht = scanner.nextDouble();
        System.out.print("Wat is uw lengte (m)? ");
        double lengte = scanner.nextDouble();
        double teller = gewicht;
        double noemer = lengte * lengte;
        double bmi = teller/noemer;
        System.out.println("Uw BMI is " + bmi );
        String conclusie = "onbekend";
        if (bmi <= 18.5){
            conclusie = "ondergewicht heeft";
        }
        else if (bmi <= 25){
            conclusie = "goed gewicht heeft";
        }
        else if (bmi <= 30){
            conclusie = "overgewicht heeft";
        }
        else if (bmi <= 35){
          conclusie = "zwaar overgewicht heeft";
        }
        System.out.println("Als u minstens 20 jaar bent betekent dit dat u " + conclusie + ".");

        //Opdracht 3.6
        System.out.println("Opdracht 3.6");
        System.out.print("Getal 1: ");
        int getal1 = scanner.nextInt();
        System.out.print("Getal 2: ");
        int getal2 = scanner.nextInt();
        System.out.print("Getal 3: ");
        int getal3 = scanner.nextInt();
        int[] getallen = {getal1,getal2,getal3};
        Arrays.sort(getallen);
        System.out.println("Van klein naar groot: " + getallen[0] + " - " + getallen[1] + " - " + getallen[2]);
    }
}
