package homework;

public class MultipleExercise {
	public static void main(String[] args) {
		int numValue = sumOf(15);
		System.out.println(numValue);
		int numValue1 = sumOf(10);
		System.out.println(numValue1);
		int numValue2 = sumOf(3);
		System.out.println(numValue2);
		int numValue3 = sumOf(5);
		System.out.println(numValue3);
		int numValue4 = sumOf(8);
		System.out.println(numValue4);

	}

	public static int sumOf(int numValue) {
		int sum = 0;

		for (int i = 0; i <= numValue; i++)

			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}

		return sum;
	}
}
