
public class Day {
	private String day;
	private String [] days ={"Mon","Tue","Wed","Thu","Fri","Sat", "Sun"};
	/**
	 * Initialize to Monday
	 */
	public void Day(){
		this.day = "Mon";
	}
	/**
	 * Initialize day of the week
	 * @param day day of the week
	 */
	public Day(String day){
		super();
		this.day= day;
	}
	/**
	 * 
	 * @return get the current day
	 */
public String getDay(){
	return day;
	
}public void setDay(String day){
	this.day = day;
}
/**
 * 
 * @param numOfDays
 * @return
 */
public String calculateDay(int numOfDays){
	String message = "";
	int dayIndex = getDayIndex(this.day);
	if(dayIndex!=-1){
		//%7 to loop back to beginning index of days array to prevent
		// index out of bounds errors
		message = days[(dayIndex+numOfDays)%7];
	}else{
		message ="Invalid Day!";
	}
	return message;
	
}
/**
 * 
 * @return previousDay and nextDay
 */
public String previousDay(){
	return calculateDay(-1);
}
public String nextDay(){
	return calculateDay(1);
}
/**
 * 
 * @param day
 * @return
 */

private int getDayIndex(String day){
	for(int i=0; i<days.length;i++){
		if(days[i]==this.day){
			return i ;
		}
	}return -1;
}

public String toString(){
	return "Day [day=" +day + "]";
}
}


