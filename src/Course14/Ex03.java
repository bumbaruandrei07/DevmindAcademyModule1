package Course14;

import java.util.Arrays;

public class Ex03 {

    private static boolean search(String[] array, String value) {
        for (int i=0; i<array.length; i++) {
            if (array[i] != null && array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static String[] removeDups(String[] names) {

        if (names == null) {
            return null;
        }

        // 1. compute the array of Strings with no duplicates
        String[] uniqueNames = new String[names.length];
        int uniqueNamesN = 0;

        for(int i=0; i<names.length; i++) {
            // if the result-array does not already contain the 'names[i]' element
            //    then add the element to the result-array
            if (!search(uniqueNames, names[i])) {
                uniqueNames[uniqueNamesN] = names[i];
                uniqueNamesN++;
            }
        }

        // 3. copy all elements in a new array with the correct length
        return Arrays.copyOf(uniqueNames, uniqueNamesN);
    }


    public static void main(String[] args){



    }
}
