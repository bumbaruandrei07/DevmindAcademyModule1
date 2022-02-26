package Course13.Quiz;

public class Ex4 {
    public static void main(String[] args) {
        String aString = "Learning programming is challenging";

        char[] letters = new char[aString.length()];
        for (int i=0; i<aString.length(); i++) {
            letters[i] = aString.charAt(aString.length() - i - 1); //afiseaza array-ul de char in ordine inversa
        }
        System.out.println(" ================ PRIMA VERIFICARE =============");
        System.out.println(letters);
        System.out.println("=================================");

        int start = 0, end = 0;
        while(end < letters.length) {
            while (end < letters.length && !Character.isWhitespace(letters[end])) {
                end++;
            }
            for (int i=start; i<(start+end)/2; i++) {
                char aux = letters[i];
                letters[i] = letters[end - i - 1 + start];
                letters[end - i - 1 + start] = aux;
            }
            while (end < letters.length && Character.isWhitespace(letters[end])) {
                end++;
            }
            start = end;
        }
        String result = new String(letters);
        System.out.println(result);
    }
}
