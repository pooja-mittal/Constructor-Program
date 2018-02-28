class Box
{
	int length, height, breath;
	Box()
	{
	}

	Box(int l, int b, int h)
	{
		length=l;
		height=h;
		breath=b;
	}

	Box(int i)
	{
		length=breath=height=i;
	}

	public void Display()
	{
		System.out.println("[ " + length + " " + breath + " " + height + "]");
	}
}

class TestBox
	{
		public static void main(String[] args)
			{
				Box b1=new Box();
				Box b2=new Box(5,10,3);
				Box b3=new Box(4);
				b1.Display();
				b2.Display();
				b3.Display();
			}
	}

				