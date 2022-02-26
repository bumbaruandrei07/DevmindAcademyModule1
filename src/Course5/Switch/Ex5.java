package Course5.Switch;

import java.util.Date;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        /*


        5. Implementeaza functionarea unui modul ATM real: se citeste de la tastatura un numar natural nenul n care corespunde unei anumite operatii ce poate fi realizata de catre ATM (exemplu: 1 - Interogare sold, 2 - Retragere numerar etc.). Vezi tabelul de mai jos pentru o lista completa de operatii disponibile. In functie de operatia solicitata, ATM-ul trebuie sa actualizeze informatiile specifice clientului curent (in cazul de fata, sold curent).

In vederea selectarii unei anumite operatii, se va folosi o structura conditionala de tip switch. Odata ce s-a terminat de efectuat operatia solicitata de utilizator, ATM-ul isi va continua executia, asteptand o noua comanda de la utilizator. Singura posibilitate de a intrerupe acest flux este introducerea unei operatii speciale de tip iesire (exemplu: 6 - Iesire).

Gandeste-te la cat mai multe cazuri de eroare si trateaza-le corespunzator (exemple: la retragerea sumei, numarul citit de la tastatura sa fie divizibil cu 10, sa fie pozitiv, sa fie mai mic decat soldul disponibil etc.)

Comanda	Descriere	Codificare (n)
Interogare Sold	Va afisa catre utilizator soldul curent	1
Retragere Numerar	Va solicita utilizatorului o suma, va verifica daca este valida, conform constrangerilor mentionate in enunt si va actualiza soldul clientului	2
Depunere Numerar	Va solicita utilizatorului o suma, va verifica daca este valida, conform constrangerilor mentionate in enunt si va actualiza soldul clientului	3
Curs Valutar	Va afisa catre utilizator cursul valutar (de exemplu conversia EUR - RON)	4
Info	Va afisa catre utilizator anumite informatii (de exemplu numele bancii, data si ora curenta, orice alte informatii doriti sa adaugati)	5
Iesire	Va intrerupe executia ATM-ului si va determina inchiderea programului	6
Ajutor	Va afisa catre utilizator lista de comenzi disponibile	orice alt numar n
 ===== Bine ati venit =====
        1. Interogare Sold
        2. Retragere Numerar
        3. Depunere
        4. Info
        5. Curs Valutar
        6. Iesire



         */
        Scanner sc = new Scanner(System.in);

        System.out.println(" ===== Bine ati venit =====");
        System.out.println(" 1. Interogare Sold");
        System.out.println(" 2. Retragere Numerar");
        System.out.println(" 3. Depunere");
        System.out.println(" 4. Info");
        System.out.println(" 5. Curs Valutar");
        System.out.println(" 6. Iesire");


        int balance = 5000;
        float euro = balance / 4.94f;
        String bankName = "UniCredit";
        boolean quit = false;
        while (!quit) {
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println(" Soldul dumneavoastra este " + balance + " RON.");
                    break;

                case 2:
                    System.out.println("Introduceti suma pe care doriti sa o retrageti: ");
                    int amount = sc.nextInt();
                    if ((amount <= balance) && (amount % 10 == 0) && (amount > 0)) {
                        balance -= amount;
                        System.out.println("Operatie efectuata cu succes!");
                        System.out.println("Soldul actual este: " + balance + " RON");

                    } else {
                        System.out.println("Suma nu este valida!");
                    }
                    break;

                case 3:
                    System.out.println("Introduceti suma pe care doriti sa o depuneti: ");
                    int sumaDepunere = sc.nextInt();
                    if (sumaDepunere > 0) {
                        balance += sumaDepunere;
                    }
                    System.out.println("Soldul actual este de : " + balance + " RON");
                    break;

                case 4:
                    System.out.println("Numele bancii este: " + bankName);
                    Date currentDate = new Date();
                    System.out.println("Data curenta este : " + currentDate);
                    break;

                case 5:
                    System.out.println("Cursul Valutar: \n\t 1 EUR = 4,94 RON");
                    System.out.println("Soldul dvs. este: " + euro + " EUR");
                    break;

                case 6:
                    System.out.println("La revedere!");
                    quit = true;
                    break;
                default:
                    System.out.println(" ===== Bine ati venit =====");
                    System.out.println(" 1. Interogare Sold");
                    System.out.println(" 2. Retragere Numerar");
                    System.out.println(" 3. Depunere");
                    System.out.println(" 4. Info");
                    System.out.println(" 5. Curs Valutar");
                    System.out.println(" 6. Iesire");
                    break;
            }
        }
        sc.close();
    }
}
