/*
71. Implement your own version of `String.equals()`.
72. Implement your own version of `String.compareTo()`.
73. Implement your own version of `String.indexOf()`.
74. Implement your own version of `String.substring()`.
75. Implement string compression (Example: aaabbcc → a3b2c2).
76. Decompress a compressed string.
77. Implement Run Length Encoding (RLE).
78. Find all permutations of a string.
79. Find all combinations of characters in a string.
80. Find all subsequences of a string.
*/
//71. Implement your own version of `String.equals()`.
import java.util.Scanner;
public class EqualString
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the String1");
String s1=xyz.nextLine();
System.out.println("enter the String2");
String s2=xyz.nextLine();
boolean flag=true;
if(s1.length()!=s2.length())
{
System.out.println("Not Equal");
}
else{
	
for(int i=0;i<s1.length();i++)
{
  if(s1.charAt(i)!=s2.charAt(i))
  {
  flag =false;
  break;
  }
  }
  if(flag)
  {
  System.out.println("Strings are Equal");
  }
  else
  {
   System.out.println("Strings are not Equal");
   }
   }
   }
}