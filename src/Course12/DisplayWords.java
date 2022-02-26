package Course12;

import java.util.Scanner;

public class DisplayWords {
    public static void displayArray(String[] array) {
        System.out.println("{");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println("}");
    }

    public static String[] sortingArray(String[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if ((array[j].compareTo(array[min])) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                String aux = array[i];
                array[i] = array[min];
                array[min] = aux;
            }
        }
        return array;
    }

    //metoda primeste ca parametru multimea de numere si returneaza al doilea cuvant in ordine lexicografica
    public static String secondWordInArray(String[] str) {
        return str[1];
    }

    public static String lastButOneWordInArray(String[] str) {
        return str[str.length - 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente al array-ului: ");
        int arrayLenght = sc.nextInt();
        sc.nextLine();
        String[] array = new String[arrayLenght];
        System.out.println("Introduceti elementele multimii: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextLine();
        }

        sortingArray(array);
        displayArray(array);
        System.out.println(secondWordInArray(array));
        System.out.println(lastButOneWordInArray(array));

        sc.close();
    }
}
