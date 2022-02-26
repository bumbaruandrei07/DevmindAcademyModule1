package Course4.FOR;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
//        Scrie un program care citeste de la tastatura un numar natural n,
//        ce reprezinta numarul de elemente, urmat de n numere intregi.
//        Programul va afisa, la final, numarul de numere pozitive
//        si respectiv numarul de numere negative introduse.
        int nrPoz = 0;
        int nrNeg = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int nr = scanner.nextInt();
            if (nr < 0) {
                nrNeg++;
//                System.out.println("Numere negative: " + nrNeg);

            } else {
                nrPoz++;
//                System.out.println("Numere pozitive: " + nrPoz);
            }

        }
        System.out.println("Numere negative: " + nrNeg);
        System.out.println("Numere pozitive: " + nrPoz);
        scanner.close();
    }


}

