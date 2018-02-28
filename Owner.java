class Car
{
	static int regnum;
	private static int num=1000;

	Car()
	{
		regnum=num++;
		System.out.println("car is created with registration number " + regnum);
	}

	 public void start()
	{
		System.out.println(regnum + " car has started");
	}

	public void accelerate()
	{
		System.out.println(regnum + " car has accelerate");
	}

	public void stop()
	{
		System.out.println(regnum + " car has stopped");
	}
}

class Driver
{
	String name;

	Driver(String name)
	{
		this.name=name;
		System.out.println("Driver " + this.name + " is hired");
	}

	void Drive(Car c)
	{
		c.start();
		c.accelerate();
		c.stop();
		return;
	}
}

class TestCar
{
	public static void main(String[] args)
	{
		Car c1=new Car();
		Driver d1=new Driver("Ram");
		d1.Drive(c1);
		Car c2=new Car();
		d1.Drive(c2);

	}
}




	