//53. Check whether a string is a pangram.
import java.util.Scanner;
public class Pangram
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine().toLowerCase();
boolean pangram=true;
for(char ch='a';ch<='z';ch++)
{
boolean found=false;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==ch)	
{
	found=true;
	break;
}
}
if(!found)
{
	pangram=false;
	break;
}
}
System.out.println(pangram?"pangram":"not pangram");
}
}