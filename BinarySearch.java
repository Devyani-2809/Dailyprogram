//Binary Search
import java.util.Scanner;
public class BinarySearch
{
public static void main (String[] args)
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
int mid=0;
int index=-1;
int l=0;
int r=(a.length-1);
while(l<=r)
{
	mid=l+(r/2);
}
if(a[mid]==skey)
{
  index=mid;
 break;
}
if(a[mid]<skey)
{
	l=mid+1;
}
else
{
	r=mid-1;
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