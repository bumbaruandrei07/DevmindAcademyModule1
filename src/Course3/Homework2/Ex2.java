package Course3.Homework2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti valoarea lui n: ");
        int n = scanner.nextInt();
        if (n % 2 == 0) System.out.println(n + " -> Numarul " + n + " este par.");
        else System.out.println(n + " -> Numarul " + n + " este impar.");
        scanner.close();
    }
}
