package Course13.Quiz;

public class Ex5 {
    public static void main(String[] args) {
        String sentence = "This is the original sentence.";

        char[] characters = new char[sentence.length()];
        for (int i = 0; i < characters.length / 2; i++) { // mergem pana la jumatate pt ca pe utlima poz din arrayul nostru de caractere punem caracterul care se afla pe prima pozitie
            System.out.println(i + "<->" + (sentence.length() - i - 1));
            characters[i] = sentence.charAt(characters.length - i - 1); //caracterul de pe ultima pozitie il punem pe prima, cel de pe penultima pe a doua pozitie
            characters[characters.length - i - 1] = sentence.charAt(i);
        }

//        bucata asta de cod este identica cu cea de sus, doar o suprascrie, niciun efect suplimentar... face acelasi lucru
        for (int i = 0; i < characters.length / 2; i++) {
            characters[i] = sentence.charAt(characters.length - i - 1);
            characters[characters.length - i - 1] = sentence.charAt(i);
        }

        String result = new String(characters);
        System.out.println(result);
    }
}
