/**
*Creates the class Person, with attributes of name and age
*/

public class Person
{
	/**Declare attributes*/
	private String name;
	private int age;

	/**Constructor of Person, default */
	public Person()
	{
		name = "Jane Doe";
		age = 27;
	}
	/**Constructor for person with initial values*/
	public Person(String inName, int inAge)
	{
		name = inName;
		age = inAge;
	}	

	/**Get accessors for attributes name and age*/
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	/**Mutator for changing name and age*/
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	/**Method for quick calling of person information*/
	public String toString()
	{
		return this.name + ", " + this.age;
	}
}
