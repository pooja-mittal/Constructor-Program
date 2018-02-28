class Create
{
	int roll;
	String name;
	Create(int r, String n)
	{
		roll=r;
		name=n;
	}

	Create(Create r)
	{
		roll=r.roll;
		name=r.name;
	}

	void Display()
	{
		System.out.println("name and roll no are: " + name + " " + roll);
	} 
}

class Student
{
	public static void main(String[] args)
	{
		Create s1=new Create(1, "Ram");
		Create s2=new Create(s1);
		s1.Display();
		s2.Display();
	}
}


