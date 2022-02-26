package Course05.Switch;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        /*
        3. Implementeaza un algoritm care citeste de la tastatura un numar n si afiseaza toate numerele naturale
        mai mici sau egale
        cu n precedate alternativ de unul dintre simbolurile +, *, ~, -, ca in exemplul urmator:
        +0 *1 ~2 -3 +4 *5 ~6 -7 +8 *9 ~10 -11 +12 *13 ~14 -15 +16 *17 ~18 -19 +20 *21
        O varianta eleganta de a implementa alternanta simbolurilor este folosind operatorul % (modulo).
        Mai exact, gandeste-te ce valori va produce la fiecare iteratie ecuatia i % 4,
        unde i este iteratorul din bucla.
         Nu cumva poti afisa simbolul corespunzator fiecarei iteratii in functie de rezultatul acestei ecuatii?
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int n = sc.nextInt();

//       Varianta cu if
        for (int i = 0; i <= n; i++) {
            if (i % 4 == 0) {
                System.out.print(" +");
            }
            if (i % 4 == 1) {
                System.out.print(" *");
            }
            if (i % 4 == 2) {
                System.out.print(" ~");
            }
            if (i % 4 == 3) {
                System.out.print(" -");
            }
            System.out.print(i);
        }
        sc.close();

//        Varianta cu switch
//        for (int i = 0; i <= n; i++) {
//            switch (i % 4) {
//                case 0:
//                    System.out.print(" +");
//                    break;
//                case 1:
//                    System.out.print(" *");
//                    break;
//                case 2:
//                    System.out.print(" ~");
//                    break;
//                case 3:
//                    System.out.print(" -");
//                    break;
//
//            }
//            System.out.println(i);
//
//        }
//        sc.close();
    }
}
