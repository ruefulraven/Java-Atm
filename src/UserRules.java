
public interface UserRules {
	
	 String username(String username);
	 String password(String password);
	 
	 boolean userLogin(String username, String password);
	 void userLogout();
	 
	 void changePassword(String password);
	 
}
