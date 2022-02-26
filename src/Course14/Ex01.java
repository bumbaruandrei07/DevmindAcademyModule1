package Course14;

public class Ex01 {
//    Implementeaza o metoda care primeste ca parametru un array de numere intregi si o valoare cautata key. Metoda returneaza numarul total de aparitii ale cheii in array.
//
//Solutie

    public static int countingMatchesOfKey(int [] array, int key){
        int counter = 0;
        for(int i=0; i<array.length;i++) {
            if (array[i] == key){
                counter++;
            }
        }
        return counter;
    }




    public static void main(String [] args){
        int [] array = new int[] {2,3,4,5,6,2,3,3,2};
        int key = 2;
        System.out.println("Numarul de aparitii ale cheii in array este: " + countingMatchesOfKey(array,key));

    }
}
