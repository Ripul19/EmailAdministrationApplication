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
		
		System.out.println("Your mailbox capacity is: "+ obj.getMailBoxCapacity());
		System.out.println("Do you want to increase the mail box capacity\nPress Y or N");
		char c2=scanner.next().charAt(0);
		if (c2=='Y') {
			System.out.println("Enter the new mailbox capacity you want: ");
			int capacity=scanner.nextInt();
			obj.setMailboxCapacity(capacity);
			System.out.println("Your mailbox capacity is: "+ obj.getMailBoxCapacity());
		}
		else if (c2=='N') {
			System.out.println("Ok");
		}
		scanner.close();
	}
}
