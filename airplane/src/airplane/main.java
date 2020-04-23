package airplane;

import java.util.ArrayList;
import java.util.*;

public class main {
	public static void main(String[] arg)
	{
		//producer,code,numberofflights,fuelcapacity 
		FlightAirplane fa1=new FlightAirplane("Boeing",767,200,12000,true,20);
		LineAirplane la1=new LineAirplane("bubu",123,300,9000,300);
		LineAirplane la2=new LineAirplane("bibu",444,320,10000,400);
		ArrayList<String> p = new ArrayList<String> ();
		p.add("manu");
		p.add("popescu");
		p.add("vadoi");
		p.add("ionescu");
		EntertainAirplane ea1=new EntertainAirplane("bobo",456,50,6000,"manu",p);
		
		ArrayList<Airplane> arrli = new ArrayList<Airplane>(); 
		arrli.add(fa1);
		arrli.add(la1);
		arrli.add(la2);
		arrli.add(ea1);
		
		  Map<String,String> airmap = new HashMap<String,String>();
		  for(Airplane i: arrli)
		  {
			  i.print();
			  if(i.noisecnlhphns()==true)
			  System.out.println(i.producer);
			  if(airmap.containsKey(i.getClass().getName()))
			  {
					  String val = airmap.get(i.getClass().getName());
					  airmap.replace(i.getClass().getName(),val+"*");
				  }
			  else
			    airmap.put(i.getClass().getName(), new String("*"));
		  }
		  
		  Set< Map.Entry<String,String> > st = airmap.entrySet();    
		  for (Map.Entry<String,String> me:st) 
	       { 
	           System.out.print(me.getKey()+":"); 
	           System.out.println(me.getValue()); 
	       } 
		 
		  
         
	}


}
