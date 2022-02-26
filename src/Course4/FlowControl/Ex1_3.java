package Course4.FlowControl;

import java.util.Scanner;

public class Ex1_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int x = scanner.nextInt();
        int ultimaCifra = 0;
        boolean areCifre = true;
        int cifrePare = 0;
        int cireImpare = 0;
        int suma = 0;
        int nrCifre = 0;
        int nrCifra0 = 0, nrCifra1 = 0;
        boolean arecifra9 = false;


//        1.3.6
        ultimaCifra = x % 10;
        System.out.println("Numarul se termina in oricare dintre cifere 3,7 sau 9? R: " + ((ultimaCifra == 3) || (ultimaCifra == 7) || (ultimaCifra == 9)));

        //  1.3.5
        while (x > 0) {
            ultimaCifra = x % 10;
            if (ultimaCifra == 9)
                arecifra9 = true;
            x = x / 10;


//        1.3.1
            if (ultimaCifra % 2 == 1)
                areCifre = false;

//        1.3.2

            if (ultimaCifra % 2 == 1)
                cireImpare += 1;
            else cifrePare += 1;

//1.3.3
            suma += ultimaCifra;

//        1.3.4 && 1.3.7
            nrCifre += 1;
//        1.3.8
            if (ultimaCifra == 0)
                nrCifra0 += 1;
            else if (ultimaCifra == 1)
                nrCifra1 += 1;
        }


        System.out.println("Numarul de cifre pare este: " + cifrePare);
        System.out.println("Numarul de cifre impare este: " + cireImpare);
        System.out.println("Numarul cifrelor este: " + nrCifre);
        System.out.println("Contine numai cifre pare? R: " + areCifre);
        System.out.println("Contine mai multe cifre pare decat impare? R: " + (cifrePare > cireImpare));
        System.out.println("Suma cifrelor este divizibil cu 5? R: " + (suma % 5 == 0));
        System.out.println("Numarul cifrelor este multiplu de 3? R: " + (nrCifre % 3 == 0));
        System.out.println("Numarul contine cifra 9? R: " + arecifra9);
        System.out.println("Numarul contine o cifra? R: " + (nrCifre == 1));
        System.out.println("Numarul contine cifra 1 si cifra 0? R: " + ((nrCifra0 != 0) && (nrCifra1 != 0)));


    }


}
