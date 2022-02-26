package SimulareExamenModul1.Ex3;

public class Main {
    public static void main(String[] args) {
        GenericPackage.setCourierName("DevCourier");
        GenericPackage gp = new GenericPackage("25374525762", 0.413, "Diplome");
        gp.addItem(20.0d);
        System.out.println(gp.checkID());
        System.out.println(gp.computeDetails());
    }
}
