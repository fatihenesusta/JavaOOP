package InheritanceAndPolymorphism;

public class Equals {
	public static void main(String[] args) {
		Object c1 = new Cember(10);
		Object c2 = new Cember(10);
		/*
		if (c1 == c2) {
			System.out.println("C1 = C2");
		} else {
			System.out.println("C1 != C2");
		}
		*/
		
		if (c1.equals(c2)) {
			System.out.println("C1 = C2");
		} else {
			System.out.println("C1 != C2");
		}
		
		
	}
}
