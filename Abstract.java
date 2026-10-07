/*
5.	Write a Java program using an Abstract class. Create an abstract class Shape with an abstract method area(), and implement it in a Circle class. 
*/
abstract class Shape
{
	abstract void area();
}
class Circle extends Shape
{
	double radius=2;
	void area()
	{
	double area=3.14*radius*radius;
    System.out.println("Area:"+area);
	}
}
public class Abstract
{
	public static void main(String[] args)
	{
		Shape s=new Circle();
		s.area();
	}
}
	