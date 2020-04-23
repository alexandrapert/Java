package clubs;

import java.util.*;

public class NightClub extends Club{

	//name,year of founding and an address +timetable
	
	 Map<String,String> timetable=new HashMap<String,String>();
	
	
	NightClub()
	{
		super();
		System.out.println("empty timetable created; no data introduced");
		
	}
	
	NightClub(String n,int y, String ad,Map<String,String> t)
	{
		super(n,y,ad);
		Set< Map.Entry< String,String> > st = t.entrySet();    
	       for (Map.Entry< String,String> me:st) 
	       {
	    	   timetable.put(me.getKey(),me.getValue());
	       }
	}
	
	public String toString()
	{
		//Set< Map.Entry< String,String> > st = this.timetable.entrySet();    
	       
		return "club name:"+this.clubName+" year of foundation:"+this.year+" address:"+this.address+" timetable: Sunday-Wednesday: "+this.timetable.get("Sunday-Wednesday")+"; Thursday-Saturday: "+this.timetable.get("Thursday-Saturday");
	}
	

}
