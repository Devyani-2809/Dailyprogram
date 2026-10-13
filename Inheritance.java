/*
2.	Write a Java program to demonstrate Inheritance using the extends keyword. Create a Parent class with a method display() and a Child class that inherits and calls the method. 
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
	void show()
	{
		System.out.println("Show Method");
	}
}
public class Inheritance
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.display();
		c.show();
	}
}

	
