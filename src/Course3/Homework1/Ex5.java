package Course3.Homework1;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti valoarea pentru a: ");
        int a = scanner.nextInt();
        System.out.println("Introduceti valoarea pentru b: ");
        int b = scanner.nextInt();
        System.out.println("Introduceti valoarea pentru c: ");
        int c = scanner.nextInt();
        System.out.println("Numerele introduse sunt: " + "\n\t" + "a = " + a + "\n\t" + "b = " + b + "\n\t" + "c = " + c);
        String aux1 = (a > b) && (a > c) ? "DA" : "NU";
        System.out.println("Este a cel mai mare numar? Raspuns: " + aux1);
        String aux2 = (b < a) && (b < c) ? "DA" : "NU";
        System.out.println("Este b cel mai mic numar? Raspuns: " + aux2);
        String aux3 = (a + b) < c ? "DA" : "NU";
        System.out.println("Este suma numerelor a si b mai mica decat c? Raspuns: " + aux3);
        String aux4 = c > (a + b) / 2 ? "DA" : "NU";
        System.out.println("Este c mai mare decat media aritmetica dintre a si b? Raspuns: " + aux4);
        String aux5 = (a * b * c) > 100 ? "DA" : "NU";
        System.out.println("Depaseste produsul numerelor valoarea 100? Raspuns: " + aux5);
        int aux6 = (a + c) % 2;
        String aux7 = aux6 == 0 ? "DA" : "NU";
        System.out.println("Este suma numerelor a si c divizibila cu 2? Raspuns: " + aux7);
        int aux8 = a % b;
        String aux9 = (aux8 == 0) && (a > b) ? "DA" : "NU";
        System.out.println("Este a multiplu al numarului b? Raspuns: " + aux9);
        int aux10 = a % c;
        String aux11 = b > aux10 ? "DA" : "NU";
        System.out.println("Este b mai mare decat restul impartirii lui a la c? Raspuns:" + aux11);
        int aux12 = a - c;
        String aux13 = b % aux12 == 0 ? "DA" : "NU";
        System.out.println("Se imparte exact b la diferenta numerelor a si c? Raspuns:" + aux13);
        String aux14 = (a == b) && (b == c) ? "DA" : "NU";
        System.out.println("Sunt cele 3 numere egale? Raspuns: " + aux14);
        String aux15 = (a == b) || (a == c) || (b == c) ? "DA" : "NU";
        System.out.println("Sunt cel putin doua dintre numere egale (oricare doua)? Raspuns:" + aux15);
        scanner.close();
    }
}
