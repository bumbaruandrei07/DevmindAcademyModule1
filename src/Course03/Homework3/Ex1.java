package Course03.Homework3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfIterations = sc.nextInt();

        while (numberOfIterations < 1000) {
            System.out.println("This will never end...");
            numberOfIterations++;
        }

    }
}
