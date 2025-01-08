package javaobjpra;

public class Classint extends C2 implements I1, I2 {

	public void m1() {
		System.out.println(I1.x);
	}

	public void m2() {
		System.out.println(I2.y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Classint c1 = new Classint();
		c1.m1();
		c1.m2();
		c1.m4();
	}

}
