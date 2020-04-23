package airplane;

public class Airplane {
	String producer;
	int code, nrflight;
	double fuelcapacity;
	
	Airplane()
	{
		this.producer="";
		this.code=0;
		this.nrflight=0;
		this.fuelcapacity=0.0;
	}
	
	Airplane(String p,int c,int nf,double fc)
	{
		this.producer=p;
		this.code=c;
		this.nrflight=nf;
		this.fuelcapacity=fc;
	}
	
	void print()
	{
		System.out.println("producer:"+this.producer+" code of the airplane:"+this.code+" number of flight"+this.nrflight+" fuel capacity:"+this.fuelcapacity);
	}
	
	 boolean noisecnlhphns() {
		return false;
	}
	 boolean personalTV() {
		return false;
	}
	
}
