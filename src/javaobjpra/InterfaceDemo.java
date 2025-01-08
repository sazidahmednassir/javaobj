package javaobjpra;

interface shape {

	int leng = 10;
	int width = 20;

	void circle(); // abstract method

	default void square() {

		System.out.println("this is sqaure");
	}

	static void rectangle() {

		System.out.println("this is rectangle from static method");
	}
}

public class InterfaceDemo implements shape {

	public void circle() {
		System.out.println("this circle is implemented");
	}

	void traingle() {
		System.out.println("this is traingle");
	}

	public static void main(String[] args) {

		InterfaceDemo iobjDemo = new InterfaceDemo();
		iobjDemo.circle();
		iobjDemo.square();
		iobjDemo.traingle();

		shape.rectangle();

		shape sh = new InterfaceDemo();
		sh.circle();
		sh.square();

	}

}
