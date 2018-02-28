class MakeCar
{
	public static void main(String[] args)
	{
		Design c1=new Design("Audi");
		c1.accelerate();
		c1.accelerate();
		c1.Display();
		c1.park();
		c1.Display();
	}
}

class Design
{
	String name;
	int speed;

	Design(String n)
	{
		name=n;
	
	}

	public void accelerate()
	{
		speed +=10;
	}

	public void park()
	{
		speed=0;
	}

	public void Display()
	{
		System.out.println("the current speed of: " + name + " is " + speed);
	}
}
