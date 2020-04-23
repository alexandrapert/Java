package bank;
import java.time.*;
public class CheckingAccount extends Account{
	
	int pin;
	
	CheckingAccount()
	{
		super();
	}
	
	CheckingAccount(double b)
	{
		super(b);
	}
	
	void getYearlyInterest()
	{
		LocalDate currentdate = LocalDate.now();
		int currentMonth = currentdate.getMonthValue();
		if(currentMonth==1)
		{
			this.balance=this.balance-(0.07*this.balance);
		}
	}
	
	void checkBalance()
	{
		if(this.balance<100)
			this.balance=this.balance-10;
	}

}
