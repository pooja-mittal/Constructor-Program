public class RoomFan
{
	public static void main(String[] args)
	{
		Room r =new Room();
		Fan f=new Fan();
		r.name="hall";
		r.width=r.height=12;
		f.speed=1500;
		r.f2.Colour = "brown";
		r.f2.numOfWings=3;
		System.out.println(r.name + " " + r.height + "  " + r.width);
		System.out.println(r.f2.speed + " " + r.f2.colour + " " +  r.f2.numOfWings);
	}
}

class Room 
{
	String name;
	int width, height;
	Fan f2=new Fan();
}

class Fan
{
	double speed;
	String colour;
	int numOfWings;
}
