package javaobjpra;

public class main {

	// implement another class in the main method
	public static void main(String[] args) {

//		System.out.println("Main Function");
		Employee emp1 = new Employee();
		emp1.eid = 101;
		emp1.ename = "Sazid";
		emp1.sal = 50000;
		emp1.display();

		Employee emp2 = new Employee();
		emp1.eid = 201;
		emp1.ename = "Rizwan";
		emp1.sal = 80000;
		emp1.display();

		Student std1 = new Student();
		std1.sid = 200;
		std1.sname = "Fahim";
		std1.grad = 'A';
		std1.printData();

		Student std2 = new Student();
		std2.sid = 200;
		std2.sname = "Robin";
		std2.grad = 'A';
		std2.printData();

		Greetings gr1 = new Greetings();
		gr1.m1();
		System.out.println(gr1.m2());
		gr1.m3("nassir");
		System.out.println(gr1.m4("nassir"));
		Construpra cr = new Construpra(230, "Sazid", 'A');
		cr.Display();

		Polypra polypra = new Polypra();
		polypra.sum();
		polypra.sum(29, 49, 20);
		polypra.sum(23.07, 34);
		polypra.sum(34, 23.07);
		System.out.println(polypra.sum(23, "fahim"));

		Box bx = new Box();
		System.out.println(bx.volume());

		Account acc = new Account();
		acc.setAccno(230);
		System.out.println(acc.getAccno());

		System.out.println(Static.a);
		Static.m1();

		Static sta1 = new Static();
		System.out.println(sta1.b);
		sta1.m2();

		B bob = new B();
		bob.display();

		C cob = new C();
		cob.print();
		cob.display();
		cob.show();

		Child1 c1 = new Child1();
		c1.all(66);

		ABB ab = new ABB();
		System.out.println(ab.roi());

		City ct = new City();
		System.out.println(ct.roi());

		XYZ xyz = new XYZ();
		xyz.a2(50);
		xyz.a1(23, 34);
		xyz.a1(2300);

//		FinalDemo fnalDemo = new FinalDemo();
//		fnalDemo.z=30;

		Dog dg = new Dog();
		dg.displayColor();
		dg.eat();

	}

}
