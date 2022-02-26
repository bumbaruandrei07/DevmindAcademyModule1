package Course13.StringBuilder;

public class Ex1 {
    //Sa implementam o metoda care primeste ca parametru un Array de String-uri si returneaza primul sir de caractere,
    // in ordine lexicografica. Ulterior, sa testam metoda in main.

    public static String getFirstString(String[] values) {
        if (values.length == 0) {
            return "";
        }

        String result = values[0];
        for (int i=1; i<values.length; i++) {
            if (result.compareTo(values[i]) > 0) {// i.e. result > values[i]
                result = values[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] nume= {"Andrei", "Andreea", "Andrea",
                "Marius", "Marcus", "Marcel", "Florin"};
        System.out.println(getFirstString(nume));
    }
}
