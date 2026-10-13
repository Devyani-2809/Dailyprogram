/*
Linear search
*/
import java.util.Scanner;
public class LinearSearch
{
public static void main (String [] args)
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[10];
System.out.println("enter the Array");
for(int i=0;i<a.length;i++)
{
	a[i]=xyz.nextInt();
}
System.out.println("enter the Search key");
int skey=xyz.nextInt();
int index=-1;
for(int i=0;i<a.length;i++)
{
	if(a[i]==skey)
	{
		index=i;
		break;
	}
}
	if(index!=-1)
	{
		System.out.println("found");
	}
	else
	{
		System.out.println("not found");
	}
}
}