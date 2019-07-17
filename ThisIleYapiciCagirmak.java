package NesneYonelimliProgramlama;

public class ThisIleYapiciCagirmak {
	public static void main(String[] args) {
		A a = new A();
		
	}
}

class A {
	int x;
	int y;
	
	A() {
		this(5, 5);
		System.out.println("A()");
	}
	
	A(int x) {
		this(x, 5);
		System.out.println("A(int x)");
	}
	
	A(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("A(int x, int y)");
	}
}
