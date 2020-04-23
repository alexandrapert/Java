package airplane;

import java.util.*;

public class EntertainAirplane extends Airplane implements LuxuryOptions{
	
	String owner;
	ArrayList<String> preown = new ArrayList<String> ();
	
	EntertainAirplane()
	{
		super();
		this.owner="";
	}
	
	EntertainAirplane(String p,int c,int nf,double fc,String o,ArrayList<String> po)
	{
		super(p,c,nf,fc);
		this.owner=o;
		for(String i: po)
		{
			this.preown.add(i);
		}
	}
	
	public boolean noisecnlhphns() {
		return true;
	}
	public boolean personalTV() {
		return true;
	}
	
	void print()
	{
		System.out.print("producer:"+this.producer+"; code of the airplane:"+this.code+"; number of flight"+this.nrflight+"; fuel capacity:"+this.fuelcapacity+"; current owner:"+this.owner+"; previous owners: ");
		
		for(String i: this.preown)
		{
		   System.out.print(i+"; ");
		}
		System.out.println();
	}

}
