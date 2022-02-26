package Course2.Homework3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//        EX2 - Citirea de la tastatura

        System.out.println("Bine ati venit!");
        System.out.println("Anul fabricatiei autoturismului: ");
        Scanner scanner = new Scanner(System.in);
        int anFabricatie = scanner.nextInt();
        System.out.println("Luna fabricatiei autoturismului: ");
        String lunaFabricatie = scanner.next();
        System.out.println("Ziua fabricatiei autoturismului: ");
        int ziuaFabricatiei = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Numarul actual de inmatriculare: ");
        String nrInmatriculare = scanner.nextLine();
        System.out.println("Numar  kilometrii la bord: ");
        double nrKmBord = scanner.nextDouble();
        System.out.println("Numarul de kilometrii de la achizitie: ");
        double nrKmDeLaAchizite = scanner.nextDouble();
        System.out.println("Numele soferului: ");
        String numeSofer = scanner.next();
        System.out.println("Sunteti posesor al permisului?");
        boolean hasDriverLicense = scanner.hasNextBoolean();
        double nrKmParcursi = nrKmDeLaAchizite - nrKmBord;
        int vechimeAutovehicul = 2021 - anFabricatie;
        System.out.println("Data de fabricatie a autoturismului: " + "\n\t"
                + "anul: " + anFabricatie + "\n\t" + "luna: " + lunaFabricatie + "\n\t" + "ziua: "
                + ziuaFabricatiei + "\n" + "numarul actual de inmatriculare: " + nrInmatriculare + "\n"
                + "numarul de kimometri la bord: " + nrKmBord + "\n" + "numarul de kilometri la achizitie: " +
                nrKmDeLaAchizite + "\n" + "nume sofer actual: " + numeSofer + "\n" + "Existenta permis: "
                + hasDriverLicense + "\n" + "Numarul de kilometrii parcursi sunt: " + nrKmParcursi + " km"
                + "\n" + "Vechimea autovehicului inregistrat este de: " + vechimeAutovehicul + " ani"
                + "\n" + "Autovehiculul a fost inregistrat cu succes! Va multumim!");
        scanner.close();

    }
}
