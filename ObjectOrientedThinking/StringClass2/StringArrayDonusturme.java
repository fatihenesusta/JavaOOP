package StringClass2;

public class StringArrayDonusturme {
	public static void main(String[] args) {
		String[] tokens = "Java,C?C#,C++".split("[.,:;?]");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		char[] charArray = tokens[1].toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		
		
		char[] chars = {'J', 'A', 'V', 'A', '1' , '3' ,'0' , '1', '2'};
		"CSSelam".getChars(2, 7, chars, 4);
		System.out.println(chars);
		
	}
}
