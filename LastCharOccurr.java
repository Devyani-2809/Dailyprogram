/*
13. Find the last occurrence of a character.
*/
import java.util.Scanner;
public class LastCharOccurr
{
public static void main (String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();

/*System.out.println("enter the character");
char ch=xyz.next().charAt(0);*/
int count=0;
for(int i=s.length()-1;i>=0;i--)
{
if(s.charAt(i)==s.charAt(0))
{
count++;
}
}
System.out.println("the occurrences of particular :"+count);
}
}