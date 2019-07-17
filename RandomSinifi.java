package NesneYonelimliProgramlama;

import java.util.Random;

public class RandomSinifi {
	public static void main(String[] args) {
		Random r1 = new Random(5698);
		for (int i = 0; i < 10; i++) {
			System.out.print(r1.nextInt(100) + " ");
		}
		System.out.println();
		
		Random r2 = new Random(5698);
		for (int i = 0; i < 10; i++) {
			System.out.print(r2.nextInt(100) + " ");
		}
		
		
	}
}
