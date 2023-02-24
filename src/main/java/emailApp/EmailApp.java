package emailApp;

import java.util.Scanner;

public class EmailApp {
	public static void main(String[] args) {
		Email obj =new Email("John", "Wick");
		obj.getMailBoxCapacity();
		System.out.println("Do you want to set Alternate Email?\nPress Y or N ");
		Scanner scanner = new Scanner(System.in);
		char c = scanner.next().charAt(0);
		if (c=='Y') {
			System.out.println("Enter the email");
			String email=scanner.next();
			obj.setAlternateEmail(email);
			obj.getAlternateEmail();
		}
		else if(c=='N') {System.out.println("Ok");}
		scanner.close();
	}
}
