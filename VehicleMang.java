class Vehicle
{
  void calculateFuelConsumption()
  {
	System.out.println("General vehicle fuel consumption");
  }
}
class Cars extends Vehicle
{
	void calculateFuelConsumption()
	{
	System.out.println("cars have 15km/l");	
	}
}
class  Bikes extends Vehicle
{
	void calculateFuelConsumption()
	{
	System.out.println("Bikes have 20km/l");	
	}
}
class Trucks extends Vehicle
{
	void calculateFuelConsumption()
	{
	System.out.println("Trucks have 10km/l");	
	}
}
public class VehicleMang
{
	public static void main(String[] args)
	{
		Vehicle v;
		v=new Cars();
		v.calculateFuelConsumption();
	    v=new Bikes();
		v.calculateFuelConsumption();
		v=new Trucks();
		v.calculateFuelConsumption();
	}
}