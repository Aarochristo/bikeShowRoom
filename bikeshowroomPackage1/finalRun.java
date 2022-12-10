package bikeshowroomPackage1;

public class finalRun extends userdetails {

	public static void main(String[] args) {
		welcomePage cl1=new welcomePage();
		
		cl1.Welcome();
		cl1.bikes();
		
		userdetails cl2=new userdetails();
		
		cl2.setUsername("Aaron  ");
		
		cl2.setAddress("kochadai,madurai ");
		
		
		cl2.setContact(90806344655l);   
		
		System.err.println("UserData  : ");
				System.out.println(cl2.getUsername()+cl2.getAddress()+cl2.getContact());
		
		
		cl2.help();
		
				
					

	}

}
