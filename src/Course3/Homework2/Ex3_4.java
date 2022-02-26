package Course3.Homework2;

import java.util.Scanner;

public class Ex3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti pin-ul: ");
        int PIN = scanner.nextInt();
        int PINCorect = 3941;
        int soldCont = 10000;
        if (PIN == PINCorect) {
            System.out.println("PIN corect!");
            System.out.println("Introduceti suma: ");
            int suma = scanner.nextInt();
            if (suma == 0) System.out.println("Introduceti o suma mai mare decat 0 RON");
            if (suma % 10 == 0) System.out.println("Suma de extras nu trebuie sa fie multiplu de 10!");
//            Suma care va fi retrasa trebuie sa fie strict pozitiva
            if (suma < 0) System.out.println("Introduceti o suma strict mai mare decat 0 RON");
            if (suma < soldCont) {
                System.out.println("Tranzactie in curs de procesare... ");
                int sumaDisponibila = soldCont - suma;

                System.out.println("Doriti afisarea noii balante a contului curent? Raspundeti cu 0 (NU) sau 1 (DA).");
                int raspuns = scanner.nextInt();
                if (raspuns == 1) System.out.println("Noul sold al contului este: " + sumaDisponibila);
                if (raspuns == 0) System.out.println("Multumim pentru ca ati ales Banca DevBank");
                else System.out.println("Trebuie sa alegeti o optiune valida: 1 sau 0");

            } else System.out.println("Fonduri insuficiente pentru realizarea tranzactiei");

        } else System.out.println("PIN gresit");

        if (PIN > 9999) System.out.println("Nu se poate introduce un PIN format din mai mult de 4 cifre!");

//Introducerea unui pin diferit de 4 cifre
        if ((PIN < 1000) || (PIN > 9999)) System.out.println("Introduceti un PIN format din 4 cifre!");

    }
}
