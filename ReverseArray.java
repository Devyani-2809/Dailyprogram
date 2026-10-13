/*
Question 7: Write a java program to display the reverse array.
Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.
*/
import java.util.Scanner;
public class ReverseArray
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
int a[]=new int[5];
System.out.print("enter the Array= ");
for(int i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
int n=a.length-1;
System.out.print("Reverse array= ");
for(int i=n;i>=0;i--)
{
System.out.print(a[i]+" ");
}
}
}