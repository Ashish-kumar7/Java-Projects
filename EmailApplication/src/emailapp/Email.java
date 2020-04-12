package emailapp;
import java.util.Scanner;
public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String Email;
	private int mailboxcapacity=500;
	private int defaultpasswordlength=10;
	private String alternateEmail;
	private String companySuffix="Ashishcompany.com";
	
	//constructor to receive firtsname and lastname 
	public Email (String firstname, String lastname){
		this.firstname=firstname;
		this.lastname=lastname;
		System.out.println("EMAIL CREATED:" + this.firstname + " " + this.lastname );
		
		//call a method for department and return department
		
		this.department=setdepartment();
		System.out.println("Department:" + this.department);
		
		this.password=randompassword(defaultpasswordlength);
		System.out.println("Your password is:" + this.password);
		
		Email=firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department +"." + companySuffix ;
		
		System.out.println("your Email id is:" + Email);
	}
	//ask for the department
	private String setdepartment(){
		System.out.println("Department you belong to:");
		System.out.println("1 for sales ");
		System.out.println("2 for development ");
		System.out.println("3 for accounting ");
		System.out.print("Enter the code:");
		Scanner in = new Scanner(System.in);
		int depchoice=in.nextInt();
		if(depchoice==1){
			return "sales";
		}
		else if(depchoice==2){
			return "development";
		}
		else if(depchoice==3){
			return "accounting";
		}
		else{
			return "";
		}
	}
	//generate a password 
	private String randompassword(int length){
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVXYZ123456789@#$";
		char[]password= new char[length];
		for(int i=0;i<length;i++){
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	//set the mailbox capacity
	  public void setmailboxcapacity(int capacity){
		  this.mailboxcapacity=capacity;
	  }
	//setthe alternative email
	  public void setAlteranateEmail(String altemail){
		  this.alternateEmail=altemail;
	  }
	 
	//change the password 
	   public void changepassword(String password){
		   this.password=password;
	   }
	   public int getmailboxcapacity(){
		   return mailboxcapacity;
	   }
	   public String getalternateemail(){
		   return alternateEmail;
	   }
	   public String getpassword (){
		   return password;
	   }
	   public String Showdata(){
		   return "\nFirstName: " + firstname  + "\nLastname: " + lastname +
				   "\nDepartment: " + department  + "\nEmail-ID: " + Email  +
				   "\nMailBox-Capacity: " + mailboxcapacity ;
	   }
}
