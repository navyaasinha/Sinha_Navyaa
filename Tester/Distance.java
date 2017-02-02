import java.lang.Math.*;
public class Distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public Distance()
	{
		xOne = 0;
		xTwo = 0;
		yOne = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
		distance = 0;
	}
	public void setValues(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
	}
	
	public int getXOne()
	{
		return xOne;
	}
	public int getXTwo()
	{
		return xTwo;
	}
	public int getYOne()
	{
		return yOne;
	}
	public int getYTwo()
	{
		return yTwo;
	}
	public double getDist()
	{
		distance = Math.sqrt((xTwo - xOne) * (xTwo - xOne) + (yTwo - yOne) * (yTwo - yOne));
		return distance;
	}
}
