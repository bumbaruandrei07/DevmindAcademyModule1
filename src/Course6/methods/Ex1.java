package Course6.methods;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        /*

        1. (Ex. 4.x. - Numere prime, divizori, descompunere)
        Scrie un algoritm care citeste de la tastatura un numar n si a
        fiseaza toate numerele prime pana la n (inclusiv), incepand cu 2.
        Modularizeaza implementarea algoritmului folosind doua metode:

una care indica daca un numar este prim sau nu
Hint: returneaza true daca numarul este prim si false altfel
alta care afiseaza toate numerele prime pana la n (primit ca argument la apel)
Hint: metoda va apela functia definita anterior
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int n = sc.nextInt();
        System.out.println("Numerele prime de la 2 pana la numarul introdus sunt: ");
        displayPrimeNumbers(n);
        sc.close();

    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void displayPrimeNumbers(int n) {
        for (int j = 0; j <= n; j++) {
            if (isPrime(j)) {
                System.out.println(j + " ");
            }
        }
    }
}
