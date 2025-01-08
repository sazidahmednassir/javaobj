package javaobjpra;

class MoreOverridingDemo {

	void a2(int m) {
		System.out.println(m);
	}

	void a1(int n) {
		System.out.println(n);
	}
}

class XYZ extends MoreOverridingDemo {
	void a2(int m) {
		System.out.println(m * m);
	}

	void a1(int n, int m) {
		System.out.println(n + m);
	}

}
