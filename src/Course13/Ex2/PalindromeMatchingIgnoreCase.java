package Course13.Ex2;

import java.util.Scanner;

public class PalindromeMatchingIgnoreCase {

    public static boolean isPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti propozitia: ");
        String sentence = sc.nextLine();
        String[] sentenceSpilted = sentence.split("\\W+");
        System.out.println("Propozitia este: ");
        for (int i = 0; i < sentenceSpilted.length; i++) {
            System.out.print(sentenceSpilted[i] + " ");
        }
        System.out.println();
        int left = 0;
        int right = sentence.length() - 1;
        char leftPoz;
        char rightPoz;
        while (left <= right) {
            leftPoz = sentence.charAt(left);
            rightPoz = sentence.charAt(right);

            if (!Character.isLetterOrDigit(leftPoz)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightPoz)) {
                right--;
            } else {
                if (Character.toLowerCase(leftPoz) != Character.toLowerCase(rightPoz)) {
                    System.out.println("The sentence isn't  palindrome!");
                    return false;
                }
                left++;
                right--;
            }
        }
        System.out.println("The sentence is palindrome!");
        return true;
    }

    public static void main(String[] args) {
        isPalindrome();
    }
}
