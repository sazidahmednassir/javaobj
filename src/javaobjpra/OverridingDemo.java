package javaobjpra;

public class OverridingDemo {

	double roi() {
		return 0;
	}
}

class ABB extends OverridingDemo {
	double roi() {
		return 10.50;
	}

}

class City extends OverridingDemo {
	double roi() {
		return 8.50;
	}
}
