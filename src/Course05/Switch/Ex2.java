package Course05.Switch;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        /*
        2. Folosind structura invatata in acest capitol, scrie un program care citeste de la tastatura numele unei luni si afiseaza numarul de zile al acelei luni.
        Numele lunilor incep cu majuscula si se continua cu litere mici. Exemplu:

        # INPUT -> OUTPUT
Octombrie -> Luna Octombrie are 31 de zile.
Iunie -> Luna Iunie are 30 de zile.

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numele lunii: ");
        String luna = sc.next();

        switch (luna) {
            case "Ianuarie":
            case "Aprilie":
            case "Mai":
            case "Octombrie":
            case "Iulie":
            case "August":
            case "Decembrie":
                System.out.println(luna + " -> " + "Luna " + luna + " are 31 de zile.");
                break;

            case "Martie":
            case "Iunie":
            case "Septembrie":
            case "Noiembrie":
                System.out.println(luna + " -> " + "Luna " + luna + " are 30 de zile.");
                break;

            case "Februarie":
                System.out.println(luna + " -> " + "Luna " + luna + " are 29 sau 28 de zile.");
                break;

            default:
                System.out.println(luna + " -> " + "Luna " + luna + " nu este o luna valida!");
                break;
        }
        sc.close();
    }
}


