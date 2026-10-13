/*
Question 13: Write a java program to display only non-zero values from an array.
Input : Array = {1, 0, 5, 0, 7, 0, 9}
Output : Non-zero elements = {1, 5, 7, 9}
Explanation :
Traverse the array and print only elements that are not equal to zero.

Asked In Companies:
*/
import java.util.Scanner;
public class NonZeroElement
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
		System.out.print("Non Zero elements=");
		for(int i=0;i<a.length;i++)
		{
		if(a[i]!=0)
		{
		System.out.print(a[i]+" ");
		}
		}
		}
		}