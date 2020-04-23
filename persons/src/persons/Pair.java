package persons;

import java.util.*;

public class Pair<t>{
	
	private Person obj1;
	private Person obj2;
	
	Pair(Person t1,Person t2)
	{
		this.obj1=t1;
		this.obj2=t2;
	}
	
	public Set<Person> getPair()
	{
		Set<Person> set = new HashSet<Person>(); 
		set.add(this.obj1);
		set.add(this.obj2);
		return set;
	}
	
	public void setPair(Person a,Person b)
	{
		this.obj1=a;
		this.obj2=b;
	}
	
	public void changePair()
	{
		Person objAux;
		objAux=this.obj1;
		this.obj1=this.obj2;
		this.obj2=objAux;
	}
	
	public Person getPerson1()
	{
		return this.obj1;
	}
	
	public Person getPerson2()
	{
		return this.obj2;
	}
	
	public String toString()
	{
		return "("+this.obj1+" ,"+this.obj2+");";
	}

}
