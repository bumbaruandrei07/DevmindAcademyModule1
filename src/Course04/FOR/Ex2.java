package Course04.FOR;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
//        (Instructiuni iterative. 'while' - Ex. 2) Scrie un program care afiseaza urmatoarele siruri de numere, dupa citirea unei valori n de la tastatura. De aceasta data, foloseste instructiunea iterativa for in implementare:
//
//        Sirul numerelor naturale pana la n (inclusiv), incepand cu 0, in ordine crescatoare.
//        Sirul numerelor impare pana la n (inclusiv), incepand cu 1, in ordine crescatoare.
//        Sirul numerelor pare de la n la 0 (inclusiv), in ordine descrescatoare.
//        Toate numerele multiplu de 5 pana la n (inclusiv), incepand cu 0, in ordine crescatoare.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti valoarea lui n: ");
        int n = scanner.nextInt();
//        int i = -1;
        System.out.println("Sirul numerelor naturale pana la n (inclusiv), incepand cu 0, in ordine crescatoare este: ");
        for (int i = 0; i <= n; i++) {

            System.out.println(i);
        }


        System.out.println("Sirul numerelor impare pana la n (inclusiv), incepand cu 1, in ordine crescatoare sunt: ");


        for (int j = 1; j <= n; j++) {
            if (j % 2 != 0) {
                System.out.println(j + " ");
            }
        }


        System.out.println("Sirul numerelor pare de la n la 0 (inclusiv), in ordine descrescatoare este: ");
        for (int k = n; k >= 0; k--) {
            if (k % 2 == 0) {
                System.out.println(k + " ");
            }
        }

        System.out.println("Toate numerele multiplu de 5 pana la n (inclusiv), incepand cu 0, in ordine crescatoare sunt: ");
        for (int m = 0; m <= n; m += 5) {
            if (m % 5 == 0) {
                System.out.println(m + " ");
            }
        }

        scanner.close();

    }
}
