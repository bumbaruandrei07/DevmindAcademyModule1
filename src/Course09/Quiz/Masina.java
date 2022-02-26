package Course09.Quiz;

//TODO -> Se da urmatoarea implementare pentru clasa Masina. Conform instructiunilor din main, ce rezultat va afisa programul?


public class Masina {
    private String culoareCaroserie;
    private int varsta;
    private int kmParcursi;

    public Masina(String culoareCaroserie, int varsta) {
        this.culoareCaroserie = culoareCaroserie;
        this.varsta = varsta;
    }

    public String getCuloareCaroserie() {
        return culoareCaroserie;
    }

    public void setCuloareCaroserie(String culoareCaroserieNoua) {
        this.culoareCaroserie = culoareCaroserieNoua;
    }

    public int getKmParcursi() {
        return kmParcursi;
    }

    public void parcurgeDistanta(int kmParcursiNoi) {
        int totalKm = this.kmParcursi + kmParcursiNoi;
        this.kmParcursi = totalKm;
    }

    public static class RoadSimulator {
        public static void main(String[] args) {
            Masina masinaAnei = new Masina("rosie", 2);
            Masina masinaLuiDan = new Masina("albastra", 1);
            Masina masinaLuiDan2 = masinaLuiDan;

            masinaLuiDan = masinaAnei;

            masinaAnei.parcurgeDistanta(10);
            masinaLuiDan.parcurgeDistanta(15);
            masinaAnei.parcurgeDistanta(10);
            masinaLuiDan2.parcurgeDistanta(20);

            System.out.println(masinaAnei.getKmParcursi() + " "
                    + masinaLuiDan.getKmParcursi());
        }
    }
}