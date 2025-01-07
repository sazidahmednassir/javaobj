package javaobjpra;

public class Construpra {
	int id;
	String name;
	char gr;

	Construpra(int id, String name, char gr) {
		this.id = id;
		this.name = name;
		this.gr = gr;

	}

	void Display() {
		System.out.println(id + " " + name + " " + gr);
	}

}
