package persons;

public class Student extends Person{
	
	int semNoTax;
	
	Student()
	{
		super();
		semNoTax=0;
	}
	
	Student(String fn,String ln,String s,int y,int snt)
	{
		super(fn,ln,s,y);
		this.semNoTax=snt;
	}
	

}
