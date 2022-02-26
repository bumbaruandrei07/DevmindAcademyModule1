package Course6.recursiveMethods;

public class Ex2_2 {
    public static void main(String[] args) {

        System.out.println(multiplyWithSumIRecurse(10, 2));


    }

    public static int multiplyWithSumIRecurse(int a, int b) {
//         if a is less than b swap the numbers
        if (a < b)
            return multiplyWithSumIRecurse(b, a);
//        iteratively calculate
//         b times sum of a
        else if (b != 0) {
            return (a + multiplyWithSumIRecurse(a, b - 1));

            // if any of the two numbers is
            // zero return zero
        } else return 0;
    }


}

