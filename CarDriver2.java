import javax.swing.JOptionPane;

public class CarDriver2
{
	public static void main(String[] args)
	{
		Car2 carA = new Car2();
		Car2 carB = new Car2();
		Car2 carC = new Car2();
		Car2 carD = new Car2();
		//info carA
		JOptionPane.showMessageDialog(null, "Let's start with the first car.");
		carA.setMake(JOptionPane.showInputDialog("What make is the car?"));
		carA.setColor(JOptionPane.showInputDialog("What color?"));
		carA.setHrsPwr(Integer.parseInt(JOptionPane.showInputDialog("What is the "
			+ "horsepower?")));
		carA.setEngSize(Double.parseDouble(JOptionPane.showInputDialog("Finally, "
			+ "what about the engine size?")));

		JOptionPane.showMessageDialog(null, "On to the second car.");
		carB.setMake(JOptionPane.showInputDialog("What make is the car?"));
		carB.setColor(JOptionPane.showInputDialog("What color?"));
		carB.setHrsPwr(Integer.parseInt(JOptionPane.showInputDialog("What is the "
			+ "horsepower?")));
		carB.setEngSize(Double.parseDouble(JOptionPane.showInputDialog("Finally, "
			+ "what about the engine size?")));

		JOptionPane.showMessageDialog(null, "Next.");
		carC.setMake(JOptionPane.showInputDialog("What make is the car?"));
		carC.setColor(JOptionPane.showInputDialog("What color?"));
		carC.setHrsPwr(Integer.parseInt(JOptionPane.showInputDialog("What is the "
			+ "horsepower?")));
		carC.setEngSize(Double.parseDouble(JOptionPane.showInputDialog("Finally, "
			+ "what about the engine size?")));

		JOptionPane.showMessageDialog(null, "Okay, one more.");
		carD.setMake(JOptionPane.showInputDialog("What make is the car?"));
		carD.setColor(JOptionPane.showInputDialog("What color?"));
		carD.setHrsPwr(Integer.parseInt(JOptionPane.showInputDialog("What is the "
			+ "horsepower?")));
		carD.setEngSize(Double.parseDouble(JOptionPane.showInputDialog("Finally, "
			+ "what about the engine size?")));

		JOptionPane.showMessageDialog(null, "Okay.\n Car 1: " + carA
			+ "\nCar 2: " + carB + "\nCar 3: " + carC + "\nCar 4: " + carD);
		JOptionPane.showMessageDialog(null, "Wow! It looks like we have " 
			+ Car2.getCount() + " cars.");

		if (carA.compare(carD))
		{
			JOptionPane.showMessageDialog(null, "It looks like Car 1 is the "
				+ "same as Car 4!");
		}
		else if (carB.compare(carD))
		{
			JOptionPane.showMessageDialog(null, "It looks like Car 2 is the "
				+ "same as Car 4!");
		}
		else if (carC.compare(carD))
		{
			JOptionPane.showMessageDialog(null, "It looks like Car 3 is the "
				+ "same as Car 4!");
		}
		else
		{ 
			JOptionPane.showMessageDialog(null, "None of these are the same car.");
		}
	}
}
