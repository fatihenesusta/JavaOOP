package StringClass2;

public class RegularExpression {
	public static void main(String[] args) {
		// match = true yada false d�ner
		System.out.println("Java".matches("Java"));

		
		// . demek bir tane karakter bekliyorum ne olursa olsun demek, arkas�ndan y�ld�z koyunca onu �okla diyoruz
		// ve ona g�re sormaya devam ediyor = .* �rne�in mesela a* dersek a yi �okla deriz.
		
		System.out.println("Java is fun".matches(".*fun"));
		System.out.println("Java is cool".matches("Java.*"));
		System.out.println("Java is powerful".matches("Java.*"));
		System.out.println("aldksaldksal'dklaskd+ll'wqelwqweqd'asdasdas,d23'dasdasdsadas+dasdsadas$".replaceAll("[+$,'\"]", " replaced "));
		//t�rna�� " kabul etmez e�er gerekiyorsa �n�ne escape karakter \ koy.
	
	}
}
