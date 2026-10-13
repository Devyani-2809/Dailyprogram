//75. Implement string compression (Example: aaabbcc → a3b2c2).
import java.util.Scanner;
public class Compression
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
String result="";
for(int i=0;i<s.length();i++)
{
int count=1;
while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
{
count++;
i++;
}
result=result+s.charAt(i)+count;
}
System.out.println(result);
}
}