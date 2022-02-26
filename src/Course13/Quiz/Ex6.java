package Course13.Quiz;

public class Ex6 {
    public static String splitSome(String str) {
        int it = 2;
        int ppoz = 0, poz = 0;
        String result = "";
        while (it < 5)  { //daca iteratorul incepe la 2 si trebuie sa fie mai mic decat 5 => 3 iteratii
            poz = str.indexOf(" ", ppoz);   // gaseste prima aparitie a unui spatiu gol cu metoda indexOf incepand de la pozitia ppoz din interiorul lui str primit ca parametru
            if (poz >= 0) {  // daca l-a gasit , daca nu l-ar fi gasit am fi avut -1
                System.out.println(str.substring(ppoz,poz) + " starts at " + ppoz + " and ends at " + poz);
                result += str.substring(ppoz, poz); //aduna/concateneaza de unde a inceput cautarea pana a gasit spatiul gol, practic ia fiecare cuvant si il concateneaza
                ppoz = poz + 1; //poz este unde l-a gasit pe spatiu, ppoz ia poz+1 ca sa sarim peste spatiu, ar fi gasit acelasi spatiu de foarte multe ori, trebuie sa mergem mai la dreapta ca sa cautam urmatorul spatiu
            } //el va lua cele 3 cuvinte si le va concatena in Stringul "result" fara alte spatii
            it++;
        }
        return result;
    }

    public static void main(String[] args) {
        String anotherString = "Yet another exercise with strings.";
        System.out.println(splitSome(anotherString));
    }
}
