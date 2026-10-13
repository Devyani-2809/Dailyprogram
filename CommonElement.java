/*
Question 15: Write a java program to find common elements between two arrays.
Input :
Array1 = {1, 2, 3, 4, 5}
Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation :
Compare each element of Array1 with all elements of Array2, if match found ? it is a common element.
*/
import java.util.Scanner;
public class CommonElement
{
	public static void main (String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("enter the array1");
		for(int i=0;i<a.length;i++)
		{
		a[i]=xyz.nextInt();
		}
		System.out.println("enter the array2");
		for(int i=0;i<b.length;i++)
		{
		b[i]=xyz.nextInt();
		}
		System.out.println("common element");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
		{
		if(a[i]==b[j])
		
			System.out.println(a[i]);
		}
		}
		}
}