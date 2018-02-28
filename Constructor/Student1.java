class Student1
{
	String name;
	int num;
	Student1()
	{
		System.out.println("hello 1");
	}

	Student1(String n)
	{
		name=n;
		System.out.println("Student name is " + name);
	}

	Student1(String n, int r)
	{
		name=n;
		num=r;
		System.out.println("Student name is " + name + " " + num);
	}
}

class Test
{
	public static void main(String[] args)
	{
		Student1 s1=new Student1();
		Student1 s2=new Student1("Mr reddy");
		Student1 s3=new Student1("Mr Raju", 56);
	}
}
