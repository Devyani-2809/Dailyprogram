/*Function Overloading Scenario-Based Interview Questions
1.	Hospital Management System
In a hospital management application, you need to create an addPatient() method. Sometimes the receptionist enters only the patient's name and age, while in other cases they also enter address, phone number, and insurance details. How would you use method overloading to design the addPatient() functionality?
Scenario:
A hospital receptionist may have different amounts of information when registering a patient.
Case 1: The patient provides **name, age, address, and phone number**.
Case 2: The patient is admitted with complete details such as **name, age, address, phone number, and insurance information, min advance amount.
*/
class Hospital
{
void addPatient(String name,int age,String address,String phoneno)
{
System.out.println("Patient Details:");
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Address:"+address);
System.out.println("PhoneNo:"+phoneno);
}
void addPatient(String name,int age,String address,String phoneno,String insuranceinfo,double advanceamount)
{
System.out.println("Patient Registered with Complete Detail:");
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Address:"+address);
System.out.println("PhoneNo:"+phoneno);
System.out.println("Insurance information:"+insuranceinfo);
System.out.println("min advance amount:"+advanceamount);
}
}
public class HospitalManagementSystem
{
public static void main(String[] args)
{
	Hospital h=new Hospital();
	h.addPatient("Devyani",22,"pune","1357537995");
	System.out.println();
	h.addPatient("Devyani",22,"pune","1357537995","Star Health",2000);
}
}