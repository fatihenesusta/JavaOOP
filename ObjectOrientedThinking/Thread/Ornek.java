package Thread;

public class Ornek {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println("merhaba (main icinden 1 " + i);
		}

		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("merhaba (thread icinden 1 " + i);
				}
			}
		}.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("merhaba (main icinden 2 " + i );

		}
	}
}
