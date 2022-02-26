package Course10;

import java.util.Arrays;

public class SortAlgo {

    public static void bubbleSortArrayOfStrings(String[] arr, int n) {
        String aux;

        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                if (arr[j].compareTo(arr[i]) > 0) {
                    aux = arr[j];
                    arr[j] = arr[i];
                    arr[i] = aux;
                }
            }
        }
    }


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


    public static String[] selectionSort(String[] array) {
        String[] sortedArray = new String[array.length];
        String min;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].charAt(0) < min.charAt(0)) {
                    min = array[j];
                }
            }
            sortedArray[i] = min;

        }
        return sortedArray;
    }


    public static void main(String[] args) {
        double[] doublesArray = {7.2, 5.1, 9.3, 12.5, 3.2, 1.1};
        bubbleSortDoubleArray(doublesArray);
        System.out.println(Arrays.toString(doublesArray));

        String[] arrayOfStrings = {"CasaDePapel", "Banca", "Artefact", "Martie"};
        int n = arrayOfStrings.length;
        bubbleSortArrayOfStrings(arrayOfStrings, n);
        System.out.println("Strings in sorted order are : ");
        for (int i = 0; i < n; i++)
            System.out.println("String " + (i + 1) + " is " + arrayOfStrings[i]);

        System.out.println();
        System.out.println();
        System.out.println("============selection sort==============");
        selectionSort(arrayOfStrings);
        System.out.println(Arrays.toString(arrayOfStrings));
    }
}
