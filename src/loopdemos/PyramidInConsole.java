package loopdemos;

import java.util.Scanner;

public class PyramidInConsole {	    
	public static void main(String[] args) {
		System.out.print("Please, enter height of the pyramid: ");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for (int i;i < height + 1; i++){
            for(int j = 0; j < i; j++){
                System.out.println("*");
            }
            System.out.println();
        }
        for (int i = height - 1;i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.println("*");
            }
            System.out.println();
        }
        
    }
	}