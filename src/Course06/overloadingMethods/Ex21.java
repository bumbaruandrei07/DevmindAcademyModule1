package Course06.overloadingMethods;

/*
2.1. Defineste o metoda iterativa (i.e. multiplyWithSumI(int, int)) care realizeaza inmultirea
 a doua numere (i.e. a si b) folosind doar operatorul de adunare. De exemplu, pentru a calcula a * b
se poate realiza o metoda care sa adune a + a + … + a de b ori sau b + b + … + b de a ori.
 */


public class Ex21 {
    public static void main(String[] args) {
        System.out.println(multiplyWithSumI(6, 5));

    }

    public static int multiplyWithSumI(int a, int b) {
        int copie = 0;
        for (int i = 1; i <= b; i++) {
            copie += a;
        }
        //Daca nu foloseam copia atunci valoarea lui a se actualiza folosind noua sa valoare, nu cea initiala!
        return copie;
    }
}
