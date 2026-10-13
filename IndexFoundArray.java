/*
Question 6: Write a java program to search an element in an array , its element found or not.
Input:
Array = {10, 20, 30, 40, 50}
Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".
*/
import java.util.Scanner;
public class IndexFoundArray
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
System.out.print("Element to search = ");
int s=xyz.nextInt();
for(int i=0;i<a.length;i++)
{
if(a[i]==s)
 System.out.println("element "+a[i] + " found at index= "+i);
 }
 }
 }