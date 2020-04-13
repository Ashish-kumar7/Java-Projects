package StudentDatabaseApp;
import java.util.Scanner;
public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ask how many user we want to add
		System.out.print("Enter the number of students:");
		Scanner in=new Scanner(System.in);
		int numofstudents=in.nextInt();
		//create an array of n number of students
		Student[] Students=new Student[numofstudents];
		for(int i=0;i<numofstudents;i++ ){
			Students[i]=new Student();
			Students[i].enroll();
			Students[i].paytution();
		}
		for(int j=0;j<numofstudents;j++){
			System.out.println(Students[j].toString());
		}
	}
}
