package clubs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FCMember {
	
	//name,salary and contract expire date(Date class)
	
	String name;
	int salary;
	Date expireDate=new Date();
	
	FCMember(String n,int s,String d)//throws Exception
	{
		this.name=n;
		this.salary=s;
		//this.expireDate=d;
		try {
	         this.expireDate=new SimpleDateFormat("dd/MM/yyyy").parse(d);
	     } catch (ParseException e) {
	       System.out.println("incorrect input");
	     }
    }
	
	public String toString()
	{
		return "name:"+this.name+"; salary:"+this.salary+"; expire date of the contract:"+this.expireDate;
	}
}


