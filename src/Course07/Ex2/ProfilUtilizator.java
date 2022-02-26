package Course07.Ex2;

import java.util.Scanner;

public class ProfilUtilizator {

    String nume;
    String prenume;
    String email;
    String nrTelefon;
    int dataNastere;
    String gen;
    int varsta;

    static Scanner sc = new Scanner(System.in);


    public void initializeazaProfil() {
        System.out.println("Introduceti numele: ");
        nume = sc.next();
        System.out.println("Introduceti prenumele: ");
        prenume = sc.next();
        System.out.println("Introduceti email-ul: ");
        email = sc.next();
        System.out.println("Introduceti numarul de telefon: ");
        nrTelefon = sc.next();
        System.out.println("Introduceti data nasterii: ");
        dataNastere = sc.nextInt();
        System.out.println("Introduceti genul: ");
        gen = sc.next();

        System.out.println("Nume utilizator: " + nume + "\n" +
                "Prenume utilizator: " + prenume + "\n" +
                "Email: " + email + "\n" + "Numar telefon: " + nrTelefon + "\n"
                + "Data nasterii: " + dataNastere + "\n" + "Genul: " + gen);
    }

    public void actualizareEmail(String emailNou) {
        System.out.println("Noua adresa de email este: " + emailNou);
        email = emailNou;


    }

    public void actualizareNumarTelefon(String numarTelefonNout) {
        System.out.println("Noul numar de telefon este: " + numarTelefonNout);
        nrTelefon = numarTelefonNout;

    }

    public void afisareVarsta(int an) {

        varsta = an - dataNastere;
        if (varsta >= 0) {
            System.out.println("Varsta: " + varsta + " ani");

        }else System.out.println("Varsta nu este valida");;
    }

    public void afisareStareInterna() {
        System.out.println("Nume utilizator: " + nume + "\n" +
                "Prenume utilizator: " + prenume + "\n" +
                "Email: " + email + "\n" + "Numar telefon: " + nrTelefon + "\n"
                + "Data nasterii: " + dataNastere + "\n" + "Genul: " + gen);
    }


    }

