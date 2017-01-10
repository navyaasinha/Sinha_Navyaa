import static java.lang.Math.*;
public class excercise_12_1
{
	private int distance, hours, minutes;
	private double mph;
	
	public excercise_12_1()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public excercise_12_1(int dist, int hr, int min)
	{
		distance = dist;
		hours = hr;
		minutes = min;
		mph = 0;
	}
	 public void setexcercise_12_1(int dist, int hr, int min)
	 {
		distance = dist;
		hours = hr;
		minutes = min;
	 }
	 public int getDistance()
	 {
		 return distance;
	 }
	 public int getHour()
	 {
		 return hours;
	 }
	 public int getMinute()
	 {
		 return minutes;
	 }
	 public double getmph()
	 {
		 mph = Math.round(distance / (hours + minutes / 60.0));
		 return mph;
	 }
}
