/*
Question 10: Write a program in java to delete an element at desired position from an array.
Input the size of array : 5

Input 5 elements in the array in ascending order :
1 2 3 4 5

Input the position where to delete : 3

Expected Output : The new list is : 1 2 3 5
*/
import java.util.Scanner;
public class DeleteIndex
{
	public static void main (String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("enter the size of array=");
		int s=xyz.nextInt();
		int a[]=new int[s];
		System.out.println("enter the array in ascending order=");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("enter the position where to delete=");
		int d=xyz.nextInt();
		int index=d;
		for(int i=index;i<s-1;i++)
		{
		a[i]=a[i+1];
		}
		System.out.print("The new list is="); 
		for(int i=0;i<s-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
