package Course10;

import java.util.Scanner;

public class IdenticalLetters {

    public static String[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intoduceti numarul de elemente ale array-ului: ");
        int arrayLenght = sc.nextInt();

        String[] array = new String[arrayLenght];
        for (int i = 0; i < arrayLenght; i++) {
            System.out.println("Intoruceti stringul in array: " + (i + 1) + ":");
            array[i] = sc.next();
        }
        return array;
    }

    public static String readKey() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti key-ul: ");
        String key = sc.next();
        System.out.println("Cuvantul key filtrat este: " + key);
        return key;
    }

    public static void displayArray(String[] array, String display) {
        System.out.println(display);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + ", ");
        }
        System.out.println();
    }

    public static String[] lettersMatchIgnoreCase(String[] array, String key) {
        int count = 0;

//        aflu dimensiunea noului array care va cuprinde elementele care indeplinesc conditia
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            for (int k = 0; k < key.length(); k++) {
                if (array[i].toLowerCase().charAt(j) == key.charAt(k)) {
                    count++;
//  ies din for daca s-a indeplinit o singura data conditia pentru a nu aloca spatiu in cazul in care am mai multe litere identice intr-un singur cuvant
                    break;
                }
                j++;
                if (j == array[i].length()) {
//  ies din for daca am epuizat literele din cuvantul pe care il compar cu key
                    break;
                }
            }
        }
//        creez noul array care va cuprinde cuvintele care indeplinesc conditia
//        dimensiunea lui este cea aflata in for-ul anterior

        String[] filteredArray = new String[count];
        count = 0;

//        adaug in noul array cuvintele care indeplinesc conditia

        for (int i = 0; i < array.length; i++) {
            int j = 0;
            for (int m = 0; m < key.length(); m++) {
                if (array[i].toLowerCase().charAt(j) == key.charAt(m)) {
                    filteredArray[count] = array[i];
                    count++;
                    break;
                }
                j++;
                if (j == array[i].length()) {
                    break;
                }
            }
        }
        return filteredArray;
    }

    public static void main(String[] args) {
        String[] array = readArray();
        displayArray(array, "Elementele array-ului sunt: ");
        String key = readKey();
        displayArray(lettersMatchIgnoreCase(array, key), "Noul array are urmatoarele elemtente: ");
        System.out.println(lettersMatchIgnoreCase(array, key).length);
    }
}
