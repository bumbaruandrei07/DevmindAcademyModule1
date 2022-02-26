package Course03.Homework3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
/*
 Implementeaza un modul software care citeste de la tastatura urmatoarele date (in ordine):

un mesaj (i.e. message): un sir de caractere (ce poate contine spatii)
un prag valoric (i.e. upperLimit): un numar intreg
o valoare de decrementare (i.e. dec): un numar intreg, pozitiv
Programul va numara descrescator de la upperLimit (inclusiv) pana la 0 (inclusiv) si va afisa la consola mesajul
 message urmat de un tab si apoi de valoarea curenta din sir.
 De asemenea, se mai afiseaza 2 mesaje speciale:
 Start counting… la inceput si respectiv End counting… la sfarsit. Pentru claritate, urmareste si exemplul urmator:
 */

        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(message + "\t" + n);
        while (k <= n && k > 0) {

            System.out.println(message + "\t" + (n -= k));
        }
        System.out.println("End counting...");

//        if (k <= n && k > 0) {
//        System.out.println(message + "\t" + n);
//            System.out.println("Start counting...");
//
//            while (n>0) {
//System.out.println(message + "\t" + (n -= k));
//            }
//  System.out.println("End counting...");
//        }
        scanner.close();
    }
}
