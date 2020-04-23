package bank;


public class RegularAccount extends Account{
	
	int pin;
	
	RegularAccount()
	{
		super();
		
	}
	
	RegularAccount(double b)
	{
		super(b);
	}
	
	void checkBalance()
	{
		if(this.balance<500)
			this.balance=this.balance-10;
	}
	
}
