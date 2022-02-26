package Course9.ArraysAlgo;

import java.util.Scanner;

public class Intersect {
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
        intersect(a, b);
        sc.close();
    }

    public static void intersect(int[] a, int[] b) {

        System.out.print("A ∩ B = { ");

        boolean found = false;
        int c[] = new int[a.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            found = true;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    found = false;
                }
            }
            if (!found) {
                c[k] = a[i];
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.print("}");

    }


//    public static void displayArray(int[] array, int elements) {
//        for (int i = 0; i < elements; i++) {
//            int j;
//            for (j = 0; j < i; j++) {
//                if (array[i] == array[j]) {
//                    break;
//                }
//            }
//            if (i == j) {
//                System.out.print(array[i] + " ");
//
//            }
//        }
//    }


}
