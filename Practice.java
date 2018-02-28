class Practice
{
	int a,b;
	Practice()
	{
		a=10;
		b=20;
	}

	Practice(int a)
	{
		this.a=this.b=a;
	}

	Practice(int a, int b)
	{
		this.a=a;
		this.b=b;
	}

	public void display()
	{
		System.out.println(a + "  " + b);
	}
}

class Test4
{


	public static void main(String[] args)
	{
		Practice t1=new Practice();
		Practice t2=new Practice(5);
		Practice t3=new Practice(6,7);
		t1.display();
		t2.display();
		t3.display();
	}
}
	