package SimulareExamenModul1.Ex3;

public class Angajat {
    private final String cnp;
    private String nume;
    private String email;
    private String prenume;
    private int salariu;
    private static String angajator;

    public static String getAngajator() {
        return angajator;
    }

    public static void setAngajator(String angajator) {
        Angajat.angajator = angajator;
    }

    //    constructor 1
    public Angajat(String cnp, String nume, String email, String prenume, int salariu) {
        this.cnp = cnp;
        this.nume = nume;
        this.email = email;
        this.prenume = prenume;
        this.salariu = salariu;
    }
//    constructor 2 - ambii constructori trebuie sa contina campul final


    public Angajat(String cnp, String nume, String email, String prenume) {
        this.cnp = cnp;
        this.nume = nume;
        this.email = email;
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void maresteSalariu(int bonus) {
        this.salariu += bonus;
    }

    public boolean valideazaCNP() {
        return this.cnpCondition1() && this.cnpCondition2() && cnpCondition3() && cnpCondition4() && cnpCondition5();
    }

// numarul total de caractere este 13

    private boolean cnpCondition1() {
        return cnp.length() == 13;
    }

//    toate caracterele sunt cifre

    private boolean cnpCondition2() {
        for (int i = 0; i < cnp.length(); i++) {
            if (Character.isDigit(this.cnp.charAt(i))) {
                return true;
            }
        }
        return false;
    }
//    prima cifra este diferita de 0

    private boolean cnpCondition3() {
        for (int i = 0; i < this.cnp.length(); i++) {
            int firstDigit = Character.getNumericValue(cnp.charAt(i));
            if (firstDigit != 0) {
                return true;
            }
        }
        return false;
    }
//    cifrele 4 si 5 formeaza o luna valida (i.e. un numar cuprins intre 01 si 12 inclusiv)
    private boolean cnpCondition4(){
        for (int i = 0; i < this.cnp.length(); i++) {
            int fourthDigit = Character.getNumericValue(cnp.charAt(3));
            int fifthDigit = Character.getNumericValue(cnp.charAt(4));
            if (fifthDigit + fourthDigit <=12 && fifthDigit + fourthDigit >=1) {
                return true;
            }
        }
        return false;
    }
//    cifrele 6 si 7 formeaza o zi valida din luna (i.e. orice numar cuprins intre 01 si 31 inclusiv)
    private boolean cnpCondition5(){
        for (int i = 1; i < this.cnp.length(); i++) {
            int sixthDigit = Character.getNumericValue(cnp.charAt(6));
            int seventhDigit = Character.getNumericValue(cnp.charAt(7));
            if (sixthDigit + seventhDigit <=31 && sixthDigit + seventhDigit >=1) {
                return true;
            }
        }
        return false;
    }
    public String displayAngajat() {
        String toString = "Angajatul " + this.nume + this.prenume + ", CNP" + this.cnp + " are salariul de " +
                this.salariu + " RON/luna si lucreaza la " + angajator;
        return toString;
    }

    public int getSalariu() {
        return salariu;
    }

    public static void calculeazaBonusAnual(){
        int nrCifre5 = 0;
        int nrCifre9 = 0;
    }
}
