package Course05.doWhile;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex1_V3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bun venit! Te invitam sa ghicesti numarul, aflat in intervalul [0, 10]");
        System.out.println("Incearca-ti norocul:");
        int m = usingThreadLocalClass();
        int n;
        do {
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Atentie! Numarul magic se afla in intervalul [0, 10]");
                System.out.println("Incearca-ti norocul:");
                n = sc.nextInt();
            }
            if (n > 10) {
                System.out.println("Atentie! Numarul magic se afla in intervalul [0, 10]");
                System.out.println("Incearca-ti norocul:");
                n = sc.nextInt();
            }
            if (n < m) {
                System.out.println("Esti aproape! Dar numarul magic este mai mare");
                System.out.println("Incearca-ti norocul:");
            }
            if (n > m) {
                System.out.println("Esti aproape! Dar numarul magic este mai mic");
                System.out.println("Incearca-ti norocul:");
            }
            if (n == m) {
                System.out.println("Ai ghicit, bravo!");
                break;
            }

        } while ((0 <= n) && (n <= 10));

        sc.close();

    }

    public static int usingThreadLocalClass() {
        int randomInt = ThreadLocalRandom.current().nextInt(1, 10);
        return randomInt;
    }


}
