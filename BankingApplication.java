/*
2.	Banking Application
In an online banking system, customers can transfer money using an account number, mobile number, or UPI ID. How would you design a transferMoney() method using function overloading to handle these different ways of transferring money?
Scenario: A banking application allows money transfers through different methods.
Case 1: The customer transfers money using the  beneficiary account number.
Case 2: The customer transfers money using a registered mobile number.
Case 3: The customer transfers money using a **UPI ID**.
*/
class Bank
{
void TransferMoney(long accountno,double amt)
{
	System.out.println("transfers money using the  beneficiary account number:");
	System.out.println("Account number:"+accountno);
	System.out.println("Amount:"+amt);
}
void TransferMoney(long mobno, String amt)
{
	System.out.println("transfers money using the registered mobile number");
	System.out.println("Mobile Number:"+mobno);
	System.out.println("Amount:"+amt);
}
void TransferMoney(String upi,double amt)
{
	System.out.println("transfers money using the **UPI ID**:");
	System.out.println("UPI ID:"+upi);
	System.out.println("Amount:"+amt);
}
}
public class BankingApplication
{
public static void main(String[] args)
{
	Bank b=new Bank();
	b.TransferMoney(847464255435L,40000);
	System.out.println();
	b.TransferMoney(65353536359L,"40000");
	System.out.println();
	b.TransferMoney("663535636@ybl",40000);
}
}