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
	}

}
