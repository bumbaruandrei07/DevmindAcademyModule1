package Course03.Homework2;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul lunii: ");
        int luna = scanner.nextInt();
        if (luna == 1) System.out.println(luna + " -> Ianuarie");
        if (luna == 2) System.out.println(luna + " -> Februarie");
        if (luna == 3) System.out.println(luna + " -> Martie");
        if (luna == 4) System.out.println(luna + " -> Aprilie");
        if (luna == 5) System.out.println(luna + " -> Mai");
        if (luna == 6) System.out.println(luna + " -> Iunie");
        if (luna == 7) System.out.println(luna + " -> Iulie");
        if (luna == 8) System.out.println(luna + " -> August");
        if (luna == 9) System.out.println(luna + " -> Septembrie");
        if (luna == 10) System.out.println(luna + " -> Octombrie");
        if (luna == 11) System.out.println(luna + " -> Noiembrie");
        if (luna == 12) System.out.println(luna + " -> Decembrie");
        scanner.close();
    }
}
