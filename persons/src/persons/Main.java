package persons;

import java.util.*;
import java.time.*;

public class Main {
	
	public static Person findOld(List<Pair<Person>> l)
	{
		int mini=0;
		Person p=new Person();
		LocalDate cd = LocalDate.now();
		int i=cd.getYear();
		for(Pair<Person> a: l)
		{
			if(i-a.getPerson1().year>mini)
				{
				    mini=i-a.getPerson1().year;
				    p=a.getPerson1();
				}
			if(i-a.getPerson2().year>mini)
			{
			    mini=i-a.getPerson2().year;
			    p=a.getPerson2();
			}
			
		}
		return p;		
	}
	
	public static void display(List<? extends Person> l)
	{
		for(Person i:l)
			System.out.println(i);
	}
	
	public static void  sortPairs(List<Pair<Person>> p)
	{
		int i,j;
		Pair<Person> aux;
		
		for(i=0;i<p.size()-1;i++)
		{
			for(j=i+1;j<p.size();j++)
			{
				if(p.get(i).getPerson1().fname.compareTo(p.get(j).getPerson1().fname)>0)
				{
					
					aux=p.get(i);
					p.set(i, p.get(j));
					p.set(j, aux);
					
				}
				else if(p.get(i).getPerson1().fname.compareTo(p.get(j).getPerson1().fname)==0)
				{
					System.out.println("ok");
					if(p.get(i).getPerson2().fname.compareTo(p.get(j).getPerson2().fname)>0)
					{
						
						aux=p.get(i);
						p.set(i, p.get(j));
						p.set(j, aux);

					}
				}
			}
		}

	}

	public static void main(String[] args) {
		
		Person p1=new Person("Ana","Gheorghe","Informatics PhD",1991);
		Person p2=new Person("Maria","Popescu","Informatics Bachelors",1997);
		Person p3=new Person("Ion","Ionescu","Psychology Masters",1995);
		Person p4=new Person("Vasile","Marinescu","Mathematics PhD",1992);
		Person p5=new Person("Ana","Marin","Interior Design Bachelors",1996);
		Person p6=new Person("Gheorghe","Poenar","Mechanics Masters",1994);
		
		Employee e1=new Employee("Gheorghe","Poenar","Mechanics Masters",1994,2400);
		Employee e2=new Employee("Ana","Marin","Interior Design Bachelors",1996,2400);
		Student s1=new Student("Maria","Popescu","Informatics Bachelors",1997,6);
		Student s2=new Student("Ion","Ionescu","Psychology Masters",1995,2);
		List<Person> p=new ArrayList<Person>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		p.add(p6);
		//p.add(e1);
		//p.add(s2);
		List<Employee> e =new ArrayList();
		e.add(e1);
		e.add(e2);
		List<Student> s=new ArrayList();
		s.add(s1);
		s.add(s2);
		Pair<Person> pp1=new Pair<Person>(p1,p2);
		Pair<Person> pp2=new Pair<Person>(p3,p4);
		Pair<Person> pp3=new Pair<Person>(p5,p6);
		List<Pair<Person>> pp=new ArrayList<Pair<Person>>();
		pp.add(pp1);
		pp.add(pp2);
		pp.add(pp3);
	  /*  
	    sortPairs(p);
	    for(Pair<Person> i : p)
		{
			System.out.println(i);
		}
*/
		//display(p);
		//display(e);
		//display(s);
		
		System.out.println(findOld(pp));
	}

}
