package Course14;

//
//Implementeaza o metoda generica de cautare a unui sir de caractere intr-un vector de siruri de caractere.
// Metoda trebuie sa ia in considerare toate cazurile posibile,
// inclusiv cazurile in care in array se pot afla valori nule, array-ul este nul sau cheia este nula.
public class Ex02 {
    public static boolean genericSearch(String[] array, String value) {
        if (array == null || array.length == 0) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(value) ||
                    array[i] == null && value == null) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] array = new String[]{"Andrei", "Ananas", "Mihai"};
        String value = "Andrei";

        System.out.println(genericSearch(array, value));

    }
}
