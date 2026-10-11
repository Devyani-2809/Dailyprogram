//62. Find the number of occurrences of a substring.
import java.util.Scanner;
public class OccurrenceSubString
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
System.out.println("enter the SubString");
String sub=xyz.nextLine();
int count=0;
for(int i=0;i<=s.length()-sub.length();i++)
{
if(sub.equals(s.substring(i,i+sub.length())))
{
	count++;
}
}
System.out.println("Occurrence:"+count);
}
}