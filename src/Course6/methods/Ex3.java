package Course6.methods;
  /*

        3. Se da o metoda simpla, care realizeaza si apoi returneaza produsul a doua numere:

double multiply2(double operand1, double operand2) {
  return operand1 * operand2;
}
Utilizand metoda definita, implementeaza 2 noi metode:

O metoda care realizeaza inmultirea a 3 numere, primite ca parametri.
double multiply3(double operand1, double operand2, double operand3) {
  // 1. Your code here
}
O alta metoda care realizeaza inmultirea a 4 numere, primite ca parametri.
double multiply4(double operand1, double operand2, double operand3, double operand4) {
  // 2. Your code here
}
Obs: In implementarea celor doua metode, nu ai voie sa utilizezi operatorul de inmultire.

Hint: Trebuie sa gasesti un mod prin care sa folosesti metoda data, multiply2, in loc de inmultire.
La final, testeaza riguros implementarea metodelor (in main(…)).

         */

public class Ex3 {

    public static void main(String[] args) {


        System.out.println(multiply2(1, 2));
        System.out.println(multiply3(2, 3, 4));
        System.out.println(multiply4(6, 7, 1, 2));

    }


    static double multiply2(double operand1, double operand2) {
        return operand1 * operand2;
    }


    static double multiply3(double operand1, double operand2, double operand3) {
        return multiply2(multiply2(operand1, operand2), operand3);

    }

    static double multiply4(double operand1, double operand2, double operand3, double operand4) {
        return multiply2(multiply3(operand1, operand2, operand3), operand4);
    }


}
