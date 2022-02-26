package Course4.FOR;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
//Implementeaza un algoritm care citeste de la tastatura un numar natural n si un mesaj,
// care poate contine spatii.
// Programul va afisa mesajul de n ori,
// fiecare afisare pe cate o linie noua si insotita de numarul curent, ca in exemplul urmator:
//        # INPUT:
//        4
//        Programming is really fun!
//# OUTPUT:
//        1. Programming is really fun!
//                2. Programming is really fun!
//                3. Programming is really fun!
//                4. Programming is really fun!

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti valoarea lui n: ");
        int n = scanner.nextInt();
        System.out.println("Introduceti mesajul: ");

        String message = scanner.next();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "." + " " + message);

        }

    }
}
