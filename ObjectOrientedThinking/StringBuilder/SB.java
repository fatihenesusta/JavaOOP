package StringBuilder;

public class SB {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Merhaba");
		sb.append('a');
		sb.reverse();

		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer(1_000_000);
		sb1.append("merhaba ");
		for (int i = 0; i < 1_000_000; i++) {
			sb.append('a');
		}
		
		
		StringBuffer sb3 = new StringBuffer(1000);
		sb3.append("merhaba").append("napýyorsun").append('b').append(new char[] {'5', 't'});
	}

}
