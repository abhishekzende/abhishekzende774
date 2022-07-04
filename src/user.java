

import java.nio.file.Path;
import java.util.Scanner;

public class user {

	public static void main(String[] args) {
		
		System.out.println("*****SIMPLILEARN*****");
		System.out.println("*****SD PHASE1 PROJECT*****");
		System.out.println("*****ABHISHEK ZENDE*****");
		
		System.out.println("Main Menu");
		
		System.out.println("Select the option");
		System.out.println("1.Display the file name in asending");
		System.out.println("2.display the user interface menu");
		System.out.println("3.exit");
		
		System.out.println("select the option");
		Scanner input=new Scanner(System.in);
		int ch =input.nextInt();
		
		switch(ch) {
		 
		case 1:
			user.listfilesinasecendingorder();
		break;
		case 2:
			System.out.println("OPTION 2");
			userinterface();
			break;
		case 3:
			System.out.println("thank you for using");
			System.exit(ch);
		default:System.out.println("invalid option");
		}
		

	}


	public static  void userinterface() {
		System.out.println("user interface menu");
		
		System.out.println("1.Add user specified file to the applications");
		System.out.println("2.delete a user specified file from the applications");
		System.out.println("3.search a user specified file from the applications");
		System.out.println("4.back to the menu");
		
		Scanner input=new Scanner(System.in);
		System.out.println("select the choice");
		int ch=input.nextInt();
		
		switch(ch) {
		 
		case 1:
			user.createuserfile();
		break;
		case 2:
			System.out.println("OPTION 2");
			user.deleteuserfile();
			break;
		case 3:
			System.out.println("option 3");
			user.searchfile();
			
		case 4:
			System.out.println("back to menu");
			
		default:System.out.println("invalid option");
		}
		
		
		
		
	}

	private static void searchfile() {
		// TODO Auto-generated method stub
		
	}


	private static void deleteuserfile() {
		// TODO Auto-generated method stub
		
	}


	public static void createuserfile() {
		this.Path=Path.get("./files/userfiles");
		
	
 
		
	}


	public static void listfilesinasecendingorder() {
		// TODO Auto-generated method stub
		
	}

}
