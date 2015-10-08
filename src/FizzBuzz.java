
public class FizzBuzz {
public static void main(String[] args) {
	for (int i = 1; i < 21; i++) {
		if(i == 15){
			System.out.println("Fizz Buzz");
		}else if (i%3 == 0) {
			System.out.println("Fizz");
		}else if (i%5 == 0) {
			System.out.println("Buzz");
		}else if(i == 15){
			System.out.println("Fizz Buzz");
		}else{
			System.out.println(i);
		}
	
	}
}
}
