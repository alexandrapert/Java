package bank;

public class Transaction {
	
	double value;
	
	 Transaction(CheckingAccount ca,double v)
	 {
		 ca.balance=ca.balance-v;
		 ca.balance=ca.balance-0.10; //fee of transfer
	 }
	 
	 Transaction(CDAccount ca,double v)
	 {
		 if(ca.keeptr()==true)
		 { ca.balance=ca.balance-v;
		   ca.contor++;
		 }
		 else
		 {
			 ca.balance=ca.balance-v;
			 ca.balance=ca.balance-(0.20*ca.balance);
		 }
		 
		 
	 }
	

}
