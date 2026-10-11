/*21.	In a Banking System, how would you use constructor overloading to create different types of accounts?
22.	In an Employee Management System, why would you create multiple constructors for the Employee class?
23.	Why do Singleton classes use a private constructor?
24.	Can we call one constructor from another constructor? If yes, how?
25.	What is the order of constructor execution in inheritance?
26.	If both parent and child classes have constructors, which constructor executes first and why?
27.	What happens if a constructor throws an exception?
28.	Can an abstract class have a constructor? Why?
29.	Can an interface have a constructor? Why or why not?
30.	Why are constructors considered important in Object-Oriented Programming and software development?
*/
//21.In a Banking System, how would you use constructor overloading to create different types of accounts?
class Bank
{
long accno;
String name;
double balance;

Bank()
{
long accno=00L;
String name="unknown";
double balance;
}
Bank(long accno,String name)
{
this.accno=accno;
this.name=name;
this.balance=0.0;
}
Bank(long accno,String name,double balance)
{
this.accno=accno;
this.name=name;
this.balance=balance;
}
void display()
{
System.out.println("Account number:"+accno);
System.out.println("Name:"+name);
System.out.println("Balance:"+balance);
}
}
public class BankingSystem
{
public static void main(String[] args)
{
Bank b1=new Bank();
Bank b2=new Bank(865433556554L,"Mansi");
Bank b3=new Bank(646533556554L,"Devyani",55446);
b1.display();
System.out.println();
b2.display();
System.out.println();
b3.display();
}
}