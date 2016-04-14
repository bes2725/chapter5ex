public class Car2
{
	private String color, make;
	private int hrsPwr;
	private static int count=0;
	private double engSize;

	/**constructor with no initial values*/
	public Car2()
	{
		make = "Honda";
		color = "blue";
		hrsPwr = 300;
		engSize = 3.5;
		count ++;
	}
	/**constructor with inital values*/
	public Car2(String color, String make, int hrsPwr, double engSize)
	{
		this.make = make;
		this.color = color;
		this.hrsPwr = hrsPwr;
		this.engSize = engSize;
		count ++;
	}
	/**accessors*/
	public String getMake()
	{
		return make;
	}
	public String getColor()
	{
		return color;
	}
	public int getHrsPwr()
	{
		return hrsPwr;
	}
	public double getEngSize()
	{
		return engSize;
	}
	public static int getCount()
	{
		return count;
	}

	/**mutator*/
	public void setMake(String make)
	{
		this.make = make;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setHrsPwr(int hrsPwr)
	{
		this.hrsPwr = hrsPwr;
	}
	public void setEngSize(double engSize)
	{
		this.engSize = engSize;
	}
	/**to string*/
	public String toString()
	{
		return this.make + ", " + this.color + ", " + this.engSize + " cu/l engine, "
			+ this.hrsPwr + " horsepower";
	}	
	public boolean compare(Car2 carA)
	{
		if ((this.make.equalsIgnoreCase(carA.getMake()))
			&& (this.color.equalsIgnoreCase(carA.getColor()))
			&& (this.hrsPwr == carA.getHrsPwr())
			&& (this.engSize == carA.getEngSize()))
		{ 
			return true;
		}
		else
		{
			return false;
		}
	}
			
}














