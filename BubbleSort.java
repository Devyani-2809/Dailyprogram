/*
Bubble sort
*/
import java.util.Scanner;
public class BubbleSort
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
System.out.print("After sorting=");
for(int i=0;i<(a.length-1);i++)
{
	for(int j=0;j<(a.length-i-1);j++)
{
if(a[j]>a[j+1])
{
	int temp=a[j];
    a[j]=a[j+1];
    a[j+1]=temp;
}
}
}
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
}
}
