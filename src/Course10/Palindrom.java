package Course10;

import java.util.Scanner;

public class Palindrom {


    public static boolean isPalindromMethod1(String str) {

        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("The string " + str + " isn't a plindrome");
                return false;
            }
            i++;
            j--;
        }
        System.out.println("The string " + str + " is a plindrome");
        return true;
    }


    public static boolean isPalindromMethod2() {

        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string desired: ");
        original = in.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        } else {
            System.out.println("Entered string/number isn't a palindrome.");
        }
        return false;
    }

    private static void isPalindromIgnoreCase(String word) {
        Scanner sc = new Scanner(System.in);
        String checkisPalim;
        checkisPalim = sc.nextLine();
        StringBuilder sb = new StringBuilder(checkisPalim);
        String reverseStr = sb.reverse().toString();
        if (checkisPalim.equalsIgnoreCase(reverseStr)) {
            System.out.println("\nThe string " + checkisPalim + " is a Palindrome");
        } else {
            System.out.println("\nThe string " + checkisPalim + " is not a Palindrome");
        }
    }


    public static void main(String[] args) {

//        Testing method 1
        String str = "madam";
        isPalindromMethod1(str);
        isPalindromMethod1("ana");
        isPalindromMethod1("Ana");
        isPalindromMethod1("Andrei");
        isPalindromMethod1("dog");


//        Testing method 2
        isPalindromMethod2();

//        Testing method isPalimdromIgnoreCase
        System.out.println("Enter a string to check if is a Palindrome: ");
        isPalindromIgnoreCase("");

    }

}