class ParentClass
{
	int num=100;
}

class Base extends ParentClass
{
	int num=50;

	void Display()
	{
		System.out.println("base " + num);
		System.out.println(super.num);
	}
	public static void main(String[] args)
	{
		Base b=new Base();
		b.Display();
	}
}
