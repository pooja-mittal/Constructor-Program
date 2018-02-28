class box
{
	double width, height, length;
	box(double w, double h, double l)
	{
		width=w;
		height=h;
		length=l;
	}

	public double calVolume()
	{
		double volume=length*width*height;
		System.out.println("volume " + volume);
		return volume;
	}
}

class Test1
{
	public static void main(String[] args)
	{
		box b1=new box(5,10,15);
		box b2=new box(10,20,30);
		b1.calVolume();
		b2.calVolume();
	}
}