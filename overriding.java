/*
6.	Write a Java program to demonstrate Method Overriding where a child class provides its own implementation of a method defined in the parent class. 
*/
class Parent
{
	void display()
	{
		System.out.println("Method Display");
	}
}
class Child extends Parent
{
	@Override
   void display()
   {
	  System.out.println("chlid display method"); 
   }
	
}
public class Overriding
{
	public static void main(String[] args)
	{
	   Parent p=new Child();
		p.display();
	}
}

	
