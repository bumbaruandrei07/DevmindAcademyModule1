package Course06.methods;

public class Ex2 {

    public static void main(String[] args) {

        /*
         Implementeaza o metoda care primeste ca parametru un numar intreg si returneaza numarul
         de cifre al acelui numar.
         Testeaza metodaimplementata si demonstreaza functionarea corecta a acesteia prin diverse apeluri
         (in main(…)).
         */


        numarCifre(-100);
        numarCifre(10);
        numarCifre(1_879_658);

    }

    public static void numarCifre(int numar) {
        int nrCifre = 0;
        while (numar != 0) {
            int ultimaCifra = numar % 10;
            numar = numar / 10;
            nrCifre++;
        }
        System.out.println("Numarul are " + nrCifre + " cifre");
    }

}
