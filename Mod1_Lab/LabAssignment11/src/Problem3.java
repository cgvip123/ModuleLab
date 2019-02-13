interface Authentication {
	String userName = "YANSHU";
	int password = 12345;
	
	boolean authentication(String userName, int password);
}
public class Problem3 {

	public static void main(String[] args) {
		
		Authentication auth = (String userName, int password) -> {
			
			if(userName.equals(Authentication.userName) && password == Authentication.password)	return true;
			
			return false;
		};

		System.out.println(auth.authentication("YANSHU", 12345));
		
		System.out.println(auth.authentication("Gupta", 12345));
		
	}

}
