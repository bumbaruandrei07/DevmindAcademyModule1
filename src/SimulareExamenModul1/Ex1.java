package SimulareExamenModul1;

import java.util.Arrays;
import java.util.Scanner;

//Implementeaza o metoda care primeste ca parametru un array de numere intregi si returneaza un array, de aceeasi dimensiune,
// care contine ultima cifra a fiecarui numar din primul array, in aceeasi ordine.
//
public class Ex1 {

    public static int[] lastDigit(int[] array) {
        int[] lastDigitArray = new int[array.length];
        for (int i = 0; i < lastDigitArray.length; i++) {
            lastDigitArray[i] = array[i] % 10;
        }
        return lastDigitArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti lungimea array-ului: ");
        int lenght = sc.nextInt();
        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            System.out.println("Elementul de pe pozitia " + i + " este " + array[i]);
        }
        System.out.println("Noul vector rezultat ce contine ultimele cifre ale elementelor primului array sunt: " + Arrays.toString(lastDigit(array)));
    }
}
