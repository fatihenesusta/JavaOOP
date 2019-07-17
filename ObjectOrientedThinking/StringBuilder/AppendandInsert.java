package StringBuilder;

public class AppendandInsert {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Welcome");
		sb.append(' ');
		sb.append("to");
		sb.append(" Java");
		sb.insert(15, " ekleme");
		sb.insert(22, " ek3le3me23");
		System.out.println(sb);
		System.out.println("------");
		sb.delete(22, 33);
		System.out.println(sb);

		// ters cevir
		sb.reverse();
		System.out.println(sb);
		System.out.println("------");
		// bir daha ters cevir
		sb.reverse();
		System.out.println(sb);
		System.out.println("------");
		// x'inci karakteri bu yap.
		sb.setCharAt(2, 'L');
		System.out.println(sb);

		System.out.println("------");
		sb.replace(0, 7, "Hosgeldin");
		System.out.println(sb);
		System.out.println("------");
		sb.delete(0, 7);
		System.out.println(sb);
		
		//array in icinde dolu olan yerleri sayýp rakamý verir
		sb.length();
		// array in boyutunun ne kadar oldugunu verir doluluguna bakmadan.
		sb.capacity();
		
	}
}
