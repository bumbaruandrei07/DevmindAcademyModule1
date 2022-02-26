package Course12;

public class Converter {

    public static int parseInt(String intString) {
        int intVar = Integer.parseInt(intString);
        return intVar;
    }

    public static double parseDouble(String doubleString) {
        double doubleVar = Double.parseDouble(doubleString);
        return doubleVar;
    }

    public static boolean parseBoolean(String booleanString) {
        boolean booleanVar = Boolean.parseBoolean(booleanString);
        return booleanVar;
    }

    public static void main(String[] args) {
        int intValue = parseInt("213142124");
        double doubleValue = parseDouble("2312.1230");
        boolean booleanValue = parseBoolean("false");
        System.out.println(intValue);
        System.out.println(doubleValue);
        System.out.println(booleanValue);
    }
}
