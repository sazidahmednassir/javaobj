package javaobjpra;

public class Greetings {

	// no params no return value

	void m1() {
		System.out.println("Hello...");
	}

	// no params return value
	String m2() {
		return ("hello");
	}

	// take params no return value

	void m3(String name) {
		System.out.println("hello " + name);
	}

	// take params return value
	String m4(String name) {
		return ("Hi " + name);
	}

}
