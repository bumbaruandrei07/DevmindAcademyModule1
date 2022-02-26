package Course9.Quiz;

//TODO Clasa Aircraft contine un camp final si unul static. Considerand particularitatile fiecaruia, care dintre constructorii sai nu sunt valizi (i.e. produc o eroare de compilare)?


public class Aircraft {
    private int capacity;
    private static String fuelType;
    private final int uniqueID;

    // Constructor: 0
    public Aircraft() {
        uniqueID = 0;
    }

    // Constructor: 1
    public Aircraft(int capacity) {
        this();
        this.capacity = capacity;
        this.fuelType = "ERROR";
    }

    // Constructor: 2 -> this one is wrong, because uniqueID must be initialized here
    public Aircraft(int capacity, int uniqueID) {
        this.capacity = capacity;
        this.uniqueID = uniqueID; //solution
    }

    // Constructor: 3
    public Aircraft(int capacity, int uniqueID, String fuelType) {
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.uniqueID = uniqueID;
    }
}