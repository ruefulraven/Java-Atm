
public class AtmFunction implements AtmRules{

	Integer money = 10000;
	
	
	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	@Override
	public Integer depositMoney(Integer money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer withdrawMoney(Integer money) {
		try{
			this.money = this.money - money;
		}catch(NumberFormatException e){
			System.out.println("Its not a number");
		}
		return this.money;
	}

	@Override
	public void checkBalance() {
		System.out.println("Your current money is : " + money);
	}

}
