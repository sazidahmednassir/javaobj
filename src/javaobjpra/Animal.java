package javaobjpra;

public class Animal {

	String color = "white";

	void eat() {
		System.out.println("eating");
	}

}

class Dog extends Animal {

	String color = "Black";

	void displayColor() {
		System.out.println(super.color);
	}

	void eat() {
//		System.out.println("eating meat");
		super.eat();
	}
}