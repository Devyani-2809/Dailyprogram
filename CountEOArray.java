/*
Question 5: Write a Java program to count even & odd values from an array.
Input:
Array Size = 7
Array Elements = 12 17 24 39 40 55 70
Output:
Count of Even Values = 4
Count of Odd Values = 3
Explanation:
? Initialize counters: evenCount = 0, oddCount = 0.
? For each element in the array:

? If divisible by 2 ? increase evenCount.
? Otherwise ? increase oddCount.

? Final counts are displayed.
*/
import java.util.Scanner;
public class CountEOArray
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.print("enter the Array Size= ");
int s=xyz.nextInt();
int a[]=new int[s];
System.out.print("enter the Array= ");
for(int i=0;i<a.length;i++)
{
a[i]=xyz.nextInt();
}
int evencount=0;
int oddcount=0;
System.out.print("Count of Even Values =");
for(int i=0;i<a.length;i++)
{
if(a[i]%2==0)
evencount++;
}
System.out.println(evencount);

System.out.print("Count of odd Values =");
for(int i=0;i<a.length;i++)
{
if(a[i]%2!=0)
oddcount++;
}
System.out.println(oddcount);
}
}