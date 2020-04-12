package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1=new Email("John","Smith");
		
		em1.setAlteranateEmail("ashishkumar@gmail.com");
		String hh=em1.getalternateemail();
		System.out.println("your alternate Email is:" + hh); 	
		
		System.out.println("All Data->" + em1.Showdata());
		
	}

}
