package Course07.Ex2;

public class TestareProfilUtilizator {
    public static void main(String[] args) {

        ProfilUtilizator profilUtilizator1 = new ProfilUtilizator();
        profilUtilizator1.initializeazaProfil();
        profilUtilizator1.actualizareEmail("bumbaru.andrei@gmail.com");
        profilUtilizator1.actualizareNumarTelefon("0723454567");
        profilUtilizator1.afisareVarsta(2021);
        profilUtilizator1.afisareStareInterna();
        System.out.println();
        System.out.println("===========================");

        ProfilUtilizator profilUtilizator2 = new ProfilUtilizator();
        profilUtilizator2.initializeazaProfil();
        profilUtilizator2.actualizareEmail("ion.alex@yahoo.com");
        profilUtilizator2.actualizareNumarTelefon("0721878754");
        profilUtilizator2.afisareVarsta(2021);
        profilUtilizator2.afisareStareInterna();

    }
}
