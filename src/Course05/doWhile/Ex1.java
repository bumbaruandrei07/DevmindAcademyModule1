package Course05.doWhile;

import java.util.Scanner;

/*

1. Folosind instructiunea invatata do-while, implementeaza un joc in care utilizatorul trebuie sa ghiceasca un numar magic. Astfel, variabila int numarMagic va fi initializata la o valoare intreaga, in intervalul [0, 10]. Ulterior, utilizatorul va introduce numere de la tastatura iar programul tau ii va da acestuia indicatii despre numarul introdus:

Daca numarul introdus nu se afla in interval, programul va afisa mesajul: Atentie! Numarul magic se afla in intervalul [0, 10]
Daca numarul este mai mare decat numarul magic, programul va afisa mesajul: Esti aproape! Dar numarul magic este mai mic.
Daca numarul introdus este mai mic, se va afisa:Esti aproape! Dar numarul magic este mai mare.
Cand numarul este ghicit, se va afisa: Ai ghicit, bravo!


 */


public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nrMagic = 5;
        System.out.println("Bun venit! Te invitam sa ghicesti numarul, aflat in intervalul [0, 10]");
        System.out.println("Incearca-ti norocul:");
        int n;
        do {
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Atentie! Numarul magic se afla in intervalul [0, 10]");
                System.out.println("Incearca-ti norocul:");
                n = sc.nextInt();
            }
            if (n > 10) {
                System.out.println("Atentie! Numarul magic se afla in intervalul [0, 10]");
                System.out.println("Incearca-ti norocul:");
                n = sc.nextInt();
            }
            if (n < nrMagic) {
                System.out.println("Esti aproape! Dar numarul magic este mai mare");
                System.out.println("Incearca-ti norocul:");
            }
            if (n > nrMagic) {
                System.out.println("Esti aproape! Dar numarul magic este mai mic");
                System.out.println("Incearca-ti norocul:");
            }
            if (n == nrMagic) {
                System.out.println("Ai ghicit, bravo!");
                break;
            }

        } while ((0 <= n) && (n <= 10));
        sc.close();
    }

}
