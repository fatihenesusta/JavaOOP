package StringClass2;

public class ArraydanString {
	public static void main(String[] args) {
		String str = new String(new char[] {'J', 'a' , 'v' , 'a'});
		
		String str1 = String.copyValueOf(new char[] {'J', 'a' , 'v' , 'a'});
		
		
		System.out.println(str.replace("a", "b"));
		
	}
}
