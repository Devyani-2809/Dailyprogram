/*
Question 12: Write a program in java to insert an element at desired position from an array.
Input the size of array : 6

Input 5 elements in the array in ascending order :
1 2 3 4 5

Input the position where to insert : 2
Value : 200

Expected Output : The new list is : 1 2 200 3 4 5
*/
import java.util.Scanner;
public class InsertValue
{
	public static void main (String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("enter the size of array=");
		int s=xyz.nextInt();
		int a[]=new int[s];
		System.out.println("enter the array in ascending order=");
		for(int i=0;i<s-1;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("enter the position where to insert=");
		int d=xyz.nextInt();
		System.out.println("enter the value to insert=");
		int value=xyz.nextInt();
		int index=d;
		for(int i=s-1;i>index;i--)
		{
		a[i]=a[i-1];
		}
		a[index]=value;
		System.out.print("new list is= ");
        for(int i=0;i<s;i++)
		{
		System.out.print(a[i]+" ");
		}
	}
}
