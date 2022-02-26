package Course1.classes;

public class AllCharacters extends Numbers implements DisplayNumbers {

    private String s1;
    private String s2;
    private String s3;

    public AllCharacters(String s1, String s2, String s3) {
        super();
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public String toString() {
        return "All the characters: " + "\n" + s1 + "\n" + s2 + "\n" + s3 + "\n";
    }

    @Override
    public void DisplayNumbers() {
        int a = 1, b = 22, c = 333, d = 4444, e = 5555;
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n");

    }

}
