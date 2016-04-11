public class CarDriver
{
	public static void main (String[] args)
	{
		Car myCar = new Car();
		Car hisCar = new Car("Black", "Honda", 400, 3.5);
		Car herCar = new Car("Pink", "Voltswagen", 300, 2.5);

		System.out.println("Once upon a time, we had these cars: ");
		System.out.println("My car was: " + myCar);
		System.out.println("His car was: " + hisCar);
		System.out.println("Her car was: " + herCar);

		myCar.setMake("Ferrari");
		myCar.setColor("Blue");
		myCar.setHrsPwr(650);
		myCar.setEngSize(6.5);

		herCar.setMake("Ferrari");
		herCar.setColor("Blue");
		herCar.setHrsPwr(650);
		herCar.setEngSize(6.5);

		hisCar.setMake("Ferrari");
		hisCar.setColor("Blue");
		hisCar.setHrsPwr(650);
		hisCar.setEngSize(6.5);

		System.out.println("\nNow we have these cars!");

		System.out.println("\nMy car is: \nMake: " + myCar.getMake() 
			+ "\nColor: " + myCar.getColor() 
			+ "\nHorsepower: " + myCar.getHrsPwr()
			+ "\nEngine Size(cu/l): " + myCar.getEngSize());

		System.out.println("\nHis car is: \nMake: " + hisCar.getMake()
			+ "\nColor: " + hisCar.getColor() 
			+ "\nHorsepower: " + hisCar.getHrsPwr()
			+ "\nEngine Size(cu/l): " + hisCar.getEngSize());

		System.out.println("\nHer car is: \nMake: " + herCar.getMake() 
			+ "\nColor: " + herCar.getColor() 
			+ "\nHorsepower: " + herCar.getHrsPwr()
			+ "\nEngine Size(cu/l): " + herCar.getEngSize());
	}
}
