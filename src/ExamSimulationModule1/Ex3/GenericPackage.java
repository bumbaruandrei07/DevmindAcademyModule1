package SimulareExamenModul1.Ex3;


public class GenericPackage {
    // 4.1 Toate campurile:
    private final String uniqueID; // 4.2.b. adaugare 'final'
    private double weight;
    private String packageName;
    private static String courierName; // 4.2.a. adaugare 'static'

    // 4.2.c: 'getter' + 'setter' pentru 'courierName'
    // Obs: ambele metode sunt statice deoarece nu lucreaza cu campurile obiectului,
    // ci doar cu campurile clasei (i.e. statice)

//  !!!  avem numele clasei.nume_camp pt ca fieldul este static, nu putem referi cu this !!!
    public static String getCourierName() {

        return GenericPackage.courierName;
    }

    public static void setCourierName(String courierName) {
        GenericPackage.courierName = courierName;
    }

    //4.2.d: doar 'getter' pentru 'packageName',
    // deoarece proprietatea poate fi *doar citita* (read-only)
    public String getPackageName() {
        return this.packageName;
    }

    // 4.2.e: ambii constructori trebuie sa initializeze orice
    // camp 'final'. Altfel constructorii nu sunt valizi.
    // => ambii constructori vor initializa obligatoriu 'uniqueID'
    public GenericPackage(String uniqueID, double weight, String packageName) {
        this.uniqueID = uniqueID;
        this.weight = weight;
        this.packageName = packageName;
    }

    public GenericPackage(String uniqueID, String packageName) {
        this(uniqueID, -1, packageName);
    }

    // 4.3.a
    public void addItem(double itemWeight) {
        this.weight += itemWeight;
    }

    // 4.3.b
    public boolean checkID() {
        // Avantajele abordarii:
        // 1 - in momentul in care s-a gasit o conditie
        //     'false', niciuna dintre conditiile urmatoare nu mai este testata
        // 2 - putem implementa idConditionX() fara a mai verifica din nou
        //     criteriile validate deja prin conditiile anterioare
        return this.idCondition1() && this.idCondition2() && this.idCondition3()
                && this.idCondition4() && this.idCondition5();
    }

    // 4.3.b - metoda auxiliara
    // (-> va fi 'private')
    private boolean idCondition1() {
        for (int i=0; i<this.uniqueID.length(); i++) {
            if (Character.isDigit(uniqueID.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    // 4.3.b - metoda auxiliara
    // (-> va fi 'private')
    private boolean idCondition2() {
        int counter = 0;
        for (int i=0; i<this.uniqueID.length(); i++) {
            int curentDigit = Character.getNumericValue(uniqueID.charAt(i));
            if (curentDigit % 2 == 1) {
                counter++;
            }
        }
        return (counter % 3 == 0);
    }

    // 4.3.b - metoda auxiliara
    // (-> va fi 'private')
    private boolean idCondition3() {
        int sum = 0;
        for (int i=0; i<this.uniqueID.length(); i++) {
            int curentDigit = Character.getNumericValue(uniqueID.charAt(i));
            sum += curentDigit;
        }
        return (sum % 4 == 0);
    }

    // 4.3.b - metoda auxiliara
    // (-> va fi 'private')
    private boolean idCondition4() {
        for (int i=0; i<this.uniqueID.length() - 1; i++) {
            int curentDigit = Character.getNumericValue(uniqueID.charAt(i));
            int nextDigit = Character.getNumericValue(uniqueID.charAt(i + 1));
            int diff = curentDigit - nextDigit;
            if (diff >= 5 || diff <= -5) { // include cazul cand diferenta este negativa
                return false;
            }
        }
        return true;
    }

    // 4.3.b - metoda auxiliara, echivalenta functional cu 'idCondition4()'
    //       - o alta varianta de implementare
    // (-> va fi 'private')
    private boolean idCondition4b() {

        if (this.uniqueID.length() < 2) {
            return true;
        }

        int previousDigit = Character.getNumericValue(uniqueID.charAt(0));
        for (int i=1; i<this.uniqueID.length(); i++) {
            int currentDigit = Character.getNumericValue(uniqueID.charAt(i));
            int diff = currentDigit - previousDigit;
            if (diff >= 5 || diff <= -5) { // include cazul cand diferenta este negativa
                return false;
            }
            previousDigit = currentDigit; // pastram valoarea deja calculata, pentru a
            // evita o reconversie in iteratia urmatoare
        }
        return true;
    }

    // 4.3.b - metoda auxiliara
    // (-> va fi 'private')
    private boolean idCondition5() {
        return uniqueID.length() >= 10 && uniqueID.length() <= 12;
    }

    // 4.3.c
    public String computeDetails() {
        String toString = "Pachetul " + this.packageName + " avand codul "
                + this.uniqueID + " si greutatea " + this.weight
                + " apartine curierului " + this.courierName + ".";
        return toString;
    }
}