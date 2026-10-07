/*
21. Find the largest character in a string.
22. Find the smallest character in a string.
23. Check whether a string contains only digits.
24. Check whether a string contains only alphabets.
25. Check whether a string contains only uppercase letters.
26. Check whether a string contains only lowercase letters.
27. Print characters at even indexes.
28. Print characters at odd indexes.
29. Remove all digits from a string.
30. Remove all special characters from a string.
*/
//21. Find the largest character in a string.
import java.util.Scanner;
public class Largestchar
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();

char largest=s.charAt(0);
for(int i=1;i<s.length();i++)
{
if(s.charAt(i)>largest)
{
	largest=s.charAt(i);
}
}
System.out.println("largest Character:"+largest);
}
}