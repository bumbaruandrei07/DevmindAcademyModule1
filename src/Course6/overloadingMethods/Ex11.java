package Course6.overloadingMethods;


/*
1.1. Scrie o metoda iterativa care primeste ca parametru un numar si returneaza numarul de cifre al acelui numar
 */

public class Ex11 {
    public static void main(String[] args) {

        System.out.println("Numarul are " + numarCifre(500) + " cifre.");
        System.out.println("Numarul are " + numarCifre(-1023) + " cifre.");
        System.out.println("Numarul are " + numarCifre(-1234123500) + " cifre.");
    }

    public static int numarCifre(int numar) {
        int nrCifre = 0;
        while (numar != 0) {
            int ultimaCifra = numar % 10;
            numar = numar / 10;
            nrCifre++;
        }
        return nrCifre;
    }
}
