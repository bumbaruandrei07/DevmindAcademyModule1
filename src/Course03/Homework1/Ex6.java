package Course03.Homework1;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti ziua de nastere: ");
        int ziNastere = scanner.nextInt();
        System.out.println("Introduceti luna nasterii: ");
        int lunaNastere = scanner.nextInt();
        System.out.println("Introduceti anul nasterii: ");
        int anulNasterii = scanner.nextInt();
        System.out.println("Introduceti ziua curenta: ");
        int ziCurenta = scanner.nextInt();
        System.out.println("Introduceti luna curenta: ");
        int lunaCurenta = scanner.nextInt();
        System.out.println("Introduceti anul curent: ");
        int anCurent = scanner.nextInt();
        int varstaPersoanaInZile;
        int varstaPersoaneiInAniImpliniti;

        if (ziNastere >= ziCurenta && lunaNastere >= lunaCurenta && anCurent >= anulNasterii && ziCurenta <= 30 && ziNastere <= 30 && lunaCurenta <= 12 && lunaNastere <= 12 && anCurent <= 2021) {
            varstaPersoanaInZile = (ziNastere - ziCurenta) + ((lunaNastere * 30) - (lunaCurenta * 30)) + ((anCurent - anulNasterii) * 365);
            System.out.println("Persoana are o varsta de " + varstaPersoanaInZile + " zile");
            varstaPersoaneiInAniImpliniti = (anCurent - anulNasterii) + 1;
            System.out.println("Persoana are un numar de " + varstaPersoaneiInAniImpliniti + " ani impliniti");
        }
        if (ziNastere <= ziCurenta && lunaNastere <= lunaCurenta && anCurent > anulNasterii && ziCurenta <= 30 && lunaCurenta <= 12 && anCurent <= 2021) {
            varstaPersoanaInZile = (ziCurenta - ziNastere) + ((lunaCurenta * 30) - (lunaNastere * 30)) + ((anCurent - anulNasterii) * 365);
            System.out.println("Persoana are o varsta de " + varstaPersoanaInZile + " zile");
            varstaPersoaneiInAniImpliniti = anCurent - anulNasterii;
            System.out.println("Persoana are un numar de " + varstaPersoaneiInAniImpliniti + " ani impliniti");

        }
        if (ziNastere <= ziCurenta && lunaNastere >= lunaCurenta && anCurent > anulNasterii && ziCurenta <= 30 && lunaCurenta <= 12 && lunaNastere <= 12 && anCurent <= 2021) {
            varstaPersoanaInZile = (ziCurenta - ziNastere) + ((lunaNastere * 30) - (lunaCurenta * 30)) + ((anCurent - anulNasterii) * 365);
            System.out.println("Persoana are o varsta de " + varstaPersoanaInZile + " de zile");
            varstaPersoaneiInAniImpliniti = anCurent - anulNasterii;
            System.out.println("Persoana are un numar de " + varstaPersoaneiInAniImpliniti + " ani impliniti");

        }

//        if ((ziCurenta < ziNastere) && (anCurent > anulNasterii) && (anulNasterii) <= 2021 &&(ziNastere<30)&&(anCurent<2021)&&(lunaNastere<12)&&(lunaCurenta<12))  {
//            varstaPersoaneiInAniImpliniti = anCurent - anulNasterii;
//            System.out.println("Persoana are un numar de " + varstaPersoaneiInAniImpliniti + " ani impliniti");
//        }
//        if ((ziCurenta >= ziNastere) && (anCurent > anulNasterii) && (lunaCurenta == lunaNastere)&&(ziCurenta<30)&&(lunaCurenta<12)&&(anCurent<2021)) {
//            varstaPersoaneiInAniImpliniti = (anCurent - anulNasterii) + 1;
//            System.out.println("Persoana are un numar de " + varstaPersoaneiInAniImpliniti + " ani impliniti");
//        }
        if ((ziCurenta > 30) || (ziNastere > 30) || (anulNasterii > 2021) || (anCurent > 2021) || (lunaCurenta > 12) || (lunaNastere > 12)) {
            System.out.println("Introduceti o data valida!");
        }
        scanner.close();


//  int varstaPersoanaInZileV1 = ((ziNastere >= ziCurenta) &&
        //  (lunaNastere >= lunaCurenta) &&
        //  (anCurent >= anulNasterii) &&
        //  ((ziCurenta <= 30) &&
        //  (ziNastere <= 30) &&
        //  (lunaCurenta <= 12) &&
        //  (lunaNastere <= 12) &&
        //  (anCurent <= 2021)))
//                ?
//                (ziNastere - ziCurenta) + ((lunaNastere * 30) - (lunaCurenta * 30)) + ((anCurent - anulNasterii) * 365) : null;
//        System.out.println("Persoana are o varsta de " + varstaPersoanaInZileV1 + " zile");
//        int varstaPersoanaInZileV1 = ((ziNastere <= ziCurenta) && (lunaNastere <= lunaCurenta) && (anCurent >= anulNasterii)) && (anCurent > anulNasterii) && ((ziCurenta <= 30) && (ziNastere <= 30) && (lunaCurenta <= 12) && (lunaNastere <= 12) && (anCurent <= 2021))
//                ?
//                (ziCurenta - ziNastere) + ((lunaCurenta * 30) - (lunaNastere * 30)) + ((anCurent - anulNasterii) * 365) : null;
//        System.out.println("Persoana are o varsta de " + varstaPersoanaInZileV1 + " zile");
//
//
//        int varstaPersoaneiInAniImplinitiV2 = ((ziCurenta == ziNastere) && (lunaCurenta == lunaNastere) && (anCurent > anulNasterii) && (anulNasterii) <= 2021) ||((ziCurenta<ziNastere)&&(anCurent>anulNasterii))
//                ? anCurent - anulNasterii;
//
//        System.out.println("Persoana are un numar de " + varstaPersoaneiInAniImplinitiV1 + " ani impliniti");





    }
}
