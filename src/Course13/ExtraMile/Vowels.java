package Course13.ExtraMile;

public class Vowels {

    public static int countVowels(String str) {

        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'O' || str.charAt(i) == 'I' ||
                    str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                counter++;
            }
        }
        return counter;
    }

    public static int countUniqueVowels(String str) {

        int flagA = 0;
        int flagE = 0;
        int flagI = 0;
        int flagO = 0;
        int flagU = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                flagA = 1;
            } else if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
                flagE = 1;
            } else if (str.charAt(i) == 'i' || str.charAt(i) == 'I') {
                flagI = 1;
            } else if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                flagO = 1;
            } else if (str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                flagU = 1;
            }
        }
        return flagA + flagE + flagI + flagO + flagU;
    }


    public static int countUniqueAppearanceVowels(String str) {
        int counter = 0;
        int flagA = 0;
        int flagE = 0;
        int flagI = 0;
        int flagO = 0;
        int flagU = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                flagA++;
            }
            if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
                flagE++;
            }
            if (str.charAt(i) == 'i' || str.charAt(i) == 'I') {
                flagI++;
            }
            if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                flagO++;
            }
            if (str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                flagU++;
            }
        }
        if (flagA == 1) {
            counter++;
        }
        if (flagE == 1) {
            counter++;
        }
        if (flagI == 1) {
            counter++;
        }
        if (flagO == 1) {
            counter++;
        }
        if (flagU == 1) {
            counter++;
        }
        return counter;
    }


    public static void main(String[] args) {
        System.out.println("Numarul total de vocale este: " + countVowels("Andrei va deveni programator"));
        System.out.println("Numarul de vocale unice este: " + countUniqueVowels("Andrei va deveni programator"));
        System.out.println("Numarul de vocale care apar o singura data este: " + countUniqueAppearanceVowels("Andrei va deveni instructor"));

    }
}
