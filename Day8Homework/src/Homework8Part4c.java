
public class Homework8Part4c {

	public static void main(String[] args) {

		int i = 0;
		int even = 0;
		int odd = 0;
		while (i <= 20) {
			if (i % 2 == 0) {
				even = even + i;
				i++;

			} else {
				odd = odd + i;
				i++;
			}
		}

		System.out.println("Even total=" + even);
		System.out.println("Odd total=" + odd);
	}
}
