public class Car
{
	private String color, make;
	private int hrsPwr;
	private double engSize;

	/**constructor with no initial values*/
	public Car()
	{
		make = "Honda";
		color = "blue";
		hrsPwr = 300;
		engSize = 3.5;
	}
	/**constructor with inital values*/
	public Car(String incolor, String inMake, int inPwr, double inSize)
	{
		make = inMake;
		color = incolor;
		hrsPwr = inPwr;
		engSize = inSize;
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
			+ this.hrsPwr + " horswpower";
	}
}












