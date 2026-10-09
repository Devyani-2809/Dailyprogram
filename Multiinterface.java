/*
7.	Write a Java program to demonstrate Multiple Inheritance using Interfaces. Create two interfaces Printable and Showable and implement both in a single class. 
*/
interface Printable
{
void print();
}
interface Showable
{
void show();
}
class Demo implements Printable,Showable
{
	public void print()
	{
	System.out.println("Print Method");	
	}
	public void show()
	{
	System.out.println("show Method");		
	}
}
public class Multiinterface
{
	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.print();
		d.show();
	}
}
