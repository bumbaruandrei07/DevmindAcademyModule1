package Workshop01;

import java.util.Scanner;

//5. Scrie un program care verifica daca un sir de numere, citit de la tastatura, este un sir crescator.
// Programul va afisa la output mesajul Sir crescator in caz afirmativ si Nu este sir crescator in caz contrar.
// Programul citeste initial numarul de elemente ale sirului, n, urmat apoi de n numere intregi.
public class SirCrescatorSauDescrescator {


    public static void bubbleSortDoubleArray(double[] array) {
        int n = array.length;
        boolean swapped;
        double aux;

        do {
            swapped = false;

            for (int i = 1; i < n; i++) {

                if (array[i - 1] > array[i]) {
                    aux = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = aux;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static boolean esteSirDescrescator(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] > array[j]) {
                    System.out.println("Sirul este descrescator!");
                    return true;
                } else {
                    System.out.println("Sirul este crescator!");
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean esteSirCrescator(int[] array) {

        for (int i = 1; i < array.length; i++) {
           if(array[i-1] < array[i]){
               System.out.println("Sirul este crescator!");
               return true;
           }
           else{
               System.out.println("Sirul este descrescator!");
               return false;
           }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti lungimea array-ului: ");
        int lenghtOfArray = sc.nextInt();
        int[] array = new int[lenghtOfArray];
        System.out.println("Introduceti elementele array-ului: ");
        for (int i = 0; i < array.length; ++i) {
            array[i] = sc.nextInt();
        }
//        System.out.println(esteSirDescrescator(array));
        System.out.println(esteSirCrescator(array));

        sc.close();

    }
}
