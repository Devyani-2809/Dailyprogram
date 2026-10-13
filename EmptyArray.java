/*
Question 18: Write a Java program to check whether a given array is empty or not.
Input :- Array elements: { } Explanation
1. Every array has a predefined property called length.
2. If array.length == 0, then the array is empty.
3. Otherwise, the array contains elements.
Output :- Array is empty
*/
import java.util.Scanner;
public class EmptyArray
{
	public static void main (String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[0];
		if(a.length==0)
		{
		System.out.println("empty");
		}
		else
		{
		System.out.println("not empty");
		}
		}
		}