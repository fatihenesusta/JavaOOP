package BigIntegerBigDecimal;

import java.math.*;

public class BigIntegerA {
	public static void main(String[] args) {
		 BigInteger a = new BigInteger("3656");
		 BigInteger b = new BigInteger("65765655");
		 BigInteger c = a.multiply(b);
				 
		 
		 System.out.println(c);
		 
		 BigDecimal d = new BigDecimal(1.0);
		 BigDecimal e = new BigDecimal(3);
		 BigDecimal f = d.divide(e, 5, BigDecimal.ROUND_UP);
		 
		 System.out.println(f);
		 
	}
}
