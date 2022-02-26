package Course06.recursiveMethods;

public class Ex02 {

    public static class FactorialR {
        public static int factorialR(int value) {
            if (value == 0 || value == 1) {
                return 1;
            }
            return value * factorialR(value - 1);
        }

        public static void main(String[] args) {
            System.out.println(factorialR(5));
        }
    }
}
