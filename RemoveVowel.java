/*
Programming Question 
31. Remove all vowels from a string.
32. Count uppercase and lowercase letters separately.
33. Toggle the case of each character.
34. Convert the first character to uppercase.
35. Find the frequency of every character in a string.
36. Reverse each word in a sentence.
37. Reverse the order of words in a sentence.
38. Check whether two strings are anagrams.
39. Find duplicate characters in a string.
40. Find non-repeated characters in a string.
*/
//31. Remove all vowels from a string.
import java.util.Scanner;
public class RemoveVowel
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the string");
String s=xyz.nextLine();
String result=" ";
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(!(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i'||ch=='A'||ch=='E'||ch=='O'||ch=='U'||ch=='I'))
{
result=result+s.charAt(i);
}
}
System.out.println(" Remove all vowels from a string:"+result);
}
}




