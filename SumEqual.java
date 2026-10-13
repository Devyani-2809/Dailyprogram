/*
Example: count subarrays with sum Equal to Target (Fixed window) 
Input:  arr[]={1,2,3,1,2}
target=3   output: 2
*/
import java.util.Scanner;
public class SumEqual
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[5];
System.out.println("enter the Array");
for(int i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
int target=3;
int count=0;
int k=2;
for(int i=0;i<=a.length-k;i++)
{
	int sum=0;
	for(int j=i;j<i+k;j++)
{
	sum=sum+a[j];
}
	if(sum==target)
		count++;
}
System.out.print(count);
}
}