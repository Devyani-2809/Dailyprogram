/*
8.	Write a Java program to demonstrate Data Hiding using the private access modifier. Create a BankAccount class with a private balance and methods to deposit and display the balance. 
*/
class BankAccount
{
private int balance=80000;
 void deposite()
 {
 balance=balance+5000;
 }
 void display()
 {
	  System.out.println("balance:"+balance);
 }
}
public class Datahiding
{
	public static void main(String[] args)
	{
		BankAccount b=new BankAccount();
		b.deposite();
		b.display();
	}
}