/*
Selection sort
*/
import java.util.Scanner;
public class SelectionSort2
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
System.out.print("Before sorting=");
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}
System.out.println();
System.out.print("After sorting=");
for(int i=0;i<a.length;i++)
{
	int mi=i;
	for(int j=(i+1);j<a.length;j++)
{
	if(a[j]<a[mi])
	{
		mi=j;
	}
	int temp=a[mi];
	a[mi]=a[i];
	a[i]=temp;
}
System.out.print(a[i]+" ");
}
}
}