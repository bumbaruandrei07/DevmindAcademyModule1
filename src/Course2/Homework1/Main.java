package Course2.Homework1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


//       Ex1
// .... Afisare ....
//        Apelul metodei  de afisare
        displayPerson();

//        EX1 - METHOD 2
//        String firstname = "Marius";
//        String lastname = "Petrescu";
//        int age = 35;
//        double height = 1.89;
//        int childrens = 3;
//        String afisare = firstname + " " + lastname + " " + "are" + " "
//                + age +  " " + "ani," +
//                height + " " + "metri inaltime si" + " " +
//                childrens + " " +"copii.";
//        System.out.println(afisare);


//        EX2 -> Method 1

        byte aSmallValue = 23;
        int anIntegerBigValue = 15_000;
        double aFloatValue = 237.01;

        double sum = aSmallValue + anIntegerBigValue + aFloatValue;
        System.out.println(sum);

//EX 2 -> METHOD 2
        sumOfNumbers((byte) 23, 15_000, 237.01);

//EX3
        double precisionError = 0.001;
        int theApproximateResult = 123003;

        String experimentName = "The maximum speed achieved by the object.";

        System.out.println("Experiment: " + experimentName);
        System.out.println("Final speed result: " + theApproximateResult + precisionError);

//        EX4

        double floatValue1 = 2.5, floatValue2 = 1.5;
        int roundNumber = 10;
        String strValue = "string operand";

        System.out.println("Sum is: " + floatValue1 + floatValue2);
        System.out.println("floatValue1" + floatValue2);
        System.out.println(roundNumber + floatValue2 + roundNumber + "strValue" + floatValue1);
        System.out.println(strValue + floatValue1 + floatValue2);
/*Sum is: 2.51.5
floatValue11.5
21.5strValue2.5
string operand2.51.5
 */

//EX1 - Citirea de la tastatura - Method1

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti valoarea primului numar: ");
        float a = sc.nextFloat();
        System.out.println("Introduceti valoarea pentru al doilea numar: ");
        float b = sc.nextFloat();
        System.out.println("Introduceti valoarea pentru al treilea numar: ");
        float c = sc.nextFloat();
        double d = a + b + c;
        System.out.println("Suma celor 3 numere reale este: " + d);
        sc.close();


    }

    public static void displayPerson() {
        String prenume = "Marius";
        String nume = "Petrescu";
        int varsta = 35;
        double inaltime = 1.89;
        int copii = 3;
        System.out.println(prenume + " " + nume + " " + "are" + " "
                + varsta + " " + "ani, " +
                inaltime + " " + "metri inaltime si" + " " +
                copii + " " + "copii.");


    }

    public static double sumOfNumbers(byte a, int b, double c) {
        double d = a + b + c;
        System.out.println(d);
        return d;
    }
}