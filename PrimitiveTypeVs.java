package NesneYonelimliProgramlama;

public class PrimitiveTypeVs {
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		
		i = j;
		
		i++;
		
		Cember cember1 = new Cember(5);
		Cember cember2 = new Cember(10);
	
		
		cember1 = cember2;
		
		cember1.yariCap = 99;
		
		System.out.println(cember2.yariCap);
	}
}
