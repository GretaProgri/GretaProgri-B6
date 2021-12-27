
public class Homework8Part3b {
	
	public static void main(String[] args) {
		
		int i=20;
		float average=0;
		int total=0;
		int count=0;
		
		while ( i<=30) {
		
			total=total+i;
			i++;
			count++;
		}
		
		average=total/count;
		System.out.println(average);
		
		
	}

}
