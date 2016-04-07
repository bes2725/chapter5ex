public class Person
{
	//valid only inside person class
	private String name;
	private int age;
	//Constructors
	public Person()
	{
		name = "Jane Doe";
		age = 27;
	}
	public Person(String inName, int inAge)
	{
		name = inName;
		age = inAge;
	}	

	//getters/assesors method
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	//setters/mutator
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}

	public String toString()
	{
		return this.name + " " + this.age;
	}
}
