/*
Question 14: Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.
*/
import java.util.Scanner;
public class UniqueElement
{
	public static void main (String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[7];
		System.out.println("enter the array=");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			 int count=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j])
			{	
		     count++;
			 break;
			}
		}
		if(count==1)
		{
		System.out.println(a[i]+" ");
		}
		}
		}
}
