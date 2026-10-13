/*
Example: WAP to  maximum sum of sub array of size k

Input:  [2,1,5,1,3,2]    k=3
Output:  9  =  [ 5,1,3]
*/
import java.util.Scanner;
public class MaxSum
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[6];
System.out.println("enter the Array");
for(int i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
int k=3;
int max=0;
int sum=0;
System.out.print("{ ");
for(int i=0;i<k;i++)
{
	sum=sum+a[i];
	System.out.print(a[i]+" ");
}

System.out.println("} ="+sum);
if(sum>max)
{
	max=sum;
}
	for(int i=k;i<a.length;i++)
	{
	sum=sum+a[i]-a[i-k];
	System.out.print("{ ");
	for(int j=(i-k)+1;j<=(i);j++)
	{
	System.out.print(a[j]+" ");
	}
	System.out.println("} =" +sum);

	if(sum>max)
	{
		max=sum;
	}
	}
	System.out.print("max sum is "+max);
}
}