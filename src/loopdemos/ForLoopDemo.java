package loopdemos;


public class ForLoopDemo {

	public static void main(String[] args) {
		
		//int i = 0;
		
		System.out.println("====for loop | comma usage example");
		for(int i= 0, j = 10; i < j; i++, j--) {
			System.out.println("counters: i = " + i + ", j = " + j);
		}
	}

}