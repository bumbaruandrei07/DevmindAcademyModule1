package SimulareExamenModul1;

//Defineste o metoda care primeste drept parametru un numar si returneaza:
//
//0 daca numarul respectiv este numar perfect:
//Un numar perfect are suma tuturor divizorilor proprii plus divizorul 1 egala cu numarul insusi
//Exemple:
//6 == 1 + 2 + 3
//28 == 1 + 2 + 4 + 7 + 14
//-1 daca numarul respectiv este numar deficient:
//Un numar deficient are suma tuturor divizorilor proprii plus divizorul 1 mai mica decat numarul insusi.
//Exemple:
//4 > 1 + 2
//21 > 1 + 3 + 7
//+1 daca numarul respectiv este numar abundent:
//Un numar abundent are suma tuturor divizorilor proprii plus divizorul 1 mai mare decat numarul insusi
//Exemple:
//12 < 1 + 2 + 3 + 4 + 6
//18 < 1 + 2 + 3 + 6 + 9
public class Ex2 {

    public static int typeNumber(int number) {
        int sumDiv = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumDiv += i;
            }

        }
        if(sumDiv == number){
            System.out.println(number + " este numar perfect");
            return 0;
        }

        if(sumDiv < number){
            System.out.println(number + " este numar deficient");
            return -1;
        }
        System.out.println(number + " este numar abundent");
        return 1;
    }


    public static void main(String[] args) {

        System.out.println(typeNumber(28));
        System.out.println();
        System.out.println(typeNumber(12));
        System.out.println();
        System.out.println(typeNumber(3));



    }
}
