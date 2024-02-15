package loopdemos;

public class DoWhileLoopDemo {
	public static void main(String[] args) {
		System.out.println("=========== do-while loop");
		int counter = 0;
		do {
			System.out.println("counter: " + counter++);
		} while (counter < 10);
		
		do {
			System.out.println("counter is at ten already: " + counter);
		} while (counter < 10);
		
		
	}
}