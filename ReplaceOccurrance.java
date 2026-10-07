//63. Replace all occurrences of one substring with another.
import java.util.Scanner;
public class ReplaceOccurrance
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
System.out.println("enter the old string");
String oldstring=xyz.nextLine();
System.out.println("enter the new string");
String newstring=xyz.nextLine();
String result=s.replace(oldstring,newstring);
System.out.println("After Replacement:"+result);
}
}