package Course04.FlowControl;

import java.util.Scanner;

public class Curs8_Ex2 {
    public static void main(String[] args) {

//        2.2. Se citeste un numar natural n si apoi n numere intregi. Sa se calculeze si afiseze:
//
//        numarul de numere divizibile cu 7
//        numarul de numere care au suma cifrelor divizibila cu 5
//        numarul de numere care au ultima cifra 3, 7 sau 9
//        numarul total de cifre ale numerelor (i.e. suma numarului de cifre al tuturor numerelor)
//        numarul de numere care au prima cifra 2


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul de numere: ");
        int n = sc.nextInt();
        int nr, nrMod7 = 0;
        int ultimaCifra = 0;
        int sumaCifre = 0;
        int nrCifreMod5 = 0;
        int ultimaCifra379 = 0;
        int nrTotalCifre = 0;
        int nrPrimaCifra2 = 0;
        for (int i = 0; i < n; i++) {
            nr = sc.nextInt();
//        2.2.1 Nr de numere divizibile cu 7
            if (nr % 7 == 0) {
                nrMod7 += 1;
            }
//         2.2.3. Numarul de numere care au ultima cifra 3, 7 sau 9
            if ((nr % 10 == 3) || (nr % 10 == 7) || (nr % 10 == 9)) {
                ultimaCifra379 += 1;

            }

            //    2.2.2 Numarul de numere care au suma cifrelor divizibila cu 5
//                    2.3.5. Numarul de numere care au prima cifra 2

            while (nr > 0) {
                ultimaCifra = nr % 10;
                nrTotalCifre += 1;
                nr /= 10;

            }
            if (sumaCifre % 5 == 0) {
                nrCifreMod5 += 1;

            }
            if (ultimaCifra == 2) {
                nrPrimaCifra2 += 1;

            }


            System.out.println("Numarul de numere divizibile cu 7 este: " + nrMod7);
            System.out.println("Numarul de numere care au suma cifrelor divizibila cu 5 este: " + nrCifreMod5);
            System.out.println("Numerele care au ultima cifra 3,7 sau 9 sunt: " + ultimaCifra379);
            System.out.println("Numarul total de cifre ale numerelor este: " + nrTotalCifre);
            System.out.println("Numerele care au prima cifra 2 sunt: " + nrPrimaCifra2);

        }
        sc.close();
    }


}
