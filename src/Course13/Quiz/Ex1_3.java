package Course13.Quiz;

public class Ex1_3 {

//    1

    /*
    Starea interna a unui obiect de tip String
     poate fi modificata numai prin metodele aferente clasei (ex: toUpperCase(), replace(CharSequence target, CharSequence replacement)
      === FALSA ===

      Orice obiect String trebuie sa aiba cel putin un caracter (i.e. nu se poate defini un String fara caractere / vid).
      === FALSA ===> Putem avea String s = " ";


     */

    public static void main(String[] args) {
//        Inlocuieste Each cu Every , doar cu Every, nu si cu every  && be cu " "

        String aString = "Each day, each second, I strive to become better.";
        String result = aString.replace("Each", "Every").replace("be", "");
        System.out.println(result);
//        OUTPUT -> Every day, each second, I strive to come tter.

//        Aduna 23 cu 10.0d si vom obtine 33.0 , apoi se va transforma in String, prin concatenare -> "+" si vom obtine 33.0 + 15 == 3315
//        ce va fi dupa "+" va fi doar sub forma de string
        String conditionalEq = 23 + 10.0d + " + " + 15 + " == " + 33 + 15;
        System.out.println(conditionalEq);
    }

}

