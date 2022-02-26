package Course07.Ex1;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Andrei B.", 22, 8.66, 1084, "InfoEc");
        s1.displayStudent();
        s1.invata();
        s1.Bursa();
        s1.toceste();
        System.out.println("====================================================");

        Student s2 = new Student("Mihai P.", 23, 9.26, 1084, "Cibernetica");
        s2.displayStudent();
        s2.invata();
        s2.Bursa();
        s2.toceste();
        System.out.println("====================================================");





        Phone ph1 = new Phone("Samsung", 5100, 2021, "S21 ULTRA", 5000);
        ph1.displayPhone();
        ph1.esteLaModa();
        ph1.suna();
        ph1.rezistenta();
        System.out.println("====================================================");


        Phone ph2 = new Phone("Huawei", 1100, 2019, "P30 PRO", 3500);
        ph2.displayPhone();
        ph2.esteLaModa();
        ph2.suna();
        ph2.rezistenta();
        System.out.println("====================================================");



        Television television = new Television(12.8, 7.9, 12);
        television.powerSwitch();
        television.channelTuning(2);
        television.increaseVolume();
        television.decreaseVolume();
        System.out.println("Width: " + television.width + "\n" + "Height: " + television.height + "\n" + "Screen size: " + television.screenSize);


    }
}
