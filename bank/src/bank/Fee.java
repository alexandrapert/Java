package bank;

import java.time.LocalDate;
import java.util.Calendar;

public interface Fee {
	
	default boolean fee()
	{ 
		LocalDate currentdate = LocalDate.now();
		int currentDay = currentdate.getDayOfMonth();
		Calendar cal = Calendar.getInstance();
		int res = cal.getActualMaximum(Calendar.DATE);
		return res==currentDay ? true : false;
	}

}
