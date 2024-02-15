package controlstatements;

import java.util.Scanner;

public class UserActivitySelector {
    
    public static void main(String[] args) {
		System.out.print("Please, enter your input:");
		Scanner scanner = new Scanner(System.in); 
		String userInput = scanner.nextLine();
		
		switch (userInput){
		    case "login":
		        System.out.println("Please, enter your username");
		        break;
		    case "sign_up":
		        System.out.println("Welcome");
		        break;
		    case "terminate_program" :
		        System.out.println("Thank you! Good bye!");
		        break;
		    case "main_menu":
		        System.out.println("Main menu");
		        break;
		    case "about_app" :
		        System.out.println("This app was created by Brian");
		        break;
		  default:
		        System.out.println("Please, choose among the following, login, sign_up, terminate_program, main_menu, about_app");
		    
		    
		}
		
		
	}

}