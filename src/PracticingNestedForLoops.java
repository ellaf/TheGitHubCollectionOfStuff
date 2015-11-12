
public class PracticingNestedForLoops {
public static void main(String[] args) {

	int x = 1;
	for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
	System.out.print( x++ + " ");
	
}
System.out.println(" ");
	
	}
	
	int y = 1;
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			System.out.print(y++ + " ");
		}
		System.out.println(" ");
		
	}
	
	
	
	for (int i = 0; i < 7; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
	
	
	
	
}
}
