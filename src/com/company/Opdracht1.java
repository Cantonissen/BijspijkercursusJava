package com.company;

public class Opdracht1 {

    public static void main(String[] args) {
        // Opdracht 1
        System.out.println("Opdracht 1");
        System.out.println("Java is object georienteerd");
        System.out.println("Java is strongly typed");
        System.out.println("Java is geen JavaScript");
        // Opdracht 2
        System.out.println("Opdracht 2");
        for (int i = 0; i <5 ; i++) {
            System.out.println("Java is geweldig");
        }
        // Opdracht 3
        System.out.println("Opdracht 3");
        System.out.println("a\ta^2\ta^3\ta^4");
        System.out.println("1\t1\t1\t1");
        System.out.println("2\t4\t8\t16");
        System.out.println("3\t9\t27\t81");
        System.out.println("4\t16\t64\t256");

        // Opdracht 4
        System.out.println("Opdracht 4");
        double teller = 7.5 * 6.5 - 4.5 * 3;
        double deler = 47.5 * 5.5;
        double breuk = teller/deler;
        System.out.println(breuk);

        // Opdracht 5
        System.out.println("Opdracht 5");
        int optellen = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        System.out.println(optellen);

        // Opdracht 6
        System.out.println("Opdracht 6");
        double netnietPI = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);
        System.out.println(netnietPI);

        // Opdracht 7
        System.out.println("Opdracht 7");
        double pi = 3.14159;
        double straal = 6.5;
        double oppervlakte = straal * straal * pi;
        double omtrek = 2 * straal * pi;
        System.out.println("oppervlakte = " + oppervlakte);
        System.out.println("omtrek = " + omtrek);

        // Opdracht 8
        System.out.println("Opdracht 8");
        double lengte = 5.3;
        double breedte = 8.6;
        double oppervlakte2 = lengte * breedte;
        double omtrek2 = 2 * (lengte + breedte);
        System.out.println(oppervlakte2);
        System.out.println(omtrek2);
    }
}
