package clubs;

public class Club {
	
	//name,yearoffoundingandanaddress;
	String clubName;
	int year;
	String address;
	
	Club()
	{
		this.clubName="";
		this.year=0;
		this.address="";
		System.out.println("no data introduced about the club");
	}
	
	Club(String n,int y,String ad)
	{
		this.clubName=n;
		this.year=y;
		this.address=ad;
	}
	
	public String toString()
	{
		return "club name:"+this.clubName+" year of foundation:"+this.year+" address:"+this.address;
	}

}
