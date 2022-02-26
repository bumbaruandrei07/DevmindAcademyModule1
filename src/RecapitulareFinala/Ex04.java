package RecapitulareFinala;

public class Ex04 {

    int x = f();
    static int y = g();
    public Ex04(){
        System.out.println("A");
    }
    int f(){
        System.out.print("B");
        return 0;
    }
    static int g(){
        System.out.print("C");
        return 1;
    }
    public static void main(String[] a){
        new Ex04();
    }
}
