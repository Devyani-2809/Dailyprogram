/*
How to display the data from circular queue
*/
import java.util.Scanner;
public class CirQueue
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(System.in);
int front=-1,rear=-1,size=0;
 int q[]=new int[5];
 int value=0;
 do{
 System.out.println("1.Insert");
 System.out.println("2.Delete");
 System.out.println("3.Display");
 System.out.println("4.Exit");
 System.out.println("enter your choice");
 int choice=xyz.nextInt();
 switch(choice)
 {
 case 1:
   if(size==(q.length))
   {
	   System.out.println("Queue is full");
	   break;
   }
   if(front==-1)
   {
	   front=0;
   }
System.out.println("enter the Data in queue");
value=xyz.nextInt();
rear=(rear+1)%q.length;
 q[rear]=value;
 size++;
 System.out.println("Data inserted successfully");
 break;
 case 2:
 if(size==0)
 {
	 System.out.println("Queue is empty");
 }
 else
 {
 value=q[front];
 front=(front+1)%q.length;
 System.out.println("Deleted value is"+value);
 size--;
 }
 break;
 case 3:
 if(size==0)
 {
	System.out.println("queue is empty");
 }
 int i=front;
 do
 {
	System.out.println(q[i]);
	if(i==rear)
	{
		break;
 }	
 i=(i+1)%q.length;
 }
 while(true);
 break;
 case 4:
 System.exit(0);
 break;
 default: System.out.println("wrong choice");
 }
 }
 while(true);
}
}