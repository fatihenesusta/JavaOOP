package String;

public class charArrayToString {
	public static void main(String[] args) {
		char[] array = {'M','E','R','H','A','B','A'};
		
		String yazi = new String(array);
		
		
		yazi.replace('E', 'A');
		
		String[] yazi2 = yazi.split("E");
		
		for (int i = 0; i < yazi2.length; i++) {
			System.out.print(yazi2[i]);

		}
	} 
}
