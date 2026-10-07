/*
61. Count all palindromic substrings.
62. Find the number of occurrences of a substring.
63. Replace all occurrences of one substring with another.
64. Check whether a string starts with a given prefix.
65. Check whether a string ends with a given suffix.
66. Find the common prefix of two strings.
67. Find the longest common prefix among multiple strings.
68. Convert a sentence into camelCase.
69. Convert camelCase into a normal sentence.
70. Convert a sentence into snake_case.
*/
//61. Count all palindromic substrings.
import java.util.Scanner;
public class PalindromicSubString
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String");
String s=xyz.nextLine();
int count=0;
for(int i=0;i<s.length();i++)
{
for(int j=i;j<s.length();j++)
{
	String sub="";
	for(int k=i;k<=j;k++)
	{
		sub=sub+s.charAt(k);
	}
	boolean palindrome=true;
	int start=0;
	int end=sub.length()-1;
	
	while(start<end)
	{
		if(sub.charAt(start)!=sub.charAt(end))
		{
			palindrome=false;
			break;
		}
		start++;
		end--;
	}
	if(palindrome)
	{
		System.out.println(sub);
		count++;
	}
}
}
System.out.println("Total Palindrome Sub String:"+count);
}
}
