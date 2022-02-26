package Course05.Switch;

import java.util.Scanner;

public class BONUS {

    public static void main(String[] args) {
        /*
        Scrie o aplicatie care afiseaza toate lunile calendaristice (in limba romana) care incep cu o anumita litera,
        introdusa de utilizator de la tastatura. Daca se introduce o litera invalida (i.e. ce nu corespunde niciunei luni)
        se va afisa mesajul Nicio luna nu incepe cu litera '<letter>'.. Daca unei litere corespund mai multe luni,
         acestea vor fi afisate in ordine calendaristica.
         Programul este „case insensitive“, adica nu face distinctia intre litere mari si mici.
          Programul va cicla, permitand utilizatorului sa introduca noi litere,
           pana la intalnirea literelor X sau x care vor duce la incheierea programului. La iesirea din aplicatie,
        aceasta va afisa mesajul specific Programul se inchide…. Iata un scenariu de utilizare:
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti caracterul: ");
        boolean quit = false;
        while (!quit) {
            char caracter = sc.next().charAt(0);
            switch (caracter) {
                case 'a', 'A':
                    System.out.println("Aprilie \nAugust");
                    break;

                case 'f', 'F':
                    System.out.println("Februarie");
                    break;

                case 'i', 'I':
                    System.out.println("Ianuarie \nIunie\nIulie");
                    break;

                case 'm', 'M':
                    System.out.println("Martie \nMai");
                    break;

                case 's', 'S':
                    System.out.println("Septembrie");
                    break;

                case 'o', 'O':
                    System.out.println("Octombrie");
                    break;

                case 'n', 'N':
                    System.out.println("Noiembrie");
                    break;

                case 'd', 'D':
                    System.out.println("Decembrie");
                    break;

                case 'x', 'X':
                    quit = true;
                    System.out.println("Programul se inchide...");
                    break;
            }

        }
        sc.close();
    }

}
