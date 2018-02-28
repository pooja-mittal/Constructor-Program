class Bank
{
	String name;
	Bank(String name)
	{
		this.name=name;
	}

	public String display()
	{
		return (this.name);
	}
}

class Employee
{
	String name;
	Employee(String name)
	{
		this.name=name;
	}

	 String Display()
	{
		return (this.name);
	}
}

class Temp3
{
	public static void main(String[] name)
	{
		Bank b1=new Bank("Axis");
		Employee e1=new Employee("Neha");
		System.out.println(e1.Display() + " is employee of " + b1.display()+ " bank " );
	}
}
