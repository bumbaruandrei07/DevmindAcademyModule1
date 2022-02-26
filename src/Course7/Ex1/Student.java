package Course7.Ex1;


public class Student {

    String numeStudent = "";
    int varsta;
    double medieAnStudiu;
    int nrGrupa;
    String specializare;
    boolean bursa;


    public Student(String numeStudent, int varsta, double medieAnStudiu, int nrGrupa, String specializare) {
        this.numeStudent = numeStudent;
        this.varsta = varsta;
        this.medieAnStudiu = medieAnStudiu;
        this.nrGrupa = nrGrupa;
        this.specializare = specializare;

    }

    public void invata() {
        System.out.println("Comportamentul studentului : Invata doar in sesiune");
    }

    public void Bursa() {
        if (medieAnStudiu > 9) {
            bursa = true;
            System.out.println("Studentul are bursa");
        } else if (medieAnStudiu < 9) {
            bursa = false;
            System.out.println("Studentul nu are bursa");
        }


    }

    public void toceste() {
        medieAnStudiu--;
        System.out.println("Medie noua: " + medieAnStudiu);
    }

    public void displayStudent() {
        System.out.println("Nume student: " + numeStudent + "\n" + "Varsta student: " +
                varsta + "\n" + "Medie admitere: " + medieAnStudiu + "\n" + "Numar grupa: " + nrGrupa
                + "\n" + "Specializare student: " + specializare);
    }
}



