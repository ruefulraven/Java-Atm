
public class User implements UserRules{
	
	private String username = "Ax3l";
	private String password = "20150128";

	@Override
	public String username(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String password(String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean userLogin(String username, String password) {
		if(this.username.matches(username) && this.password.matches(password)){
			return true;
		}
		return false;
	}

	@Override
	public void userLogout() {
		System.out.println("Bye bye!");
	}

	@Override
	public void changePassword(String password) {
		// TODO Auto-generated method stub
		
	}

}
