
public class Day8HomeworkPart4b {

	public static void main(String[] args) {

		int even = 0;
		int odd = 0;

		for (int i = 1; i <= 20; i++) {
			// System.out.println("i =" + i);
			if (i % 2 == 0) {
				// System.out.println("Even i=" + i);

				even = even + i;

				//
			} else {
				odd = odd + i;
				// System.out.println("Odd i=" + i);
				//
			}

		}
		System.out.println("Even total=" + even);

		System.out.println("Odd total =" + odd);
	}

}
