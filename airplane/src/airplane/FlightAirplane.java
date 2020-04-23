package airplane;

public class FlightAirplane extends Airplane{
	boolean camouflage;
	double weapcap;
	
	FlightAirplane()
	{
		super();
		this.camouflage=false;
		this.weapcap=0.0;
	}
	
	FlightAirplane(String p,int c,int nf,double fc,boolean cam,double wc)
	{
		super(p,c,nf,fc);
		this.camouflage=false;
		this.weapcap=0.0;
	}
	
	void print()
	{
		System.out.println("producer:"+this.producer+" code of the airplane:"+this.code+" number of flight"+this.nrflight+" fuel capacity:"+this.fuelcapacity+" camouflage:"+this.camouflage+" weapon capacity:"+this.weapcap);
	}

}
