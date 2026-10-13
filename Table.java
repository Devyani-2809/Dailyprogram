/*
WAP to create function name as void table(int no) and input number from keyboard and print its table 
*/
import java.util.Scanner;
public class Table
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
System.out.println("enter the value of keyborad");
int value=xyz.nextInt();
table(value);
 }
public static void table(int no)
{
for(int i=1;i<=10;i++)
{
System.out.println(i+"X"+no+"="+(i*no));
}
}
}