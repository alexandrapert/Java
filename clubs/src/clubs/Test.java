package clubs;

import java.util.*;
import java.util.Collection;
import java.util.Iterator;

public class Test {
	
	public static void mapping(Club[] c)
	{
		Map<Integer,String> clubMap = new HashMap<Integer,String>();
		for(Club i: c)
		{
				  if(clubMap.containsKey(i.year))
				  {
						  String val = clubMap.get(i.year);
						  clubMap.replace(i.year,val+"*");
					  }
				  else
				    clubMap.put(i.year, new String("*"));
			  }
			  
			  Set< Map.Entry<Integer,String> > st = clubMap.entrySet();    
			  for (Map.Entry<Integer,String> me:st) 
		       { 
		           System.out.print(me.getKey()+":"); 
		           System.out.print(me.getValue()+" ;"); 
		       } 
		}
	
	public static String bestClubMembers(FootballClub[] c)
	{
		
		Date d=new Date();
		String name="";
		int minim=(int)(d.getTime()/1000);
		int x=0,contor=0;
		for(FootballClub i: c)
		{
			contor=0;
			x=0;
			for(FCMember j: i.membersList)
			{
				 x = x+ (int) (j.expireDate.getTime()/1000);
				 contor++;
			}
			if(x/contor<minim)
				{
				   minim=x/contor;
				   name=i.clubName;
				}
		}
		return name;
		
	}
	
	static void openTimesNightClub(NightClub[] nc)
	{
		String x;
		for (NightClub i:nc)
		{
			Set< Map.Entry< String,String> > st = i.timetable.entrySet();    
		       for (Map.Entry< String,String> me:st) 
		       {
		    	   if(me.getKey()=="Thursday-Saturday")
		    	     x=me.getValue();
		       }
		}
	}
	
	public static String miniSalary(FootballClub[] fc)
	{
		int mini=0;
		for(FCMember i: fc[0].membersList)
		{
			mini=i.salary;
			break;
		}
		
		int total_salary=0;
		String name=fc[0].clubName;
		for(FootballClub i: fc)
		{
			total_salary=0;
			for(FCMember j: i.membersList)
			{
				total_salary=total_salary+j.salary;
			}
			if(total_salary<mini)
				{
				    mini=total_salary;
				    name=i.clubName;
				}
		}
		return name;
	}
	
	 public static <t> void displayClubs (t c[])
	{
		 for(t i: c)
		    System.out.println(i+",");
	}
	 
	 public static void sort(Club[] c)
	 {
		 int i,j;
		 Club temp;
		 for(i=0;i<c.length-1;i++)
		 {
			 for (j=i+1;j<c.length;j++) 
		        {
		                if (c[i].clubName.compareTo(c[j].clubName)>0) 
		                {
		                    temp = c[i];
		                    c[i] = c[j];
		                    c[j]= temp;
		                }
		            }
		        }
		 }
	
	public static void main(String[] args)
	{
		
		FCMember fm1= new FCMember("Ronaldo",10000,"12/11/2030");
		FCMember fm2= new FCMember("Andrew",8000,"12/11/2028");
		FCMember fm3= new FCMember("Gica",5000,"12/11/2026");
		FCMember fm4= new FCMember("Gica",5000,"12/11/2027");
		List<FCMember> ml= new ArrayList<FCMember>();
		List<FCMember> ml1= new ArrayList<FCMember>();
		ml.add(fm1);
		ml.add(fm2);
		ml1.add(fm3);
		ml1.add(fm4);
		
		FootballClub fc1=new FootballClub("barca",1999, "Calea Girocului nr 16",ml,"Lorenzo Cappanelli");
		FootballClub fc2=new FootballClub("dando",2005, "Calea Panselutei nr 16",ml1,"Francesco ");
		
		Map<String,String> timetable1=new HashMap<String,String>();
		timetable1.put("Sunday-Wednesday", "closed");
		timetable1.put("Thursday-Saturday","23:00-06:00");
		NightClub nc1= new NightClub("alice",2010,"Bvd Liviu Rebreanu nr 73",timetable1);
		
		timetable1.replace("Sunday-Wednesday", "closed");
		timetable1.replace("Thursday-Saturday","22:00-04:00");
		NightClub nc2= new NightClub("fratelli",2005,"Bvd Mihai Viteazu nr 170",timetable1);
		
		timetable1.replace("Sunday-Wednesday", "23:00-04:00");
		NightClub nc3= new NightClub("night",1999,"Bvd Liviu Rebreanu nr 290",timetable1);
		
		Club[] c=new Club[] {fc1,fc2,nc3,nc2,nc1};
		for(Club i: c)
		{
			System.out.println(i);
		}
		
		/*System.out.print("the number of clubs founded in each year of the clubs array: ");
		mapping(c);
		System.out.println();
		
		FootballClub[] fcm=new FootballClub[] {fc1,fc2};
		//System.out.println(bestClubMembers(fcm));
		System.out.println(miniSalary(fcm));
		//NightClub[] nc=new NightClub[] {nc1,nc2};
		displayClubs(c);
		*/
		System.out.println();
		sort(c);
		for(Club i: c)
		{
			System.out.println(i);
		}
	}
	 
}
