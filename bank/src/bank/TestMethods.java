package bank;

public class TestMethods {
	
	
	public static void main(String[] arg)
	{
		
		CDAccount ac=new CDAccount(2900);
		ac.print();
		Transaction t=new Transaction(ac,20);
		ac.print();
		Transaction tt=new Transaction(ac,20);
		ac.print();
		CheckingAccount cc=new CheckingAccount(1000);
		cc.print();
		Transaction t1=new Transaction(cc,100);
		cc.print();
	}

}
