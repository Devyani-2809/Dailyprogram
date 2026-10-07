public class Singledigit
{
public static void main(String[] args)
{
int n=78565;
 while(n>10)
 {
	 int sum=0;
	 while(n>0)
	 {	 
 int digit=n%10;
 sum=sum+digit;
 n=n/10;
 }
 n=sum;
}
System.out.println("Sum="+n);
  if(n%2==0)
  {
	  System.out.println("Even");
  }
  else
  {
	System.out.println("odd");  
 }
}
}