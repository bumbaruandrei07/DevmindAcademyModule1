package Course02.Homework2;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//       Ex 3
        int sum = 25;
////
        sum = sum + sum * 2 - 10;
////
        System.out.println(sum);

//        25 + 25 * 2 - 10 = 25 + 50 - 10 = 65 =>Output = 65
//
//         Ex 4
//
        int a = 23, b;
        b = 17;
        System.out.println(a + b);
        System.out.println(a - b);

////        sau declaram cate o variabila care va reprezenta suma respectiv diferenta dintre variabilele a si b
//
        int d = a + b;
        int e = a - b;
        System.out.println(d);
        System.out.println(e);
//
//
////
//
////       Ex 5. Scrie un program simplu care sa realizeze cu exactitate urmatorii pasi:
////
////        creeaza o variabila intreaga (i.e. tipul int)
////        poti sa alegi ce nume doresti
////        initializeaza variabila la creare cu valoare 42
////        afiseaza valoarea curenta a variabilei
////        incrementeaza valoarea variabilei cu 2
////        afiseaza valoarea curenta a variabilei
////        actualizeaza valoarea variabilei cu valoarea 101
////        afiseaza valoarea curenta a variabilei
//
        int randomNumber = 42;
        System.out.println(randomNumber);
        randomNumber = randomNumber + 2;
        System.out.println(randomNumber);
        randomNumber = 101;
        System.out.println(randomNumber);
//
//        6. Folosind variabile (cu nume intuitive) si operatiile matematice de baza (exemplificate anterior), modeleaza urmatoarea problema simpla:
//„Andrei are 23 de mere, 45 de portocale si 7 gutui. Acesta mananca la masa de pranz 5 mere, 2 portocale si 3 gutui. Scrie un program care (1) sa calculeze si (2) sa afiseze urmatoarele statistici, ca in output-ul urmator“:
//
//        Andrei are initial un total de fructe de:
//        75
//        Dupa masa, Andrei are un total de mere + portocale de:
//        61
//
//       Numarul total de fructe ramase dupa masa este:
//        65
//
//        //apelul metodei pentru calculul fructelor
//
        displayNumberOfFruits(23, 45, 7);
        displayNumberOfFruits(23, 45, 7);
//
//        TEMA - TIPURI DE DATE PRIMITIVE
//        EX1
        byte randomByte = 122;
        short randomShort = 600;
        int randomInt = 1000 + 5 * (122 - 600);
        System.out.println(randomByte + "\n" + randomShort + "\n" + randomInt + "\n");
//
//
//EX2 Folosind conceptele studiate, sa se realizeze:
//o variabila de tip long initializata cu o valoare mai mare de 2_000_000_000_000
//o variabila de tip float initializata cu valoarea 0.234_567_890_1
//scrie lizibil literalii folositi la initializare
//afisarea pe ecran a celor doua variabile, pe 2 linii separate.
        System.out.println("==============================");
        long myLong = 3_000_000_012_00L;
        float myFloat = 0.234_567_890_1f;
        System.out.println(myLong + "\n" + myFloat + "\n");


//        3. Corecteaza erorile din urmatoarea secventa de cod astfel incat sa ruleze fara erori. Poti modifica orice in afara de tipul variabilelor. Inainte sa copiezi codul pe calculator, incearca sa identifici singur cat mai multe nereguli si sa le corectezi. Cate ai gasit? Ulterior, scrie codul corectat pe calculator. Cate erori au ramas nedepistate? Si cate ai reusit sa corectezi singur dintre ele?

//        byte verySmallNumber = -123;
//        short verySmallNumber = 123_234;
//
//        int 1_ integerNumber = verySmallNumber * 2;
//        long veryBigNumber = 123_456_000_000_001_;
//
//        integerNumber = integerNumber + 20l;

// SOLUTIE:
//
        System.out.println("==============================");
        short verySmallNumber2 = 123_24; //erori - varaibila fusese deja initializata, literalul nu corespunde plajei de valori pentru tipul short
        int integerNumber = verySmallNumber2 * 2;  //eroare pentru numele variabilei, nu poate sa inceapa cu 1
        long veryBigNumber = 123_456_000_000_001L; //variabila nu era recunoscuta ca un long, ci ca un float, pentru ca nu avea sufixul specific L/l la finalul literalului

        integerNumber = integerNumber + 20; //eroarea se regasea pentru literalul '20', deoarece este cuprins in plaja de valori a lui int.
//
        System.out.println(verySmallNumber2 + "\n" + verySmallNumber2 + "\n" + veryBigNumber + "\n" + integerNumber + "\n");
//
//
//Ex 4

        System.out.println("==============================");
        long totalTimeSpent = 2100000000; //minutes
//
// .... 100.000.000 minutes pass ....
//
        totalTimeSpent = totalTimeSpent + 100000000; // increase the value
//
// Print the total time
// Output should be 2_100_000_000 + 100_000_000 = 2_200_000_000 minutes
        System.out.println(totalTimeSpent);
//        tipul variabilei totalTimeSpent trebuie sa fie de tip long pentru a putea stoca si afisa valoarea finala a timpului

//EX 5
        System.out.println("==============================");
        int intValue = 10 / 3;
        float floatValue = 10f / 3f;
        double doubleValue = 10d / 3d;

        System.out.println("Integer value is: " + intValue);
        System.out.println("Float value is: " + floatValue);
        System.out.println("Double value is: " + doubleValue);

// EX 6 - apelul metodei ConvertorDeDistanta
        ConvertorDeDistanta();

//        EX7 - METHOD 1
//
//        String initialaNume = "B";
//        String initialaPrenume = "A";
//        System.out.println("Initiala numelui este: " + initialaNumelui + "\n" + "Initiala prenumelui este: " + initialaNumelui);
//
//       EX7 - METHOD 2
        displayTheInitialOfMyName("B", "A");

//        EX7 - METHOD 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti initiala numelui: ");
        String initialaNumelui = sc.nextLine().toUpperCase();
        System.out.println("Introduceti initiala prenumelui: ");
        String initialaPrenumelui = sc.next().toUpperCase();
        System.out.println("Initiala numelui este: " + initialaNumelui + "\n" + "Initiala prenumelui este: " + initialaPrenumelui + "\n");

//      EX8. Cauta codul unicode al caracterului Ω (i.e. omega), aflat pe aceeasi linie in tabel cu caracterul Σ in Tabelul Unicode.
//      Creeaza o noua variabila si initializeaz-o cu valoarea unicode a caracterului. Ulterior, afiseaza variabila si verifica rezultatul.

        char omegaUnicodeSymbol = '\u03A9';
        System.out.println("Simbolul omega este: " + omegaUnicodeSymbol + "\n");

        char myExplicitCharacter = 'Ӝ';
        char myUnicodeCharacter = '\u04DC';
        System.out.println("Simbolul caracterului ales este: " + myUnicodeCharacter);


//        EX9 - METHOD 1

        boolean esteZiImpara = false;
        System.out.println(esteZiImpara);

        boolean ziNasterePrimaParteAnCalendaristic = false;
        System.out.println(ziNasterePrimaParteAnCalendaristic);


//        EX9 Method2 -  apelul metodei pentru a determina daca ziua este para sau impara

        tipZi(5);
//        EX9 METHOD 2

        //METHOD 3
        tipulZilei();
        esteZiuaDeNastereInPrimaJumatateDinAn(4);

        esteZiuaDeNastereInPrimaJumatateDinAnulCalendaristic();

    }

    public static void displayNumberOfFruits(int m, int p, int g) {

        int sumofFruits = m + p + g;

        System.out.println("Andrei are initial un total de fructe de: " + sumofFruits);

        m = m - 5;
        p = p - 2;
        int sum2 = m + p;

        System.out.println("Dupa masa, Andrei are un total de mere + portocale de: " + sum2);
        System.out.println();

        g = g - 3;
        int sumofFruits2 = m + p + g;
        System.out.println("Numarul total de fructe ramase dupa masa este: " + sumofFruits2);


    }

//    EX 6 - TIPURI DE DATE PRIMITIVE

    public static void ConvertorDeDistanta() {
        int nrMile = 1000_000;
        double nrKm = nrMile * 1.609D;
        System.out.println("Numarul de mile este: " + nrMile + "\n" + "Numarul de kilometrii aferenti este: " + nrKm + "\n");
    }

//Ex 7 - method 2

    public static void displayTheInitialOfMyName(String initialaNumelui, String initialaPrenumelui) {

        System.out.println("Initiala numelui este: " + initialaNumelui + "\n" + "Initiala prenumelui este: " + initialaNumelui);


    }

//    EX9 - Method2

    public static void tipZi(int date) {
        if (date % 2 == 0) {
            boolean ziPara = true;
            System.out.println(ziPara + " - Ziua este para");
        } else if (date % 2 != 0) {
            boolean ziImpara = true;
            System.out.println(ziImpara + " - Ziua este impara");
        }


    }

    //    Daca luna nasterii este in prima jumatate a anului atunci implicit si ziua nasterii se regaseste tot in prima jumaate a anului calendaristic
    public static void esteZiuaDeNastereInPrimaJumatateDinAnulCalendaristic() {

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Introduceti luna nasterii: ");
        int dataNasterii = sc3.nextInt();
        if (dataNasterii <= 6 && dataNasterii > 0) {
            System.out.println("Luna nasterii se afla in prima jumatate a anului calendaristic");
        } else if (dataNasterii <= 0) {
            System.out.println("Data introdusa nu este valida!");
        } else {
            System.out.println("Luna nasterii NU se afla in prima jumatate a anului calendaristic");
        }
    }


//EX9 - METHOD 3

    public static void tipulZilei() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduceti numarul zilei: ");
        int tipZi = sc2.nextInt();
        if (tipZi % 2 == 0 && tipZi > 0) {
            boolean ziPara = true;
            System.out.println(ziPara + " - Ziua este para");
        } else if (tipZi % 2 != 0 && tipZi > 0) {
            boolean ziImpara = true;
            System.out.println(ziImpara + " - Ziua este impara");
        } else if (tipZi <= 0)
            System.out.println("Ziua introdusa nu este valida!");


    }
    //EX9 - METHOD 3

    public static void esteZiuaDeNastereInPrimaJumatateDinAn(int lunaNastere) {


        if (lunaNastere <= 6 && lunaNastere > 0) {
            System.out.println("Ziua ta de nastere este in prima jumatate a anului calendaristic!");


        } else if (lunaNastere > 6 && lunaNastere <= 12) {
            System.out.println("Ziua ta de nastere NU este in prima jumatate a anului calendaristic!");

        }
    }
}
