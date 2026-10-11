/*
Scenario 
1. Vehicle Management System
Scenario:
A transportation company manages Cars, Bikes, and Trucks. Every vehicle has a different way of calculating fuel consumption.
Question:
How would you design a calculateFuelConsumption() method using polymorphism?
*/
class Vehicle
{
void calculateFuelConsumption()
{
System.out.println("vehicle fuel consumption");
}
}
class Cars extends Vehicle
{
void calculateFuelConsumption()
{
System.out.println("Car fuel consumption:30km/l");
}
}
class Bikes extends Vehicle
{
	void calculateFuelConsumption()
{
System.out.println("Bikes fuel consumption:60km/l");
}
}
class Trucks extends Vehicle
{
	void calculateFuelConsumption()
{
System.out.println("Bikes fuel consumption:20km/l");
}
}
public class VehicleManagement
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