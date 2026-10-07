//22.In an Employee Management System, why would you create multiple constructors for the Employee class?
class Employee
{
int empid;
String name;
double salary;
Employee(int empid,String name)
{
this.empid=empid;
this.name=name;
this.salary=0.0;
}
Employee(int empid,String name,double salary)
{
this.empid=empid;
this.name=name;
this.salary=salary;
}
void display()
{
System.out.println("Employee id:"+empid);
System.out.println("Employee name:"+name);
System.out.println("Employee salary:"+salary);
}
}
public class EmployeeManageSystem
{
public static void main(String[] args)
{
Employee e1=new Employee(1,"Devyani");
Employee e2=new Employee(2,"Mansi",50000);
e1.display();
System.out.println();
e2.display();
}
}