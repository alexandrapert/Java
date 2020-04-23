package bank;

import java.time.LocalDate;

public class InterestAccount extends Account{
	
	double penalty;
	int pin;
	
	InterestAccount()
	{
		super();
		/*Random rand = new Random();
        int p= rand.nextInt(10)+rand.nextInt(100)+rand.nextInt(1000)+rand.nextInt(10000); 
		this.pin=p;*/
		
	}
	
	InterestAccount(double b)
	{
		super(b);
		/*Random rand = new Random();
        int p= rand.nextInt(10)+rand.nextInt(100)+rand.nextInt(1000)+rand.nextInt(10000); 
		this.pin=p;
		if(fee()==true)
		{
			balance=balance-(0.1*balance);
		}
		*/
	}
	void getMonthlyInterest()
	{
		LocalDate currentdate = LocalDate.now();
		int currentDay = currentdate.getDayOfMonth();
		if(currentDay==1)
		{
			this.balance=this.balance-(0.07*this.balance);
		}
	}
	

}
