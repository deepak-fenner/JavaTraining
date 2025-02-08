package com.celcom.day5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Book {
	String title;
	String author;
	int isbn;
	static List<Book> collection=new ArrayList<>();
	Book(String title,String author,int isbn){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	public static void addBook(Book book) {
		collection.add(book);
		System.out.println("Book added successfully");
	}
	public static void removeBook(int isbn1) {
		boolean flag=false;
		for(Book book:collection) {
			if(book.isbn==isbn1) {
				System.out.println("The removed Book is:"+book.title);
				collection.remove(book);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Book not found");
		}
	}
	void displayBook() {
		for(Book book:collection) {
			System.out.println("Title is: "+book.title);
			System.out.println("Author is: "+book.author);
			System.out.println("ISBN is: "+book.isbn);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Book bookobj=null;
		int choice;
		do {
			System.out.println("Enter 1------->Adding Book");
			System.out.println("Enter 2------->Removing Book");
			System.out.println("Enter 3------->Display Details");
			System.out.println("Enter 4------->Exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the Title Name:");
				String title=sc.next();
				System.out.println("Enter the Author Name:");
				String author=sc.next();
				System.out.println("Enter the isbn Number:");
				int isbn=sc.nextInt();
				bookobj=new Book(title,author,isbn);
				addBook(bookobj);
				break;
			case 2:
				System.out.println("Enter the isbn number of the book which hase to be removed:");
				int isbn1=sc.nextInt();
				removeBook(isbn1);
				break;
			case 3:
				bookobj.displayBook();
				break;
			case 4:
				System.out.println("Program Ended!!!!");
				break;
			}
		}while(choice!=4);		
	}

}
