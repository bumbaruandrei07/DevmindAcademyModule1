package Course5.doWhile;

import java.util.Random;
import java.util.Scanner;

public class Ex1_V2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bun venit! Te invitam sa ghicesti numarul, aflat in intervalul [0, 10]");
        System.out.println("Incearca-ti norocul:");
        int m = randomNumberRange(0, 10);
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

    public static int randomNumberRange(int start, int finish) {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(finish + 1 - start) + start;
        return rndInt;
    }


}
