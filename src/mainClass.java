import java.util.Scanner;

public class mainClass {
	public static boolean isLogin = false;
	static Scanner scanner = new Scanner(System.in);
	public static boolean userInteraction = true;
	public static String username = "";
	public static String password = "";
	public static String interaction;
	public static Integer money;
	
	static User user = new User();
	static AtmFunction function= new AtmFunction();
	
	//method for logging-in
	public static void userLogin(){
		System.out.println("Good day!");
		System.out.println("Please input username");
		username = scanner.next();
		System.out.println("Please input password");
		password = scanner.next();
		
		isLogin = user.userLogin(username, password);
		
		userOptions();
		
	}
	
	public static void userContinue(){
		System.out.println("Do you want to continue? Y / N");
		interaction = scanner.next();
		
		if(interaction.matches("N")){
			isLogin = false;
			userOptions();
		}
		isLogin = true;
		userOptions();
	}
	
	public static void userOptions(){
		if(isLogin == true){
			System.out.print("Pick a task : \n");
			System.out.print("1 -> Check Balance \n");
			System.out.print("2 -> Withdraw Money \n");
			System.out.print("3 -> Deposit Money \n");
			System.out.print("4 -> Logout \n");
			Integer option = scanner.nextInt();
			
			switch (option) {
			case 1:
				function.checkBalance();
				userContinue();
				break;
			
			case 2:
				System.out.println("How much to withdraw?");
				money = scanner.nextInt();
				//made it to variable for future purposes maybe?
				function.withdrawMoney(money);
				System.out.print("Action Successful \n");
				System.out.print("You withdrawed : " + money);
				money = money - money;
				userContinue();
				
			case 3:
				try{
					System.out.println("How much to Deposit");
					money = scanner.nextInt();
					//made it to variable for future purposes maybe?
					function.depositMoney(money);
					System.out.print("Action Successful \n");
					System.out.print("You deposited : " + money);
					money = money - money;
					userContinue();
					
				}catch(Exception e){
					System.out.println("Wrong input");
				}
				break;
				
			case 4:
				isLogin = false;
				user.userLogout();
				userOptions();
				break;
				
			default:
				System.out.println("Wrong Input!");
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		userLogin();
	}

}
