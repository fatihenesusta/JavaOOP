package String;

public class StringLiteral {
	public static void main(String[] args) {
		String newString = new String("stringLiteral");
		String message = "Welcome";
		
		// Char array den string array e
		char[] charArray = {'G', 'o' , 'o' , 'd' , ' ', 'D' , 'a' , 'y'};
		String messageS = new String(charArray);
		
		char[] yeni = new char[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			yeni[i] = messageS.charAt(i);
		}
		
			
		for (int i = 0; i < yeni.length; i++) {
			System.out.print(yeni[i]);
		}
			
		
		
		
		
	}
}
