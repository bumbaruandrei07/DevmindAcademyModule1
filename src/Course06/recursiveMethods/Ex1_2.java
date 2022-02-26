package Course06.recursiveMethods;

public class Ex1_2 {
    public static void main(String[] args) {


        System.out.println("Numarul cifrelor pe care numarul il are este: " + numarCifreRecursiv(10));
        System.out.println("Numarul cifrelor pe care numarul il are este: " + numarCifreRecursiv(-11230));
        System.out.println("Numarul cifrelor pe care numarul il are este: " + numarCifreRecursiv(10123123));


        System.out.print("The number of digits obtained using the method which converts the given number into a String is: ");
        coutingDigits(1512315351);

    }

//    Metoda 2

    public static int numarCifreRecursiv(long numar) {
        if (numar / 10 == 0) {
            return 1;
        }
        return 1 + numarCifreRecursiv(numar / 10);
    }


//    Metoda 3
//    We can convert the number
//    into a string and then find the length of the string to get the number of digits in the original number.


    public static void coutingDigits(int n) {
        // converting number to string using
        String number = Integer.toString(n);
        // calculate the size of string

        System.out.println(number.length());

    }
}
