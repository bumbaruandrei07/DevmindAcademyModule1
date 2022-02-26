package Course5.Switch;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
/*

1. Folosind instructiunea switch,
 scrie un program care citeste de la tastatura un caracter si afiseaza un cuvant (la alegere)
  care incepe cu acel caracter. Tratati doar cazurile pentru caracterele d, e, v,
  si afisati un mesaj de eroare corespunzator pentru orice alte litere introduse.
 */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti caracterul: ");
        char caracter = sc.next().charAt(0);
        switch (caracter) {
            case 'd':
                System.out.println("Dinamo");
                break;
            case 'e':
                System.out.println("Everton");
                break;
            case 'v':
                System.out.println("Villareal");
                break;
            default:
                System.out.println("Nu ai introdus un caracter valid");
                break;
        }

        sc.close();


    }
}
