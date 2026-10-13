/*
WAP to create function name as void power(int base,int index): this function accepts two parameters and calculates its power and displays it.
*/
import java.util.Scanner;
public class PowerDis
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the base and index");
int b=xyz.nextInt();
int i=xyz.nextInt();
power(b,i);
}
	public static void power(int base,int index)
	{
		int p=1;
		for(int i=1;i<=index;i++)
		{
			
			p=p*base;
		}
		System.out.println("Power is "+p);
	}
}