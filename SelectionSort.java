/*
Selection sort
*/
import java.util.Scanner;
public class SelectionSort
{
public static void main (String [] args)
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[5];
System.out.println("enter the Array");
for(int i=0;i<a.length;i++)
{
	a[i]=xyz.nextInt();
}
System.out.print("before sort=");
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
System.out.print("after sort=");
for(int i=0;i<a.length;i++)
{
	for(int j=(i+1);j<a.length;j++)
	{
		if(a[i]>a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}

System.out.print(a[i]+" ");
}
}
}