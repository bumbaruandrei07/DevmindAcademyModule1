
package Course1.classes;

public class Numbers {

	private int a;
	private int b;
	private int c;
	private int d;
	private int e;

//	String aux = Integer.toString(a);

	public Numbers() {

	}

	public Numbers(int a, int b, int c, int d, int e) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}

	public String toString() {
		return a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n";
	}

}
