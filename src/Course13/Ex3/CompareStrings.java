package Course13.Ex3;

public class CompareStrings {

    public static int compareTwoStrings(String str1, String str2) {
        int result = 0;
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            int a = str1.charAt(i);
            int b = str2.charAt(i);
            if (a < b) {
                result = -1;
                break;
            } else if (a > b) {
                result = 1;
                break;
            }
        }
        return result;
    }

    public static int compareTwoStringsIgnoreCase(String str1, String str2) {
        int result = 0;
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            int a = str1.toLowerCase().charAt(i);
            int b = str2.toLowerCase().charAt(i);
            if (a < b) {
                result = -1;
                break;
            } else if (a > b) {
                result = 1;
                break;
            }

        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println(compareTwoStrings("Zebra","mamaia"));
        System.out.println(compareTwoStrings("Andrei", "andrei"));
        System.out.println(compareTwoStringsIgnoreCase("Andrei", "andrei"));
        System.out.println(compareTwoStringsIgnoreCase("avion", "baie"));

    }
}
