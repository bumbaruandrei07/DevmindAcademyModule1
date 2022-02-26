package Course07.Ex1;

public class Phone {

    String marca;
    float pret;
    int anAparitie;
    String numeTelefon;
    float capacitateBaterie;

    public Phone(String marca, float pret, int anAparitie, String numeTelefon, float capacitateBaterie) {
        this.marca = marca;
        this.pret = pret;
        this.anAparitie = anAparitie;
        this.numeTelefon = numeTelefon;
        this.capacitateBaterie = capacitateBaterie;
    }

    public void suna() {
        System.out.println("Suna pe oricine din orice retea");
    }

    public void esteLaModa() {

        int vechime = 2021 - anAparitie;
        if (vechime > 2) {
            System.out.println("Telefon demodat");
        } else System.out.println("Inca este la moda");
    }

    public void rezistenta() {
        System.out.println("Foarte rezistent");
    }


    public void displayPhone() {
        System.out.println("Marca telefon: " + marca + "\n" + "Pret: " + pret + "RON" + "\n" + "Nume telefon: " + numeTelefon
                + "\n" + "Capacitate baterie: " + capacitateBaterie);
    }
}


