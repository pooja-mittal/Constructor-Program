class Student
{
	String name;
	int roll;
	Address d;

	Student(String n, int r, Address d1)
	{
		name=n;
		roll=r;
		d=d1;
	}
	
	public void display();
	{
		System.out.println(name +  " " + roll + "  " + d);
	}

}

class Address
{
	String city;
	String state; 
	String country;

	Address(String city, String state, String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
}
}

class Temp1
{
	public static void main(String[] args)
	{	
		Student s1=new Student("pooja", 3, "jind", "haryana" , "india");
		s1.display();
	}
}

