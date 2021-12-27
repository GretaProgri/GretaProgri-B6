
public class Homework8Part4d {

	public static void main(String[] args) {

		int i = 0;
		int even = 0;
		int odd = 0;

		do {

			if (i % 2 == 0) {
				even = even + i;

			} else {
				odd = odd + i;

			}
			i++;

		} while (i <= 20);

		System.out.println("Even total=" + even);
		System.out.println("Odd Total=" + odd);

	}

}
