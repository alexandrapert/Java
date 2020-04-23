package persons;

/*
a)Create a class Person that has like attributes first name, last name, last attendee studies and year of birth.  

b)Create a generic class Pair that has two members the (x,y). Create set/get methods, constructor,
a method that allows the displaying of an object of type pair and a methods for switching the order of pair members. 

c)Create a list of type pairs of Persons and display the list 

d)Sort the list of pairs of person based on first pair member last name, and if 2 persons have 
the same last name, based on second pair member last name 

e)Create a map with the last attendee studies and the list of persons that done that studies
(from the list of pair). Display the map 

f)From Person class derive classes Employee that has a salary and a class Student that has 
an attribute telling how many semester it performed without taxes.
 
g)Create a method that allows to display list of Persons, list of Employee and
lists of Students but does not allow to display list of pairs of persons 

h)Modify the pair class in order to allow the creation only just of pairs of persons 

g)Find the oldest Person from the list of pairs   */

public class Person {
	
	// first name, last name, last attendee studies and year of birth.  
	String fname;
	String lname;
	String studies;
	int year;
	
	Person()
	{
		//System.out.println("no input for this person");
		fname="";
		lname="";
		studies="";
		year=0;
	}
	
	Person(String fn,String ln,String s,int y)
	{
		this.fname=fn;
		this.lname=ln;
		this.studies=s;
		this.year=y;
	}
	
	public String toString()
	{
		return "first name:"+this.fname+"; last name:"+this.lname+"; studies:"+this.studies+"; year of birth:"+this.year;
	}
	

}
