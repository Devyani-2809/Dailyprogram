/*
Question 22: Write a Java program to check whether two integer arrays are equal.
Two arrays are considered equal if:
Input:
Array1 = [10, 20, 30, 40]
Array2 = [10, 20, 30, 40]

Output:
Arrays are equal.

Explanation:
First compare the lengths of both arrays and if they are equal then compare elements at each index; 
if all elements match the arrays are equal otherwise they are not.
*/
import java.util.Scanner;
public class EqualArray
{
	public static void main (String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		int arr1[]=new int[4];
		int arr2[]=new int[4];
		System.out.println("enter the array1");
		for(int i=0;i<arr1.length;i++)
		{
		arr1[i]=xyz.nextInt();
		}
		System.out.println("enter the array2");
		for(int i=0;i<arr2.length;i++)
		{
		arr2[i]=xyz.nextInt();
		}
		boolean equal=true;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i;j<arr2.length;j++)
		{
			if(arr1[i]!=arr2[j])
				equal=false;
			break;
		}
		}
		if(equal)
		System.out.println("Array are equal");
	    else
		System.out.println("Array are not equal");	 
		}
		}	