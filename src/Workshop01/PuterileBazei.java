package Workshop01;

//1.1. Scrie un algoritm care citeste de la tastatura 2 numere naturale: o baza (i.e. b) si un exponent maxim (i.e. e).
// Programul va afisa toate puterile bazei, de la b0 la be (i.e. b0, b1, b2, …, be). Exemplu:
//
//// INPUT -> OUTPUT
//2 10 -> 1 2 4 8 16 32 64 128 256 512 1024
//3 8 -> 1 3 9 27 81 243 729 2187 6561


import java.util.Scanner;

public class PuterileBazei {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti baza: ");
        int baza = sc.nextInt();
        System.out.println("Introduceti exponentul: ");
        int exponent = sc.nextInt();
        int putere = 1;

        System.out.print("Puterile bazei sunt: ");
        for (int i = 0; i <= exponent; i++) {
//            la fiecare iteratie afiseaza baza la puterea i
            System.out.print(putere + " ");
            putere *= baza;
        }
        sc.close();
    }
}
