/*
3.	E-Commerce Application
In an e-commerce website, the placeOrder() functionality should support ordering a single product, multiple products, and products with a discount coupon. How would you use method overloading for the placeOrder () method?
Scenario: Customers can place orders in different ways.
Case 1: The customer purchases a single product.
Case 2: The customer purchases multiple products at once.
Case 3: The customer purchases products and also applies a discount coupon
All these actions perform the same task of placing an order, but they require different input data.  
*/
class ECommerce
{
void placeOrder(String product)
{
	Systemm.out.println("purchases a single product:");
	System.out.println("single product:"+product);
}
void placeOrder(String product1,String product2)
{
	Systemm.out.println("purchases a multiple product:");
	System.out.println("single product:"+product1);
	System.out.println("Multiple product:"+product2);
}
void placeOrder(String product1,String product2,String coupon)
{
	Systemm.out.println("purchases a products and also applies a discount coupon:");
	System.out.println("single product:"+product1);
	System.out.println("Multiple product:"+product2);
    System.out.println("Discount Coupon:"+coupon);
}
}
public class E-CommerceApplication
{
public static void main(String[] args)
{
 ECommerce e=new  ECommerce();
 e.placeOrder("Mobile");
 e.placeOrder("Mobile","Laptop");
 e.placeOrder("Mobile","Laptop","@12345");
}
}