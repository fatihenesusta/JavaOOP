package NesneYonelimliProgramlama;

public class Student {
	String name;
	int age;
	boolean isScienceMajor;
	char gender;

	public Student() {
		name = "Fatih";
		age = 15;
	}

	public void returnString() {
		System.out.println("Ogrenci adi: " + name + " \n" + "Ogrenci yasi: " + age);
	}
}
