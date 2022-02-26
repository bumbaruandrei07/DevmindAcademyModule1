package Course11;

import java.util.Arrays;
import java.util.Scanner;

public class Apps {

/*
1. Se citeste de la tastatura un sir de caractere, care poate contine spatii. Afiseaza numarul de aparitii ale fiecarui caracter din String. Precizari:

ordinea afisarii literelor este arbitrara
fiecare litera (impreuna cu numarul de aparitii) va fi afisata o singura data
formatul concret de afisare este la alegerea ta. In exemplu este prezentat doar un model de afisare.
INPUT -> "This game was fun to play!"
 */

    /*
    2. Se citeste un text de la tastatura (i.e. text), ce contine doar cuvinte si spatii libere (cu exceptia caracterului Enter / newline). Dupa citirea textului, se citesc pe rand doua cuvinte (i.e. ce nu pot contine spatii) cu semnificatia oldWord respectiv newWord. Sarcina ta este sa implementezi un algoritm de inlocuire partiala, ce inlocuieste toate aparitiile oldWord cu newWord in text, mai putin prima aparitie si ultima aparitie. Concret, regulile de inlocuire sunt:

daca oldWord nu apare deloc: nu se inlocuieste nimic.
daca oldWord apare o singura data: nu se inlocuieste nimic, fiind prima aparitie.
daca oldWord apare de 2 ori: nu se inlocuieste nimic, fiind prima respectiv ultima aparitie.
daca oldWord apare de cel putin 3 ori: se inlocuiesc toate aparitiile acestuia cu newWord, in afara de prima si ultima din text.
INPUT -> a creature is a small part of a big world
       a
       the
     */

    public static void main(String[] args) {
//        displayEachWordFromASentence();
        System.out.println(replaceWordWithAnother());
    }

    public static void displayEachWordFromASentence() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = new char[1];
        int counter = 0;

        // array cu valorile filtrate din text
        for (int i = 0; i < str.length(); i++) {
            if (counter == chars.length) {
                chars = Arrays.copyOf(chars, chars.length + 1);
            }

            if (!isDuplicate(str.charAt(i), chars)) {
                chars[counter] = str.charAt(i);
                counter++;
            }
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.printf("Character: %c appears: %d time(n).%n", chars[i], countLetters(str, chars[i]));
        }
        sc.close();
    }

    public static String replaceWordWithAnother() {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String oldWord = sc.next();
        String newWord = sc.next();
        String[] textArray = text.split("\\W+");

//        se returneaza numarul de oldWord din array
        int duplicates = countDuplicates(oldWord, textArray);
        if (duplicates < 3) {
            return text;
        }

        int counter = 0;
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].equals(oldWord)) {
                counter++;
            }

//            se inlocuieste doar atunci cand cuvantul se afla
            if (counter > 1 && counter <= duplicates - 1) {
                textArray[i] = newWord;
                counter++;
            }
        }


        return concatString(textArray);
    }

    public static int countLetters(String str, char letter) {
        int counter = 0;
        int index = str.indexOf(letter);
        while (index >= 0) {
            counter++;
            index = str.indexOf(letter, index + 1);
        }
        return counter;
    }

    public static boolean isDuplicate(char character, char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (character == array[i]) {
                return true;
            }
        }
        return false;
    }

    public static int countDuplicates(String str, String[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (str.equals(array[i])) {
                counter++;
            }
        }
        return counter;
    }

    public static String concatString(String[] array) {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            str += array[i] + " ";

        }
        return str;
    }
}
