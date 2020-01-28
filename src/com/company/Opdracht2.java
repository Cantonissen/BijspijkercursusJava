package com.company;

import java.util.Scanner;

public class Opdracht2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String snelheid;
        // Opdracht 2.1

        System.out.println("Opdracht 2.1");
        System.out.print("Typ het aantal mijlen: ");
        double miles = scanner.nextDouble();
        double kilometer = miles * 1.6;
        int tussenstap = (int) (kilometer * 10);
        kilometer = tussenstap / 10.0;
        System.out.println(miles + " mijl is " + kilometer + " Kilometer");

        // Opdracht 2.2
        System.out.println("Opdracht 2.2");
        System.out.print("Hoe veel jaar oud ben je? ");
        int jaar = scanner.nextInt();
        System.out.print("En hoe veel maanden komen daar bij? ");
        int leeftijdInMaanden = scanner.nextInt();
        int minutes = jaar * 365 * 24 * 60 + leeftijdInMaanden * 30 * 24 * 60;
        System.out.println("U bent ongeveer " + minutes + " minuten oud");

        // Opdracht 2.3
        System.out.println("Opdracht 2.3");
        System.out.print("Kies het startbedrag: ");
        Double bedrag = scanner.nextDouble();
        System.out.print("Typ het rentepercentage: ");
        Double rente = scanner.nextDouble();
        Double rentebedrag = rente / 100 * bedrag;
        Double totaalbedrag = bedrag + rentebedrag;
        System.out.println("Uw rente over 1 jaar is: " + rentebedrag + totaalbedrag);

        // Opdracht 2.4
        System.out.println("Opdracht 2.4");
        System.out.print("Typ een getal tussen de 10 en 100: ");
        int userInput = scanner.nextInt();
        int number1 = userInput - 2;
        int number2 = userInput - 1;
        int number3 = userInput + 1;
        int number4 = userInput + 2;
        System.out.println("De vijf getallen zijn: " + number1 + "-" + number2 + "-" + userInput + "-" + number3 + "-" + number4);

        // Opdracht 2.5
        System.out.println("Opdracht 2.5");
        System.out.print("Typ een getal tussen de 0 en 1000: ");
        userInput = scanner.nextInt();
        int lastDigit = userInput % 10;
        userInput = userInput / 10;
        int middleDigit = userInput % 10;
        userInput = userInput / 10;
        int firstDigit = userInput;
        int berekening = firstDigit * middleDigit * lastDigit;
        System.out.println("De vermenigvuldiging van de cijfers luidt: " + berekening);


    }
}
