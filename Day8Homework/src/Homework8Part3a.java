

public class Homework8Part3a {

	public static void main(String args[]) {

		int total = 0;
		float average = 0;
		int num = 0;

		for (int i = 20; i <= 30; i++) {
			total = total + i;
			num++;
		}
		average = total / num;
		System.out.println(average);
	}

}
