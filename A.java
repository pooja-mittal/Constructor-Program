//answer of this http://java.meritcampus.com/quiz_attempts/167185?cqid=1
// all statements wll print 

public class A
{
	public A()
	{
		System.out.println("defualt constructor");
	}

	public A(int i)
	{
		this();
		System.out.println("single parameter constructor: " + i);
	}

	public A(int i, int j)
	{
		this(j);
		System.out.println("double constructor" + i + " " +j);
	}
	public static void main(String[] args)
	{
		A ch=new A(0,2);
	}
}




