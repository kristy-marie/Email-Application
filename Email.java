import java.util.*;
public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private int defaultPasswordLength=10;
	private String department;
	private int mailBoxCapacity=500;
	private String alternateEmail;
	private String companySuffix = "company.com";
	private static boolean  keepGoing=true;
	
	public Email(String firstName, String lastName) {
		this.firstName=firstName; // class level variable and other referring to local variable in parameter
		this.lastName=lastName;
		
		// call a methid asking for a department and return department
		this.department=setDepartment();
		
		
		// call method that returns a random passworrd
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		// combine elements to generate emailemail
		email=firstName.toLowerCase()+"." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		
	}
	
	
	// ask for department
	private String setDepartment() {
		Scanner in = new Scanner(System.in);
		System.out.println("New worker "+ firstName + " . Department codes:\n1 for sales\n2 for development\n3 for accounting\n0 for none\nEnter department code:");
		
		int departmentChoice=in.nextInt();
		
		if(departmentChoice == 1) {return "sales";}
		else if(departmentChoice ==2) {return "Development";}
		else if(departmentChoice == 3) {return "Accounting";}
		else if(departmentChoice == 0) {return "You chose nothing";}
		else {return "";}	
			
		}

	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYX1234567890!@#$%";
		char[] password = new char[length];
		for(int i = 0; i < length;i++) {
		int rand = (int) (Math.random()*passwordSet.length());
		password[i] = passwordSet.charAt(rand);
		}
		
		
		return new String(password);
	}
	
	// set mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity=capacity;
	}
	
	
	// set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	
	
	// change the password
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailboxCapcity() {
		return mailBoxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setFirstName(String fristName) {
		this.firstName=firstName;
	}
	
	public String getFirstName() {
		
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: "+ firstName + lastName + "\nCOMPANY EMAIL: "
 + email + "\nMAILBOX CAPACITY: " + mailBoxCapacity + " mb";	}

}
