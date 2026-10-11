//22. Find the smallest character in a string.
import java.util.Scanner;
public class Smallestchar
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();

char smallest=s.charAt(0);
for(int i=1;i<s.length();i++)
{
if(s.charAt(i)<smallest)
{
	smallest=s.charAt(i);
}
}
System.out.println("smallest Character:"+smallest);
}
}