import java.util.Scanner;

public class Assignment5_1
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		double num1, num2, num3, num4, num5, num6;

		//h(x)
		System.out.println("Please enter a number you would like to see to the"
			+ " tenth power.");
		num1 = in.nextInt();
		System.out.println("The answer is " + h(num1));

		//f(x,y)
		System.out.println("Now enter two numbers that you would like to see added");
		num2 = in.nextDouble();
		num3 = in.nextDouble();
		System.out.println("The sum is " + f(num2, num3));

		//g(x,y,z)
		System.out.println("This next part perform three different opperations and sum"
			+ " the parts.");
		System.out.println("Please enter the first number: ");
		num4 = in.nextDouble();
		System.out.println("Enter a second number: ");
		num5 = in.nextDouble();
		System.out.println("Now a third number: ");
		num6 = in.nextDouble();
		System.out.println("The answer is: " + g(num4, num5, num6));

	}

	public static double h(double x)
	{	
		double dblx = x;

		for (int i=1; i<10; i++)
		{
			dblx = dblx*x;
		}
		return dblx;
	}
	public static double f(double a, double b)
	{
		double ans;

		ans = a + b;

		return ans;
	}
	public static double g(double e, double f, double g)
	{
		double sqrRoot, hold, abs, ans, expo;
		
		sqrRoot = e/2;

		do 
		{
			hold = sqrRoot;
			sqrRoot = (hold + (e/hold))/2;
		}
		while ((hold - sqrRoot) != 0);

		if (f>=0)
		{
			abs = f;
		}
		else
		{
			abs = (-1*f);
		}
		
		expo = g;

		for (int i=1; i<abs; i++)
		{
			expo = expo*g;
		}
		if (f<0)
		{
			expo = (1/expo);
		}

		ans = sqrRoot + abs + expo;

		return ans;
	}
			
}
