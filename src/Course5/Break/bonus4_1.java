package Course5.Break;
/*
4. Scrie un program care citeste de la tastatura numere naturale, pana la introducerea unui numar negativ.
Daca numarul citit se termina in una dintre cifrele 3, 7 sau 9, numarul este ignorat si se trece la citirea urmatoarelor numere.
In caz contrar, se afiseaza la consola „simetricul“ numarului.
 Urmareste exemplul urmator pentru detalii.

 */

import java.util.Scanner;

public class bonus4_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lastDigit = 0;
        int nrInvers = 0;
        for (int i; ; ) {
            System.out.println("Introduceti numarul: ");
            i = sc.nextInt();
            lastDigit = i % 10;
            if ((lastDigit == 3) || (lastDigit == 7) || (lastDigit == 9)) {
                System.out.println(i + " -> ");
                continue;
            }
            if (i < 0) {
                break;
            }
            System.out.print(i + " -> ");
            while (i > 0) {
                lastDigit = i % 10;
                i = i / 10;
                nrInvers = nrInvers * 10 + lastDigit;
            }
            System.out.println(nrInvers);
            //reinitializare invers
            nrInvers = 0;
        }
        sc.close();
    }
}

//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.println("Introduceti numarul de proba: ");
//        int x = scanner.nextInt();
//        int lastDigit = 0;
//        int nrInvers = 0;
//        while(x > 0){
//            System.out.println("Introduceti numarul: ");
//            x = scanner.nextInt();
//            lastDigit = x%10;
//            x = x/10;
//            if ((lastDigit == 3) || (lastDigit == 7) || (lastDigit == 9)){
//                System.out.println("Introduceti numarul: ");
//                x = scanner.nextInt();
//                continue;
//            }
//            if(x<0){
//                break;
//            }
//
//            else{
//
//                nrInvers = nrInvers * 10 +  lastDigit;
//            }
//            System.out.println("Inversul numarului citit este: " + nrInvers);
//        }
//
//
//        scanner.close();
//
//
//
//
//    }
//    }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduceti numarul: ");
//        int nr = sc.nextInt();
//        int nrInvers=0;
//        if (nr >= 0) {
//            System.out.println("Introduceti numarul: ");
//            int x = sc.nextInt();
//            while (x > 0) {
//                x = sc.nextInt();
//                int lastDigit = x % 10;
//                x = x / 10;
//                nrInvers = nrInvers * 10 + lastDigit;
//                if ((lastDigit == 3) || (lastDigit == 7) || (lastDigit == 9)) {
//                    System.out.println("Introduceti numarul: ");
//                    continue;
//                }
//                if (x < 0) {
//                    break;
//                }
//            }
//            System.out.print(x + "->" + " " + nrInvers);
//        }
//    }
//}


// ==================== MODEL ==========================


//int n = 100;
//
//        while (n >= 0) {
//        if (n % 5 != 0) {
//        n--;
//        continue;
//        }
//
//        System.out.print(n + " ");
//        n--;
//        }
//        System.out.println();
