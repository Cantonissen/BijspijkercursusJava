package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Opdracht4 {

    public static void main(String args[]) {
        // Voorbereiding
        Scanner scanner = new Scanner(System.in);
        char userInput;

        // Opdracht 4.1
        System.out.print("Van welk karakter wil je de ASCII waarde weten? ");
        userInput = scanner.nextLine().charAt(0);
        int asciiValue = (int) userInput;
        System.out.println("De ASCII waarde van het karakter " + userInput + " is " + asciiValue);

        // Opdracht 4.2
        System.out.print("Van welk karakter wil je weten of het een getal of letter is? ");
        userInput = scanner.nextLine().charAt(0);
        if (Character.isLetter(userInput)){
            System.out.println("De " + userInput + " is een letter!");
        } else if (Character.isDigit(userInput)){
            System.out.println("De " + userInput + " is een getal!");
        } else {
            System.out.println("De " + userInput + " is geen letter of getal!");
        }

        // Opdracht 4.3
        System.out.print("Van welke letter wil je weten of het een klinker is? ");
        userInput = scanner.nextLine().toLowerCase().charAt(0);
        if (userInput == 'a' || userInput == 'e' || userInput == 'i' || userInput == 'o' || userInput == 'u'){
            System.out.println("De " + userInput + " is een klinker");
        } else {
            System.out.println("De " + userInput + " is een medeklinker");
        }

        // Opdracht 4.4
        System.out.print("Van welke letter wil je het nummer weten? ");
        userInput = scanner.nextLine().toLowerCase().charAt(0);
        if (userInput == 'a' || userInput == 'b' || userInput == 'c') {
            System.out.println("De letter " + userInput + " staat op de 2-toets.");
        } else if (userInput == 'd' || userInput == 'e' || userInput == 'f') {
            System.out.println("De letter " + userInput + " staat op de 3-toets");
        } else if (userInput == 'g' || userInput == 'h' || userInput == 'i') {
            System.out.println("De letter " + userInput + " staar op de 4-toets");
        } else if (userInput == 'j' || userInput == 'k' || userInput == 'l') {
            System.out.println("De letter " + userInput + " staat op de 5-toets");
        } else if (userInput == 'm' || userInput == 'n' || userInput == 'o') {
            System.out.println("De letter " + userInput + " staat op de 6-toets");
        } else if (userInput == 'p' || userInput == 'q' || userInput == 'r' || userInput == 's') {
            System.out.println("De letter " + userInput + " staat op de 7-toets");
        } else if (userInput == 't' || userInput == 'u' || userInput == 'v') {
            System.out.println("De letter " + userInput + " staat op de 8-toets");
        } else if (userInput == 'w' || userInput == 'x' || userInput == 'y' || userInput == 'z') {
            System.out.println("De letter " + userInput + " staat op de 9-toets");
        }

        // Opdracht 4.5
        int randomLetter = (int) (Math.random() * 26 + 97);
        char asciiCharacter = (char) randomLetter;
        System.out.println("Uw willekeurige letter is de '" + asciiCharacter + "'");

        // Opdracht 4.6

        System.out.print("Typ een string: ");
        String userString = scanner.nextLine();
        int lenght = userString.length();
        char firstChar = userString.charAt(0);
        char lastChar = userString.charAt(lenght - 1);
        System.out.println("De lengte van de string is " + lenght + ".");
        System.out.println("Het eerste karakter is " + firstChar + ".");
        System.out.println("Het laatste karakter is " + lastChar + ".");

        // Opdracht 4.7
        System.out.print("Land 1: ");
        String country1 = scanner.nextLine();
        System.out.print("Land 2: ");
        String country2 = scanner.nextLine();
        System.out.print("Land 3: ");
        String country3 = scanner.nextLine();
        String[] countries = {country1, country2, country3};
        Arrays.sort(countries);
        System.out.println(countries[0] + " - " + countries[1] + " - " + countries[2]);
    }
}
