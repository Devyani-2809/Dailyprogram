/*
Stack Operation
*/
import java.util.Scanner;
public class StackOperation
{
public static void main (String [] args)
{
Scanner xyz=new Scanner(System.in);
int s[]=new int[4];
int top=-1;
do{
	System.out.println("1.enter the for push");
	System.out.println("2.enter the for pop");
	System.out.println("3.enter the for Display");
	System.out.println("4.Exit");
System.out.println("enter your choice");
int ch=xyz.nextInt();
switch(ch)
{
	case 1:
	
	if(top==s.length-1)
	{
		System.out.println("stack is overflow");
	}
	else{
	top=top+1;
	System.out.println("enter the Value");
	int value=xyz.nextInt();
	s[top]=value;
	}
break;
    case 2:
	if(top==-1)
	{
		System.out.println("~Stack is underflow~");
	}
	else
	{
		int value=s[top];
		System.out.println("Deleteed value="+value);
		top=top-1;
	}
	break;
	case 3:
	if(top==-1)
	{
		System.out.println("~Stack is underflow~");
	}
	else
	{
		System.out.println("diplay the stack");
	for(int i=top;i>=0;i--)
	{
		System.out.println(s[i]);
	
	}
	}
	break;
	case 4:
    System.exit(0);
	default:
	System.out.println("Wrong choice");
}
}
while(true);
}
}