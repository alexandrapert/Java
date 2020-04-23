package bank;

import java.time.LocalDate;

public class CDAccount extends Account {
	
	int contor=0;
	LocalDate currentdate = LocalDate.now();
	int currentYear = currentdate.getYear();
	int y=currentYear ;

	CDAccount()
	{
		super();
	}
	
	CDAccount(double b)
	{
		super(b);
	}
	
	void getYearlyInterest()
	{
		LocalDate currentdate = LocalDate.now();
		int currentMonth = currentdate.getMonthValue();
		if(currentMonth==1)
		{
			this.balance=this.balance-(0.15*this.balance);
		}
	}
	
	boolean keeptr()
	{
		LocalDate currentdate = LocalDate.now();
		int currentYear = currentdate.getYear();
		return contor==0?true:(currentYear==this.y&&contor!=0)?false:(currentYear!=this.y)?true:false;
	}

	void print()
	{
		System.out.println("pin of the account:"+this.pin+" balance:"+this.balance);
	}
	
}
