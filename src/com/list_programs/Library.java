package com.list_programs;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Library {	
	private ArrayList<Book> bookList=new ArrayList<Book>();

	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void addBook(Book bobj) {
		bookList.add(bobj); 
	}
	public boolean isEmpty() {
		if(bookList.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public ArrayList<Book> viewAllBooks(){
		return bookList;
	}
	public ArrayList<Book> viewBooksByAuthor(String author){
		ArrayList<Book>b=new ArrayList<Book>();
		Iterator i=bookList.iterator();
		while(i.hasNext()) {
		Book b1=(Book)i.next();
		if(b1.getAuthor().equalsIgnoreCase(author)) {
			b.add(b1);
		}
		else {
			System.out.println("invalid author name");
		}
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to library");
		Library l=new Library();
		Book b5=new Book();
		int status;
		do {
			System.out.println("Press 1 to add book");
			System.out.println("Press 2 to display all book details");
			System.out.println("Press 3 to search book by author");
			System.out.println("Press 4 to count number of books by book name");
			System.out.println("Press 5 to exit");
			System.out.println("Enter your choice");
			status=scan.nextInt();
			
			
			switch (status) {
			case 1:System.out.println("Enter isnbo");
				   b5.setIsbnno(scan.nextInt());
				   System.out.println("enter book name");
				   b5.setBookName(scan.next());
				   System.out.println("enter author name");
				   b5.setAuthor(scan.next());				   
			       l.addBook(b5);
				break;
			case 2:ArrayList<Book> res=l.viewAllBooks();
				   for (Book book : res) {
					System.out.println(b5.getBookName());
				}
			break;
			case 3:System.out.println("enter author name");
				    ArrayList<Book> res1=l.viewBooksByAuthor(scan.next());
				    for (Book book1 : res1) {
				    	System.out.println("ISBN No:"+book1.getIsbnno());
				    	System.out.println("Book Name:"+book1.getBookName());
				    	System.out.println("Author Name:"+book1.getAuthor());
				    }
			break;
			}
			System.out.println("Press 0 to continue");
			System.out.println("Press any number to stop");
			status=scan.nextInt();
		}while(status==0);
	}
}
