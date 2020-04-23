package persons;

public class Employee extends Person
{
	
	int salary;
	Employee()
	{
		super();
		this.salary=0;
	}
	Employee(String fn,String ln,String s,int y,int sl)
	{
		super(fn,ln,s,y);
		this.salary=sl;
	}

}
