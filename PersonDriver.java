/**import scanner*/
import java.util.Scanner;

/**This class allows for the setting of information of a new person, and will compare those
*objects*/
public class PersonDriver
{
	public static void main(String[] args)
	{
		Person person1 = new Person();
		Person person2 = new Person();

		Scanner in = new Scanner(System.in);

		System.out.println("What is your name?");
		person2.setName(in.next());
		System.out.println("What is your age?");
		person2.setAge(in.nextInt());

		System.out.println(person1.getName() + ", " + person1.getAge());
		System.out.println(person2.getName() + ", " + person2.getAge());

		if (compare(person1, person2) == true)
		{
			System.out.println(person2.getName() + " you are already in our "
				+ "system");
		}
		else
		{
			System.out.println(person2.getName() + " you are not in our systems."
				+ " Would you like to create an account?");
		}
		
		System.out.println(person2.getName() + ", I'd like you to meet " +
			person1.getName() + ".");

		if((person1.getName()).equals(person2.getName()))
		{
			System.out.println("Wow, you guys have the same name!");
		}
		if(person1.getAge() == person2.getAge())
		{
			System.out.println("Wow, you are the same age!");
		}
		else if (person1.getAge() > person2.getAge())
		{
			System.out.println("It looks like " + person1.getName() 
				+ " is older!");
			if (person2.getAge() < person1.getAge())
			{
				System.out.println("Sorry, " + person2.getName() + 
					". It looks like you are the baby here.");
			}
		}
		else if (person2.getAge() > person1.getAge())
		{
			System.out.println("It looks like " + person2.getName()
				+ " is older!");
			if (person1.getAge() < person2.getAge())
			{
				System.out.println("Sorry, " + person1.getAge() +
					". It looks like you are the baby here.");
			}
		}
	}
	/**This method is to quickly compare all the attributes of person1 to person2*/
        public static boolean compare(Person personA, Person personB) 
	{
		if ((personA.getName()).equals(personB.getName()) && ((personA.getAge()) ==
			(personB.getAge())))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
		

		
