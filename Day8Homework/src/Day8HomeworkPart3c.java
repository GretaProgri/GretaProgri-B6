
public class Day8HomeworkPart3c {

	public static void main(String[] args) {

		int i = 20;
		int total = 0;
		int count = 0;
		float average = 0;

		do {
			total = total + i;
			i++;
			count++;

		} while (i <= 30);

		average = total / count;
		System.out.println(average);

	}
}
