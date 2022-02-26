package Course09.Quiz;


//TODO -> Ce valoare se va afisa pentru campul intValue, in metoda main, dandu-se clasa NumberPack?

public class NumberPack {

    private byte byteValue;
    private int intValue;
    private double doubleValue;

    public NumberPack(byte byteValue, double doubleValue) {
        this.byteValue = byteValue;
        this.doubleValue = doubleValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public static void main(String[] args) {
        byte byteArg = 23;
        double doubleArg = 1000.1;
        NumberPack np = new NumberPack(byteArg, doubleArg);
        System.out.println(np.getIntValue());
    }

}

