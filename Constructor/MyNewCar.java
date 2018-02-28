public class Car
{
private int yearModel; // The car's year model
private String make; // The car's make
private int speed; // The current speed
Car(int year, String carMake, int newSpeed)
{
yearModel = year;
make = carMake;
speed = newSpeed;
}
public void setYearModel(int y)
{
yearModel = y;
}
public void setMake(String m)
{
make = m;
}
public void setSpeed(int s)
{
speed = s;
}
public int getYearModel()
{
return yearModel;
}
public String getMake()
{
return make;
}
public int getSpeed()
{
return speed;
}
public void accelerate()
{
speed += 5;
}
public void brake()
{
speed -= 5;
}
}

[/import javax.swing.JOptionPane;
public class MyNewCar {
     public static void main(String[] args) {
         Car myCar = new Car (2010, "Honda");
        int speed = myCar.getSpeed();
        speed = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Speed" ));
        for (int i = 0; i < 5; i++)
        {
          System.out.println("The" + " " + myCar.getYearModel() + " " + myCar.getMake() +
                   " " + "is going " );
           myCar.AccelerateSpeed(speed);
           System.out.println("Your Speed now is: " + speed);
        }
        speed = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Speed" ));
        for (int i = 0; i < 5; i++)
        {
          System.out.println("The" + " " + myCar.getYearModel() + " " + myCar.getMake() +
                   " " + "is going " );
           myCar.BrakeSpeed(speed);
           System.out.println("Your Speed now is: " + speed);
        }
    }
}
