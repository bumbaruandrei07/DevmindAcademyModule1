package Course13.Ex1;

import java.util.Scanner;

public class SentenceMatchingIgnoreCase {

    public static String[] readSentence() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti propozitia: ");
        String sentence = sc.nextLine();
        String[] sentenceSplited = sentence.split("\\W+");
        System.out.println("Propozitia este: ");
        for (int i = 0; i < sentenceSplited.length; i++) {
            System.out.print(sentenceSplited[i] + " ");
        }
        System.out.println();
        return sentenceSplited;
    }

    public static String[] readTheFirstLetterOfSentence() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti propozitia: ");
        String sentence = sc.nextLine();
        String[] splitWithLimit = sentence.split("\\W+", 0);
        System.out.println("Propozitia este: ");
        for (int i = 0; i < splitWithLimit.length; i++) {
            System.out.print(splitWithLimit[i] + " ");
        }
        System.out.println();
        return splitWithLimit;
    }

    public static String readKey() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti key-ul: ");
        String key = sc.next();
        System.out.println("Cuvantul cheie este: " + key);
        return key;
    }

    public static int numberOfMatchedLettersWithTheKey() {
        int counter = 0;
        String[] array = readSentence();
        String key = readKey();
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            for (int k = 0; k < key.length(); k++) {
                if (array[i].toLowerCase().charAt(j) == key.toLowerCase().charAt(k)) {
                    counter++;
                    break;
                }
                j++;
                if (j == array[i].length()) {
                    break;
                }
            }
        }
        return counter;
    }

    public static int numberOfFirstMatchedLettersWithTheKey() {
        int counter = 0;
        String[] array = readTheFirstLetterOfSentence();
        String key = readKey();
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            for (int k = 0; k < key.length(); k++) {
                if (array[i].toLowerCase().charAt(0) == key.toLowerCase().charAt(0)) {
                    counter++;
                    break;
                }
                j++;
                if (j == array[i].length()) {
                    break;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        System.out.println("Numarul de cuvinte care contin cel putin un caracter din cheie este: " + numberOfMatchedLettersWithTheKey());
        System.out.println("Numarul de cuvinte care incep cu oricare dintre literele cheii este: " + numberOfFirstMatchedLettersWithTheKey());

    }
}
