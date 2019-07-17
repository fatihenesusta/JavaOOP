package StringClass2;

public class Split2 {
	public static void main(String[] args) {
		/*
		String[] bolunecekMetin = "metin aralarinda bosluk olan bir metin metin bak bosluk var9".split(" ");
		for (int i = 0; i < bolunecekMetin.length; i++) {
			System.out.println(bolunecekMetin[i] + " ");
			
		}
		*/
		
		String[] merhaba = "Merhaba ben fatih".split("a");
		for (int i = 0; i < merhaba.length; i++) {
			System.out.print(merhaba[i] + " ");
		}
		
		
		/*
		for (int i = 0; i < bolunecekMetin.length; i++) {
			System.out.println(bolunecekMetin[i].replace("e", "+"));
		}
		*/
		
	}
}
