//74. Implement your own version of `String.substring()`.
import java.util.Scanner;
public class SubStringIndex
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
System.out.println("enter the start index");
int start=xyz.nextInt();
System.out.println("enter the end index");
int end=xyz.nextInt();
String result="";
for(int i=start;i<end;i++)
{
result=result+s.charAt(i);
}
System.out.println("new String is:"+result);
}
}