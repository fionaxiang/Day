
public class DayDriver {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Day day = new Day("Sun");
System.out.println("Current Day:" + day);
System.out.println("Next Day :" + day.nextDay());
System.out.println("Previous day:" + day.previousDay());
System.out.println("Next 4 day : " + day.calculateDay(4));

	}
	}
