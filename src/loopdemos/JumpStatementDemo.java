package loopdemos;

public class JumpStatementDemo {
	public static void main(String[] args) {
		//DISPLAY ODD NUMBERS
		System.out.println("=========== continue");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("counter: " + i);
		}
		
		System.out.println("=========== break");
		for (int i = 0; i < 5; i++) {
			//BREAK LOOP WHEN i == 3
			if (i == 3) {
				break;
			}
			System.out.println("counter: " + i);
		}
		
		System.out.println("=========== break nested loop");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					//only breaks the loop when j == 3 but still iterates till i < 5
					break;
				}
				System.out.print(j + " ");
			}
			
			System.out.println("counter: " + i);
		}
	}
	
}

