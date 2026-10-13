//16. Find the ASCII value of each character.
import java.util.Scanner;
public class AsciiValue
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
for(int i=0;i<s.length();i++)
{
  System.out.println(s.charAt(i)+"="+(int)s.charAt(i));
}
}
}