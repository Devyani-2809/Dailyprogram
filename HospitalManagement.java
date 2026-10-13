/*
Scenario 2: Hospital Management System
Business Requirement
A hospital wants to maintain patient records.
The receptionist should:
•	Register patients.
•	Search patients.
•	Admit and discharge patients.
•	Count total patients.______________________________________

Class
Patient
________________________________________
Objects
•	Ram
•	Sita
•	Mohan
Each patient is an object.
________________________________________
Instance Variables
patientId
name
age
disease
roomNo
Every patient has different values.
 Static Variables
 hospitalName
 totalPatients
These values are shared by all patients.
Array of Objects
Patient [] patients = new Patient [500];
Example Data
Patient Id	Name	Disease
P101	Ram	Fever
P102	Sita	Diabetes
P103	Mohan	Covid
________________________________________
Test Cases
Test Case 1
Input:
Register 3 patients.
Expected:totalPatients = 3
Test Case 2
Input: Discharge Patient P102.
Expected:
Patient removed successfully.
________________________________________
Test Case 3
Input:
Update room number of Ram.
Expected:
Only Ram's room number changes.
*/
class Patient
{
int patientId;
String name;
int age;
String disease;
int roomNo;
String status;
static String hospitalName="City Hospital";
static int totalPatients=0;

Patient(int patientId,String name,int age,String disease,int roomNo)
{
this.patientId=patientId;
this.name=name;
this.age=age;
this.disease=disease;
this.roomNo=roomNo;

status="Admitted";
totalPatients++;
}
void display()
{
System.out.println("Hospital Name:"+hospitalName);
System.out.println("Paitent ID:"+patientId);
System.out.println("Paitent Name:"+name);
System.out.println("Paitent Age:"+age);
System.out.println("Paitent Disease:"+disease);
System.out.println("Paitent Room No:"+roomNo);
System.out.println("Status:"+status);
}
void dischargePatient()
{
status="Discharged";
totalPatients--;
}
void updateRoom(int newRoom)
{
roomNo=newRoom;
}
}
public class HospitalManagement
{
public static void main(String[] args)
{
Patient[] patient=new Patient[500];

patient[0]=new Patient(1,"Ram",25,"Fever",101);
patient[1]=new Patient(2,"Ram",22,"Maleria",102);
patient[2]=new Patient(3,"Ram",60,"Nimonia",103);

System.out.println("Total Paitent:"+Patient.totalPatients);
patient[1].dischargePatient();
patient[0].updateRoom(201);

System.out.println();

patient[0].display();
System.out.println();
patient[1].display();
System.out.println();
patient[2].display();
}
}