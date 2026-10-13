/*Scenario 1: Library Management System
Business Requirement
A college library wants to maintain information about all books available in the library. The librarian should be able to:
•	Add new books.
•	Search books.
•	Issue books to students.
•	Count the total number of books.
________________________________________
Why Do We Need a Class?
Every book has common properties:
•	Book ID
•	Title
•	Author
•	Price
•	Status (Issued/Available)
Instead of creating separate variables for every book, we create a Book class.
________________________________________
Objects : Each real book becomes an object.
Examples:
•	Book Object 1 → Java Programming
•	Book Object 2 → Python Programming
•	Book Object 3 → Database Management System
________________________________________
Instance Variables
Each book has its own:
bookId
title
author
price
status
These values are different for every object.
________________________________________
Static Variables
libraryName
totalBooks
These values are common for all books.
________________________________________
Array of Objects
The library stores multiple books.
Book[] books = new Book[1000];
________________________________________
Example Data
Book Id	Title	Author	Price
101	Java	James Gosling	500
102	Python	Guido	450
103	DBMS	Korth	600
________________________________________
Test Cases
Test Case 1
Input:
Add 3 books.
Expected Output:
totalBooks = 3
______________________________________
Test Case 2
Input:
Issue Book 101.
Expected Output:
Book Status = Issued
________________________________________
Test Case 3
Input:
Change library name.
Expected Output:
All books show new library name.
*/
import java.util.Scanner;
class Book
{
private int bookId;
private String title;
private String author;
private int price;
private boolean Issued;

static String libraryname="ABC Library";
static int totalbook=0;

public void setBook(int bookId,String title,String author,int price)
{
this.bookId=bookId;
this.title=title;
this.author=author;
this.price=price;
this.Issued=false;
totalbook++;
}
public int getBookId()
{
return bookId;
}
public boolean isIssued()
{
return Issued;
}
public void isIssueBook()
{
retrun issuebook;
}
public void show()
{
System.out.println("Library Name:"+libraryname);
System.out.println("Book Id     :"+bookId);
System.out.println("Title       :"+title);
System.out.println("Author      :"+author);
System.out.println("Price       :"+price);
System.out.println("Status      :"+(issued ? "Issued" :"Available" ));
}
}
public class LibraryManagement1
{
public static void main(String[] args)
{
Scanner xyz=new Scanner(Syste.in);

Book b[]=new Book[100];
int count=0;

while(true)
{
	System.out.println("-------Library Menu-------");
	System.out.println("1.Add Book");
	System.out.println("2.Search Book");
	System.out.println("3.Issued Book");
	System.out.println("4.Count Book");
	System.out.println("5.Change Library Name");
	System.out.println("6.Display All Books");
	System.out.println("7.Exit");
	
	System.out.println("enter the choice");
	int choice=xyz.nextInt();
	xyz.nextLine();
	
	switch(choice)
	{	
	case 1:
	book[count]=new Book();
	
	System.out.println("enter the Book Id");
	int bookId=xyz.nextInt();
	xyz.nextLine();
	
	System.out.println("enter the Book Title");
	String title=xyz.nextLine();
	
	System.out.println("enter the Author");
	String author=xyz.nextLine();
	
	System.out.println("enter the Price");
	int price=xyz.nextInt();
	
	book[count].setBook(bookId,title,author,price);
	count++;
	
	System.out.println("Book Issued Successfully");
	break;
	
	case 2:
	System.out.println("enter the Book ID");
	int bookId=xyz.nextInt();
	
	boolean found=false;
	for(int i=0;i<count;i++)
	{
		if(book[i].getBook()==bookId)
		{
			book[i].showBook();
			found=true;
			break;
		}
	}
	if(!found)
	{
		System.out.println("Book is not found");
	}
	
	case 3:
	System.out.println("enter the the Book ID");
	int bookId=xyz.nextInt();
	
	boolean found=false;
	
	for(int i=0;i<count;i++)
	{
		 if(books[i].getBook()==bookId)
                        {
                            if(!book[i].isIssued())
                            {
                                book[i].issueBook();
                                System.out.println("Book Issued");
                            }
                            else
                            {
                                System.out.println("Book Already Issued");
                            }

                            issue=true;
                            break;
                        }
                    }
                    if(!issue)
                    {
                        System.out.println("Book Not Found");
                    }
                    break;
                case 4:
                    System.out.println("Total Books = "+Book.totalBooks);
                    break;

                case 5:
                    xyz.nextLine();
                    System.out.print("Enter New Library Name: ");
                    Book.libraryname=xyz.nextLine();

                    System.out.println("Library Name Updated");
                    break;
                case 6:
                    for(int i=0;i<count;i++)
                    {
                        book[i].showBook();
                    }
                    break;
                case 7:
				System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
