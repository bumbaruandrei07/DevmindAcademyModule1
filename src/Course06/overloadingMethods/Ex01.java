package Course06.overloadingMethods;


public class Ex01 {
    public static double factorialR(double value) {
        if (value == 0 || value == 1) {
            return 1;
        }
        return value * factorialR(value - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorialR(5));
        System.out.println(factorialR(4));
        System.out.println(factorialR(120));

//        Se observa ca numerele returnate de metoda factorial sunt numere intregi, mari. Ce tip de date va returna metoda?
//        Raspuns: double



    }
}