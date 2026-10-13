/*
Question 17: Write a Java program to count the number of even and odd elements present in a given integer array.
Input :- Array = { 10, 15, 20, 25, 30 }
Output :- Even count = 3
Odd count = 2 Explanation
? An even number is a number that is completely divisible by 2.
? An odd number is a number that is not divisible by 2.
? Traverse the array using a loop.
*/
import java.util.Scanner;
public class EvenOddCount
{
	public static void main (String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter the array=");
		for(int i=0;i<a.length;i++)
		{
		a[i]=xyz.nextInt();
		}
		int Ecount=0;
		int Ocount=0;
		System.out.print("Even count= ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
		Ecount++;}}
				System.out.print(Ecount+" ");
				
				System.out.println();
				
		System.out.print("Odd count= ");
			for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
		Ocount++;}}
				System.out.print(Ocount+" ");
		}
		}