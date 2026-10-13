/*
Question 1: Write a Java program to input an array & display it.
Input:
Array Size = 5
Array Elements = 10 20 30 40 50
Output:
10 20 30 40 50
Explanation:
? First, we take the size of the array from the user.
? Then, elements are entered one by one into the array.
? Finally, using a loop, we display all elements in the same order they were entered.
*/
import java.util.Scanner;
public class DisplayArray
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
System.out.print("print the Array=");
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
}
}