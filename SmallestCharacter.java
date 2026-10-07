//22. Find the smallest character in a string.
import java.util.Scanner;
public class SmallestCharacter
{
		public static void main(String[] args)
		{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
char smallest=s.charAt(0);
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)<smallest)
{
smallest=s.charAt(i);
}
}
System.out.println("smallest character in a string:"+smallest);
}
}