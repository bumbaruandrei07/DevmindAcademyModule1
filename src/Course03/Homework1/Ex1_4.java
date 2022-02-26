package Course03.Homework1;

public class Ex1_4 {

    public static void main(String[] args) {

//        Operatori in Java - continuare

//Ex1
        int operand1 = 24, operand2 = 35, operand3 = 15, operand4 = 55;
        int result;


        result = operand1 + operand2;
        result /= operand4;
        result += operand3;
        result *= operand1 * 2;
        result = operand3 - result; // echivalent cu result = -result+operand3;
        result += (-3) * 3 * operand4; //echivalent cu result += (-9) * operand4
        System.out.println(result);

//        Ex2
// Varianta 1
//        Pre-incrementare vs Post-incrementare

        int i = 1;
        int j = i++;

        int p = 1;
        int k = ++p;

        System.out.println("Valorea variabilei i dupa post-incrementare este: " + i);
        System.out.println("Valorea variabilei j  dupa post-incrementare este: " + j);
        System.out.println("Valorea variabilei p dupa pre-incrementare este: " + p);
        System.out.println("Valorea variabilei k dupa pre-incrementare este: " + k);

//Pre-decrementare vs Post-decrementare
        int q = 5;
        int w = q--;

        int r = 8;
        int f = --r;
        System.out.println("Valorea variabilei q dupa post-decrementare este: " + q);
        System.out.println("Valorea variabilei w dupa post-decrementare este: " + w);
        System.out.println("Valorea variabilei r dupa pre-decrementare este: " + r);
        System.out.println("Valorea variabilei f dupa pre-decrementare este: " + f);



// TODO EX3 - ordinea in care se executa pre-incrementarea si post-incrementarea

        int temperature = 23; // celsius
//        temperature = temperature++ - ++temperature +
//                +(-(--temperature)) - (--temperature + temperature++);

        temperature++; //creste si returneaza vechea valoare, ramane in continuare 23
        ++temperature; // variabila a crescut cu 1 si acum va creste mai intai cu 1 si se va afisa valoarea noua 25
        --temperature; //valoarea variabilei scade cu 1 si va fi acum 24
        --temperature; //idem, scade cu 1 si va fi 23
        temperature++; //valoarea creste cu 1 si se va returna 24
        System.out.println(temperature + " de grade celsius");

//   TODO     EX4 - negarea variabilei folosind operatori compusi

//        a)
        int pleaseNegateMe1 = 100;
        pleaseNegateMe1 = -pleaseNegateMe1;
        System.out.println("Valoarea initiala a variabilei pleaseNegateMe1 este: " + pleaseNegateMe1 + ", iar valoarea negatiei este: " + pleaseNegateMe1);

//        b)

        int pleaseNegateMe2 = 100;
        pleaseNegateMe2 *= -1;
        System.out.println("Valoarea initiala a variabilei pleaseNegateMe2 este: " + pleaseNegateMe2 + ", iar valoarea negatiei este: " + pleaseNegateMe2);

//        c)

        int pleaseNegateMe3 = 100;
        pleaseNegateMe3 /= -1;
        System.out.println("Valoarea initiala a variabilei pleaseNegateMe3 este: " + pleaseNegateMe3 + ", iar valoarea negatiei este: " + pleaseNegateMe3);


    }
}
