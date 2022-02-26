package Course6.recursiveMethods;

public class ExempluCurs {
    public static void main(String[] args) {
        int n = 10_000;
//      int n = 1000000000;  -> produce eroarea "StackOverflow"
        long start, end;
        long timeIterative, timeRecursive;
        long resultIterative, resultRecursive;

        start = System.nanoTime();
        resultRecursive = sumNRecursive(n);
        end = System.nanoTime();
        timeRecursive = end - start;
        start = System.nanoTime();
        resultIterative = sumNIterative(n);
        end = System.nanoTime();
        timeIterative = end - start;
        if (resultIterative == resultRecursive) {
            System.out.println("Both methods produce same result for n="
                    + n + " result=" + resultIterative);
        } else {
            System.out.println("Methods produce different results: "
                    + resultIterative + " vs. " + resultRecursive);
        }

        System.out.println("Time elapsed for recursive approach: " + timeRecursive);
        System.out.println("Time elapsed for iterative approach: " + timeIterative);
        System.out.println("Conclusion: iterative approach is "
                + (1.0 * timeRecursive / timeIterative) + " times faster!");
    }

    //metoda recursiva
    public static int sumNRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNRecursive(n - 1);
    }

    //metoda iterativa
    public static int sumNIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
