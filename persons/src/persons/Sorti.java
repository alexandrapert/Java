package persons;

import java.util.Comparator;

public class Sorti implements Comparator<Pair<Person>> {
	 
	    
	    public int compare(Pair<Person> a,Pair<Person> b) 
	    { 
	         return a.getPerson1().fname.compareTo(b.getPerson2().fname);
	    } 
} 


