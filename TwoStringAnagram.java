//38. Check whether two strings are anagrams.
import java.util.Scanner;
import java.util.Arrays;
public class TwoStringAnagram
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String1");
String s1=xyz.nextLine();
System.out.println("enter the String2");
String s2=xyz.nextLine();

if(s1.length()!=s2.length())
{
System.out.println("strings arenot anagrams");
return;
}
char[] a=s1.toCharArray();
char[] b=s2.toCharArray();
Arrays.sort(a);
Arrays.sort(b);
if(Arrays.equals(a,b))
{
	System.out.println("Strings are anagrams");
}
else
{
	System.out.println("Strings arenot  anagrams");
}
}
}