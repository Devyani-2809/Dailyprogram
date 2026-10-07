/*
Scenario 3: Employee Management System
Business Requirement
A company wants to manage employee information.
Requirements:
•	Add employees.
•	Update salary.
•	Search employees.
•	Count total employees.
_______________________________________
Class
Employee
________________________________________
Objects
•	Rahul
•	Sneha
•	Pooja
________________________________________
Instance Variables
empId
name
department
salary
Every employee has different information.
________________________________________
Static Variables
companyName
employeeCount
Common for all employees.
________________________________________
Array of Objects : Employee[] employees = new Employee[1000];
________________________________________
Example Data
Id	Name	Department
101	Rahul	Development
102	Sneha	Testing
103	Pooja	HR
________________________________________
Test Cases
Test Case 1
Input: Add 5 employees.
Expected: employeeCount = 5
Test Case 2
Input: Increase Rahul's salary.
Expected: Only Rahul's salary changes.
Test Case 3
Input: Change company name.
Expected: All employees display the new company name.
*/
class Employee
{
int empId;
String name;
String department;
double salary;

Employee(int empId,String name,String department,double salary)
{
this.empId=empId;
this.name=name;
this.department=department;
this.salary=salary;
employeeCount++;
}
void updateSalary(double newSalary)
{
salary=newSalary;
}
void display()
{
System.out.println("Company Name:"+companyName);
System.out.println("Employee Id:"+empId);
System.out.println("Employee Nmae:"+name);
System.out.println("Department:"+department);
System.out.println("Salary:" + salary);
}
}
public class EmployeeManagement
{
public static void main(String[] args)
{
employee[0]=new Employee(1,"Rahul", "Development", 50000); employee[1] = new Employee(102, "Sneha", "Testing", 45000);
employee[2] = new Employee(103, "Pooja", "HR", 40000);

System.out.println("Total Employee :"+Employee.employeeCount);
employee[0].updateSalary(60000);

Employee.companyName="Infosys";
        employee[0].display();
        employee[1].display();
        employee[2].display();
    }
}