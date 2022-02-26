package Course5.Break;

/*
3. Implementeaza un algoritm care citeste un numar intreg de la tastatura.
 Acesta afiseaza ulterior primele 3 cifre ale numarului, de la sfarsit spre inceput. (i.e. ultimele 3 cifre citie de la drepta la stanga)
Daca numarul are mai putin de 3 cifre, programul va afisa un mesaj de eroare
(i.e. Numarul introdus trebuie sa contina cel putin 3 cifre).
 */


import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int n = sc.nextInt();
        int ultimaCifra = 0;
        int nrCifre = 0;
        if (n >= 100) {
            System.out.print("Ultimele 3 cifre ale numarului " + n + " sunt: " + "-> ");
            while (n > 0) {
                ultimaCifra = n % 10;
                n = n / 10;
                nrCifre++;
                System.out.print(ultimaCifra + " ");
                if (nrCifre == 3) {
                    break;
                }
            }
        } else {
            System.out.println("Numarul introdus trebuie sa contina cel putin 3 cifre!");
        }
        sc.close();

    }


}



