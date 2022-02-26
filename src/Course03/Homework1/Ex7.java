package Course03.Homework1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Introduceti ora: ");
        Scanner scanner = new Scanner(System.in);
        int ora = scanner.nextInt();
        System.out.println("Introduceti minutele: ");
        int minutul = scanner.nextInt();
        System.out.println("Introduceti secundele: ");
        int secunda = scanner.nextInt();
        String oraExacta = ora + ":" + minutul + ":" + secunda;
        int x = ora * 3600 + minutul * 60 + secunda;
        System.out.println("Numarul de secunde de la miezul noptii pana la ora " + oraExacta + " este de " + x + " secunde");
        scanner.close();
    }
}
