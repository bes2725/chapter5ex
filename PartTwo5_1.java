import java.lang.Math;
import java.util.Scanner;

public class PartTwo5_1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double num, num2, randy;

		System.out.println("Enter a number, any number!");
		num = in.nextDouble();
		//math.pow
		System.out.println("Your number raised to the power of 5 is: " 
			+ Math.pow(num,5));
		//math.sqrt
		System.out.println("The square root of your number is: " 
			+ Math.sqrt(num));
		//math.abs
		System.out.println("The absolute valute of your number is: "
			+ Math.abs(num));
		
		System.out.println("Now, enter a second number: ");
		num2 = in.nextDouble();

		//math.min
		System.out.println("The smaller of the two is: " + Math.min(num, num2));
		//math.max
		System.out.println("Which means the larger is: " + Math.max(num, num2));
		//math.random
		randy = Math.random();
		System.out.println("A random number is: " + randy);
		//math.round
		System.out.println("Rounded, that's: " + Math.round(randy));
		//math.ceil
		System.out.println("Or: " + Math.ceil(randy));
		//math.floor
		System.out.println("OR!: " + Math.floor(randy));
	

	}
}
