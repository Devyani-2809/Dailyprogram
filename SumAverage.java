/*
Example: WAP to find the average of all subarray of size k
k=3
*/
public class SumAverage
{
public static void main(String[] args)
{
int a[]=new int[]{2,1,5,1,3,2};
int sum=0;
int k=3;
for(int i=0;i<k;i++)
{
  sum=sum+a[i];
}
System.out.println((double)sum/k);
for(int i=k;i<a.length;i++)
{
	sum=sum+a[i]-a[i-k];
System.out.println((double)sum/k);
}
}
}