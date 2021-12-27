
public class Homework8Part5a {

	public static void main(String[] args) {

		int i = 0;
		for (i = 1; i <= 32; i++) {
			if (i % 2 == 0) {
				if (i >= 2 && i <= 5) {
					System.out.println("Even number 2-5 =" + i);
				}
				if (i >= 6 && i <= 20) {
					System.out.println("Even number 6-20 =" + i);
				}

			} else {
				if (i >= 15 && i <= 20) {
					System.out.println("Odd number 15-20 =" + i);
				}

			}

		}
	}
}

