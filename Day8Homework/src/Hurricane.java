
public class Hurricane {

	
	
	public static void main(String[] args) {
		
		int i= 1;
		
			while (i<=200) {
				
				if (i>= 74 && i<=95) {
					System.out.println("Hurricane Category 1");
					System.out.println("Wind Speed " + i);
				}
				
				
				else if (i>=105 && i <=110) {
					
					System.out.println("Hurrican Category 2");
					System.out.println("Wind Speed "+ i);
				}
				
				else if (i>=120 && i <=130) {
					
					System.out.println("Hurrican Category 3");
					System.out.println("Wind Speed "+ i);
				}
				
				else if (i>=140 && i <=155) {
					
					System.out.println("Hurrican Category 4");
					System.out.println("Wind Speed "+ i);
				
				}else if (i>=165 && i <=194) {
						
						System.out.println("Hurrican Category 5");
						System.out.println("Wind Speed "+ i);	
				}
				
				
				i++;
				
			
			}
		
	} 
	
}
