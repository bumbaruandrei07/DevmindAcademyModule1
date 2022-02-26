package Course05.Switch;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
//        4. Se citeste de la tastatura un numar natural n.
//        Sa se afiseze toate numerele naturale,
//        in ordine crescatoare, pana la n, care au ultima cifra diferita de 1, 0 si 8. De exemplu:

//# INPUT: n == 20
//2 3 4 5 6 7 9 12 13 14 15 16 17 19

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int n = sc.nextInt();
//        int lastDigit = 0;
        for (int i = 0; i <= n; i++) {

            switch (i % 10) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 9:
                    System.out.println(i);
//                    i++;
                    break;
                default:
                    break;
            }


        }

        sc.close();
    }
}
