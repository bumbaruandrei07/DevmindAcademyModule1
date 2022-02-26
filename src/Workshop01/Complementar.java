package Workshop01;

import java.util.Scanner;

public class Complementar {
//     Scrie un program care citeste de la tastatura un numar natural n si afiseaza numarul complementar,
//     astfel incat suma lor sa fie cel mai mic „numar rotund-perfect“.
//     Un „numar rotund-perfect“ este un numar care are prima cifra 1, urmata doar de 0-uri.
//     Sa consideram cateva exemple pentru a intelege mai bine:
//
//// INPUT -> OUTPUT
//123 -> 877   // Explicatie: (123 + 877 == 1000)
//             // Numarul 9877 va produce tot un numar rotund-perfect,
//             // insa nu e cel mai mic: 123 + 9877 == 10000 > 1000
//2301 -> 7699 // 2301 + 7699 == 10000

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int n = sc.nextInt();
        int nCopy = n;
        int numarCifre = 0;

        while (nCopy > 0) {
            numarCifre++;
//            cifra = nCopy % 10  - ultima cifra
            nCopy /= 10;
        }
        System.out.println("Numarul contine " + numarCifre + " cifre");

        int nrRotPerf = 1;
//        ori i =1 pana la i<= numarCifre sau de la 0 la mai mic strict decat numarCifre
        for (int i = 0; i < numarCifre; i++) {
            nrRotPerf *= 10;
        }
        System.out.println("Numarul rotund: " + nrRotPerf);
        System.out.println("Complementul este: " + (nrRotPerf - n));
        sc.close();
    }
}
