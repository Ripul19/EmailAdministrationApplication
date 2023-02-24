package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity =5000;
	private String email;
	private String alternateEmail;
	private int defaultPasswordLength=8;
	private String companySuffix ="anyCompany.com";
	Scanner in = new Scanner(System.in);
	
	//constructor to get firstName and lastName
	public Email(String firstName, String lastName) {
		this.firstName =firstName;
		this.lastName=lastName;
		System.out.println("Email Created: "+this.firstName+" "+this.lastName);
		
		//Calling the setDepartment method
		this.department=setDepartment();
		System.out.println("Department: "+this.department);
		
		
		//generate email
		email = firstName.toLowerCase()+lastName.toLowerCase()+"@"+this.department+"."+companySuffix;
		System.out.println("Your email is: "+email);
		
		//call the password method
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Password: "+this.password);

	}
	
	//Ask for department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales \n2 for Development \n3 for Accounting \n0 for none\nEnter the department\n");
		int dept=in.nextInt();
		
		if(dept ==1){return "sales";}
		else if (dept ==2){return "Development";}
		else if (dept ==3) {return "Accounting";}
		else {return " ";}
	}
	
	//Generate Random Password
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&";
		char[]password=new char[length];
		for(int i=0;i<length;i++) {
			int randomPassword = (int) (Math.random()* passwordSet.length());
			password[i]=passwordSet.charAt(randomPassword);
		}
		return new String(password);
	}
	
	//mailbox capacity
	public void setMailboxCapacity(int capacity){
		this.mailBoxCapacity=capacity;
	}
	
	//alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	
	//change password
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailBoxCapacity() {return mailBoxCapacity;}
	public void getAlternateEmail() {System.out.println("Your alternate email is: "+this.alternateEmail);}
	public String getPassword() {return password; }
}
