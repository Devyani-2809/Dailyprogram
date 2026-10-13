/*
Question 23: Write a Java program to find the Majority Element of an array.
A majority element in an array of size n is an element that appears more than n/2 times. 
There can be at most one majority element in the array.
Input:
Array = [4, 8, 4, 6, 7, 4, 4, 8]

Output:
Majority Element = 4

Explanation:
Count the occurrences of every element using nested traversal and if any 
element appears more than n/2 times it is the majority element.
*/
import java.util.Scanner;
public class MajorityElement
{
	public static void main (String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[8];
		System.out.println("enter the array=");
		for(int i=0;i<a.length;i++)
		{
		a[i]=xyz.nextInt();
		}
		int n=a.length;
		boolean found=false;
		for(int i=0;i<n && !found;i++)
		{
			int count=0;
		for(int j=0;j<n;j++)
		{
			if(a[i]==a[j])
			{
			count++;
			}
		}
		if(count>=n/2)
		{
		System.out.println("Majority Element = "+a[i]);
		found=true;
		break;
		}
		}
		if(!found)
		{
            System.out.println("No Majority Element");
		}
	}
	}
	