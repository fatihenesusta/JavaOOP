package StringClass2;

public class RegularExpression {
	public static void main(String[] args) {
		// match = true yada false döner
		System.out.println("Java".matches("Java"));

		
		// . demek bir tane karakter bekliyorum ne olursa olsun demek, arkasýndan yýldýz koyunca onu çokla diyoruz
		// ve ona göre sormaya devam ediyor = .* örneðin mesela a* dersek a yi çokla deriz.
		
		System.out.println("Java is fun".matches(".*fun"));
		System.out.println("Java is cool".matches("Java.*"));
		System.out.println("Java is powerful".matches("Java.*"));
		System.out.println("aldksaldksal'dklaskd+ll'wqelwqweqd'asdasdas,d23'dasdasdsadas+dasdsadas$".replaceAll("[+$,'\"]", " replaced "));
		//týrnaðý " kabul etmez eðer gerekiyorsa önüne escape karakter \ koy.
	
	}
}
