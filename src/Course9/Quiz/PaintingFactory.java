package Course9.Quiz;

//TODO -> Utilizand implementarea clasei Masina prezentata anterior, ce culoare va avea masina masinaNoua la revenirea in metoda main (i.e. culoarea afisata)?
public class PaintingFactory {

    public static void schimbaCuloarea(Masina m) {
        m.setCuloareCaroserie("galben");
        Masina m2 = new Masina("violet", 0);
        m2.setCuloareCaroserie("verde");
        m = m2;
    }

    public static void main(String[] args) {
        String culoareNoua = "negru";
        int varsta = 0;
        Masina masinaNoua = new Masina(culoareNoua, varsta);
        schimbaCuloarea(masinaNoua);
        System.out.println(masinaNoua.getCuloareCaroserie());
    }
}

//TODO Follow-Up -> Folosind codul prezentat in exercitiul anterior (i.e. clasele Masina si Main), unde vor fi alocate urmatoarele entitati:


//variabila culoareCaroserie
//variabila totalKm
//obiectul culoareNoua

/*
a. ''culoareCaroserie'' - pe heap, deoarece variabile este un *camp* al obiectului, prin urmare face parte din fiecare obiect. Fiecare obiect este alocat pe heap, prin urmare si orice camp al acestora (ex: primitiva, referinta, etc.) va fi tot pe heap.
b. totalKm - este o variabila primitiva *locala*, prin urmare va fi alocata pe stiva. Chiar daca face parte din implementarea unei metode a obiectului, ea este o variabila locala (este distrusa si creata de fiecare daca cand se executa metoda respectiva).
c. ''culoareNoua'' - este un *obiect*, iar orice obiect (inclusiv obiecte apartinand clasei ''String'') sunt alocate pe heap.
 */