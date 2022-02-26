package Course05.Break;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        /*

2. Scrie un program care afiseaza primele 5 numere impare dintr-un interval dat.
 Se vor citi de la tastatura 2 numere intregi: left respectiv right, care reprezinta capetele intervalului.
 In cazul in care in interval se gasesc mai putin de 5 numere impare, se vor afisa toate numerele impare din interval.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Capatul din stanga al intervalului: ");
        int left = sc.nextInt();
        System.out.println("Capatul din dreapta al intervalului: ");
        int right = sc.nextInt();
        int contor = 0;
        System.out.println("Numerele impare cuprinse in interval sunt: ");
        for (int i = left; i <= right; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                contor++;
            }
            if (contor >= 5) {
                System.out.println("In interval sunt mai mult de 5 numere impare!");
                break;
            }
        }
        sc.close();
    }
}
