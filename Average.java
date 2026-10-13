/*
Question 16: Write a Java program to calculate the average of all elements present in an integer array.
Input Array:
[10, 20, 30, 40, 50]
Output:
Average of array elements = 30Explanation
? The average of array elements is calculated by:
Average=Sum of all elementsNumber of elements\text{Average} = \frac{\text{Sum of all elements}}{\text{Number of elements}}Average=Number of elementsSum of all elements
? First, iterate through the array and add all elements to a variable sum.
? Then divide sum by the total number of elements (array.length) to get the average.
*/
import java.util.Scanner;
public class Average
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
		int sum=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
		sum=sum+a[i];
		count++;
		}
		int avg=sum/count;
		System.out.println("Average of array elements= "+avg);
	}
}
