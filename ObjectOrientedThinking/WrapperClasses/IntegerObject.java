package WrapperClasses;

import java.math.BigInteger;

public class IntegerObject {
	public static void main(String[] args) {
		Integer intObject = new Integer(2);
		
		Integer inboj = 2;
		int inboj3 = 2;
		
		BigInteger ilk = new BigInteger("232323232");
		BigInteger iki = new BigInteger("53232323232");
		BigInteger üc = ilk.add(iki);
		
		System.out.println(üc);
		
	}
}
