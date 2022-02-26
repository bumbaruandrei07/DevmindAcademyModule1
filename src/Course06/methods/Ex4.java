package Course06.methods;

/*
4. (Ex. 3.x. - Palindrom)
 Scrie un program care afiseaza toate numerele palindrom pana la o valoare n
 citita de la tastatura.
  Scrie codul modularizat, folosind cel putin o metoda care sa determine daca un numar este palindrom si
   o alta metoda care afiseaza toate numerele palindrom pana la n.
   Testeaza codul in main(…), pentru diverse valori (n).
 */


import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int n = sc.nextInt();
        System.out.println("Toate numerele palindrom pana la numarul introdus sunt: ");
        displayPalimNumbers(n);
        sc.close();

    }

    public static boolean isPalindrom(int n) {
        int nrInvers = 0;
        int currentI = n;
        while (n > 0) {
           int lastDigit = n % 10;
            nrInvers= nrInvers * 10 + lastDigit;
            n = n / 10;
        }
        //n==0 here
        return currentI == nrInvers;

    }

    public static void displayPalimNumbers(int n) {
        for (int i = 0; i <= n; i++) {
            if (isPalindrom(i)) {
                System.out.println(i + " ");
            }
        }

    }
}
