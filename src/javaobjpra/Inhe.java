package javaobjpra;

public class Inhe {

	int a = 100;

	void display() {
		System.out.println(a);
	}
}

class B extends Inhe {
	int b = 30;

	void show() {
		System.out.println(b);
	}

}

class C extends B {
	int c = 300;

	void print() {
		System.out.println(c);
		System.out.println(a);
	}
}