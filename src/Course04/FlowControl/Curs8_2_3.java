package Course04.FlowControl;

import java.util.Scanner;

public class Curs8_2_3 {
    public static void main(String[] args) {

        /*
        2.3. Se citeste un numar natural n si apoi n numere intregi. Sa se calculeze si afiseze:

numarul cu cele mai putine cifre (daca sunt mai multe astfel de numere, oricare dintre ele)
numarul cu cele mai multe cifre (daca sunt mai multe astfel de numere, oricare dintre ele)
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul de numere: ");
        int n = sc.nextInt();
        int nrMinCifre = 0, nrMaxCifre = 0, minim = 0, maxim = 0, nr, nrCifre = 0;
        for (int i = 0; i < n; i++) {
            nr = sc.nextInt();
            int nr2 = nr;
            nrCifre = 0;
            while (nr > 0) {
                nr /= 10;
                nrCifre += 1;

            }
            if (i == 0) {
                maxim = nrCifre;
                minim = nrCifre;
                nrMinCifre = nr2;
                nrMaxCifre = nr2;
            } else {
                if (nrCifre > maxim)
                    maxim = nrCifre;
                nrMaxCifre = nr2;
            }
            if (nrCifre < minim) {
                minim = nrCifre;
                nrMinCifre = nr2;
            }
            System.out.println("Numarul de cifre maxim este: " + maxim);
            System.out.println("Numarul de cifre minim este: " + minim);
            System.out.println("Numarul cu cele mai multe cifre este: " + nrMaxCifre);
            System.out.println("Numarul cu cele mai putine cifre este: " + nrMinCifre);
//            sc.close();

        }

    }
}
