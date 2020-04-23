package clubs;
import java.util.*;

public class FootballClub extends Club {
	
	//name,year of founding and an address + members list and a trainer
	List<FCMember> membersList= new ArrayList<FCMember>();
	String trainer;
	
	FootballClub()
	{
		super();
		System.out.println("empty member list created; no trainer name added");
		this.trainer="";
	}
	
	FootballClub(String n,int y, String ad, List<FCMember> ml, String t)
	{
		super(n,y,ad);
		for(FCMember i: ml)
		{
			this.membersList.add(i);
		}
		this.trainer=t;
	}
	
	public String toString()
	{
		return "club name:"+this.clubName+" year of foundation:"+this.year+" address:"+this.address+" list of members:"+this.membersList.toString()+"; trainer of the team:"+this.trainer;
	}


}
