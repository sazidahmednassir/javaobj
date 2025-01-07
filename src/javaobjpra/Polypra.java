package javaobjpra;

public class Polypra {

	int a = 10, b = 20;

	void sum() {
		System.out.println(a + b);
	}

	void sum(int x, int y) {
		System.out.println(x + y);
	}

	void sum(double x, int y) {
		System.out.println(x - y);
	}

	void sum(int y, double x) {
		System.out.println(x * y);
	}

	void sum(int a, int b, int c) {
		System.out.println((a * b) / c);
	}

	String sum(int z, String ae) {
		return (z + " " + ae);
	}

}
