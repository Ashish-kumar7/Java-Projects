package StudentDatabaseApp;
import java.util.Scanner;
public class Student {
	
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String studentID;
	private String courses=" ";
	private int tutionBalance;
	private static int costofcourse=600;
	private static int id=1000;
	//Constructor:Prompt user to enter name and year
	public Student(){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Student First Name:");
		this.firstname=in.nextLine();
		System.out.println("Enter Student Last Name:");
		this.lastname=in.nextLine();
		System.out.println(" " + "1 = FreshMan \n 2 =Sophomore \n 3 Junior \n 4 Senior \n Enter Student Class Level:");
		this.gradeyear=in.nextInt();
		setStudentID();
		System.out.println("welcome!" + firstname+" " + lastname + " " + studentID );
	}
	// Generate an ID
	private void setStudentID(){
		id++;
		this.studentID=gradeyear + "" + id ;	
	}
	//Email in courses
	public void enroll(){
		do{
			System.out.println("Enter the course to enroll in(Q to Quit):");
			Scanner in= new Scanner(System.in);
			String course=in.nextLine();
			if(!course.equals("Q")){
				courses=courses + "\n" + course;
				tutionBalance=tutionBalance + costofcourse;
			}
			else{
				break;
			}
		}while(1!=0);
	//	System.out.println("ENROLLED IN:" + courses);
		//System.out.println("TUTION BALANCE:" + tutionBalance);
	}
	//view balance
	public void viewBalance(){
		System.out.println("Your Balance is:" + tutionBalance);
	}
	//Pay Tuition 
	public void paytution(){
		viewBalance();
		System.out.println("Enter Your Payment Amount:");
		Scanner in=new Scanner(System.in);
		int payment=in.nextInt();
		tutionBalance=tutionBalance-payment;
		System.out.println("THANKS! for Your Payment Amount:" + " " + payment);
		viewBalance();
	}
	//Show Status
	public String toString(){
		return " "+ "Name" + " "+ firstname + " " + lastname +
				"\n Student ID " + studentID +
				"\n Grade " + gradeyear +
				"\n Courses Enrolled in:" + courses +
				"\n Balance:" + tutionBalance + "\n";
	}
}
