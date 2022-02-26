package Course03.Homework3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
//Scrie un algoritm care, la fiecare pas, asteapta un numar natural la intrare si afiseaza dublul numarului introdus.
//Programul se va termina atunci cand utilizatorul introduce un numar negativ.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar natural pozitiv: ");
        int n = scanner.nextInt();
        System.out.println(n);
        while (n > 0) {
            System.out.println("Dublul numarului este: " + n * 2);
            System.out.println("Introduceti un numar natural pozitiv: ");
            n = scanner.nextInt();
        }
        if (n < 0) {
            System.out.println("La revedere!");
        }
        scanner.close();

    }
}
