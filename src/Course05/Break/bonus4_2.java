package Course05.Break;


/*
4.1. Aceeasi problema, doar ca de aceasta data se ignora numerele care incep cu (i.e. au prima cifra) una dintre cifrele 3, 7 sau 9.
Un exemplu de executie este prezentat in continuare:
 */


import java.util.Scanner;

public class bonus4_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lastDigit = 0;
        int nrInvers = 0;
        int firstDigit = 0;
        for (int i; ; ) {
            System.out.println("Introduceti numarul: ");
            i = sc.nextInt();
//            System.out.println(i + " -> ");
            if (i < 0) {
                break;
            }

            System.out.print(i + " -> ");
            while (i > 0) {
                lastDigit = i % 10;
                i = i / 10;
                nrInvers = nrInvers * 10 + lastDigit;

//                CAND IESE DIN BUCLA ASTA i-ul va fi 0 !
            }


            firstDigit = nrInvers % 10;

            if ((firstDigit == 3) || (firstDigit == 7) || (firstDigit == 9)) {
                nrInvers = 0;
                System.out.println();
                continue;

            }

            System.out.println(nrInvers);
            //reinitializare invers
            nrInvers = 0;

        }
        sc.close();
    }
}

