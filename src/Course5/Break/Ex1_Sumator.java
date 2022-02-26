package Course5.Break;

import java.util.Scanner;

public class Ex1_Sumator {

    public static void main(String[] args) {

    /*
    1. Implementeaza un sumator de numere cu resurse limitate. Acest sumator va realiza suma numerelor introduse de utilizator, pana la introducerea unui numar negativ, dar nu mai mult de 10 numere. Cu alte cuvinte, sumatorul va afisa suma numerelor si se va termina in oricare dintre cele doua cazuri:

Utilizatorul a introdus deja 10 numere.
Utilizatorul introduce un numar negativ (i.e. inainte de introducerea a 10 numere).
Precizari:

In cazul in care programul se incheie prin introducerea unui numar negativ (i.e. cazul 2), acesta nu va fi insumat! Suma este alcatuita doar din valorile pozitive introduse de utilizator.
     */

        Scanner scanner = new Scanner(System.in);
        int nrNumere = 10;
        int sumator = 0;
        int x = 0;
        int i = 1;
        while (x < nrNumere) {
            System.out.println("Introuceti un numar: ");
            x = scanner.nextInt();
            if (i >= 10) {
                System.out.println("Ati introdus deja 10 numere!");
                break;
            }
            if (x < 0) {
                System.out.println("Ati introdus un numar negativ!");
                break;
            }
            sumator += x;
            System.out.println("Valoare actuala sumator: " + sumator);
            i++;
        }
        scanner.close();
    }
}
