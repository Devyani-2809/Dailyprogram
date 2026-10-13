/*
3.	Write a Java program to demonstrate Method Overriding and Runtime Polymorphism using a parent class Animal and child classes Dog and Cat. 
*/
class Animal
{
	void bark()
	{
		System.out.println("Animal is Barking");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
class Cat extends Animal
{
	void bark()
	{
		System.out.println("cat is barking");
	}
}
public class Polymorphism
{
	public static void main(String[] args)
	{
    Animal a;
	a=new Dog();
	a.bark();
	a=new Cat();
	a.bark();
	}
}