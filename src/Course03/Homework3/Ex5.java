package Course03.Homework3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti valoarea lui n: ");
        int n = scanner.nextInt();
        int i = -1;
        System.out.println("Numerele de la i la n sunt: ");
        while (i < n) {
            i++;
            System.out.println(i);
        }

        System.out.println("Sirul numerelor impare pana la n (inclusiv), incepand cu 1, in ordine crescatoare sunt: ");
//        int j = 1;
//        while (j <= n) {
//            if (j % 2 != 0) {
//                System.out.println(j + " ");
//            }
//            j++;
//        }
        int j = 1;
        while (j <= n) {
            System.out.println(j + " ");
            j += 2;

        }


//        Cazul in care n este numar par
//        int k = n;
//        System.out.println("Sirul numerelor pare de la n la 0 (inclusiv), in ordine descrescatoare este: ");
//        while ((k >= 0)&&(k%2==0)) {
//            System.out.println(k + " ");
//            k-=2;
//        }

//        Cazul in care n este numar impar
        int p = n;
        p--;
        System.out.println("Sirul numerelor pare de la n la 0 (inclusiv), in ordine descrescatoare este: ");
        while (p >= 0) {
            System.out.println(p + " ");
            p -= 2;
        }


//        Toate numerele multiplu de 5 pana la n (inclusiv), incepand cu 0, in ordine crescatoare.

        System.out.println("Toate numerele multiplu de 5 pana la n (inclusiv), incepand cu 0, in ordine crescatoare sunt: ");
        int m = 0;
        while ((m <= n) && (m % 5 == 0)) {
            System.out.println(m + " ");
            m = m + 5;
        }
        scanner.close();
    }
}
