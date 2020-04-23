package airplane;

public class LineAirplane extends Airplane implements LuxuryOptions{
	
	int maxpasag;
	LineAirplane()
	{
		super();
		this.maxpasag=0;
	}
	LineAirplane(String p,int c,int nf,double fc,int mp)
	{
		super(p,c,nf,fc);
		this.maxpasag=mp;
	}
	
	public boolean noisecnlhphns() {
		return false;
	}
	public boolean personalTV() {
		return false;
	}
	
	void print()
	{
		System.out.println("producer:"+this.producer+" code of the airplane:"+this.code+" number of flight"+this.nrflight+" fuel capacity:"+this.fuelcapacity+" maximum number of passengers:"+this.maxpasag);
	}

}
