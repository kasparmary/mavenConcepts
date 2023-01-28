package Com.java.programes;

public class StaticNonStaicExample {
	int i=1;
	int j=2;

	static int p=3;
	static int k=4;

	public void test1() {
		System.out.println("test 1 non static");
	}

	public static void test2() {
		System.out.println("test 2 static");
	}

	public void test3() {
		System.out.println("test 3 non static");
	}

	public static void test4() {
		System.out.println("test 4 static");
	}

	public static void main(String[] args) {
		StaticNonStaicExample obj = new StaticNonStaicExample();

		obj.test1();
		obj.test3();

		System.out.println(obj.i);
		System.out.println(obj.j);

		test2();
		test4();

		System.out.println(k);
		System.out.println(p);
	}
}
