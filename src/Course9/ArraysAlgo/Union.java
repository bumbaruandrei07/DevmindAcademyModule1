package Course9.ArraysAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the first array: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("A = { ");

        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
            if (i == j) {

                System.out.print(a[i] + " ");

            }
        }
        System.out.println("}");

        int m;
        System.out.print("Enter the number of elements of the second array: ");
        m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        System.out.print("B = { ");

        for (int i = 0; i < m; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (b[i] == b[j]) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(b[i] + " ");
            }
        }

        System.out.println("}");
        reunit(a, b);
        sc.close();
    }

    public static int[] reunit(int[] a, int[] b) {
        int[] union = new int[2];
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            union[i] = a[i];
            counter++;

            if (counter == union.length) {
                union = Arrays.copyOf(union, union.length * 2);
            }
        }
        for (int j = 0; j < b.length; j++) {
            union[counter] = b[j];
            counter++;

            if (counter == union.length) {
                union = Arrays.copyOf(union, union.length * 2);
            }
        }
        System.out.print("A ∪ B = { ");
        displayArray(union, counter);

        System.out.print("}");
        return union;
    }


    public static void displayArray(int[] array, int elements) {
        for (int i = 0; i < elements; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(array[i] + " ");

            }
        }
    }
}