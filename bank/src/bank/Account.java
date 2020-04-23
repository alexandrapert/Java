package bank;

import java.util.Random;

abstract class Account implements Fee{
	
	double balance;
	int pin;
	
	Account()
	{
		this.balance=0;
		Random rand = new Random();
        int p= rand.nextInt(10)+rand.nextInt(100)+rand.nextInt(1000)+rand.nextInt(10000); 
		this.pin=p;
	}
	
	Account(double b)
	{
		this.balance=b;
		Random rand = new Random();
        int p= rand.nextInt(10)+rand.nextInt(100)+rand.nextInt(1000)+rand.nextInt(10000); 
		this.pin=p;
		if(fee()==true)
		{
			balance=balance-(0.1*balance);
		}
	}
	
	void print()
	{
		System.out.println("pin of the account:"+this.pin+" balance:"+this.balance);
	}
	
}
