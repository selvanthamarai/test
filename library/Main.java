package library;

import java.util.*;
import java.util.ArrayList;

public class Main {
	ArrayList<Library> booklist = new ArrayList<Library>();

	public void init() {
		System.out.println("1.Add Book");
		System.out.println("2.Display Book");
		System.out.println("3.Update Book");
		System.out.println("4.Dlete Book");

		
		while (true) {
			
			Scanner sc = new Scanner(System.in);
			
			String choose = sc.nextLine();
			
			if (choose.equalsIgnoreCase("1")) {
				add();
			}
			else if (choose.equalsIgnoreCase("2")) {
				display();
			}
			else if (choose.equalsIgnoreCase("3")) {
				update();
			}
			else if (choose.equalsIgnoreCase("4")) {
				delete();
			}
			else {
				break;
			}

		}

	}

	public void add() {
		Scanner scanner = new Scanner(System.in);
		
		Library lib = new Library();
		
		System.out.println("Enter Book id : ");
		lib.setBookId(scanner.nextInt());
		
		System.out.println("Enter Book Name : ");
		lib.setBookName(scanner.next());
		
		System.out.println("Enter Book Author Name : ");
		lib.setAuthorName(scanner.next());
		
		System.out.println("Enter Book Price : ");
		lib.setPrice(scanner.nextFloat());
		
		booklist.add(lib);
		
		
		System.out.println("Add sucessfully");
	}
	
	
	public void display() {

		for (Library lib : booklist) {
			System.out.println(
	lib.getBookId() + " " + lib.getBookName() + " " + lib.getAuthorName() + " " + lib.getPrice());

		}

	}
	
	
	
	
	public void update() {
		System.out.println("Enter book id");
		
		Scanner scanner = new Scanner(System.in);
		
		int bookId = scanner.nextInt();
		
		for (int i = 0; i < booklist.size(); i++) {
			
			if (booklist.get(i).getBookId() == bookId) {
				
				
				Library lib = new Library();
				
				lib.setBookId(bookId);
				
				System.out.println("Enter book Name");
				lib.setBookName(scanner.next());
				
				System.out.println("Enter book Au");
				lib.setAuthorName(scanner.next());
				
				System.out.println("Enter book Price");
				lib.setPrice(scanner.nextFloat());
				
				booklist.set(i, lib);
				
				System.out.println("Updated successfully");
				break;
			}
			System.out.println("you entered book id is wrong");

		}

	}





	public void delete() {
		
		System.out.println("Enter the book id");
		Scanner scanner=new Scanner(System.in);
		
		int bookId= scanner.nextInt();
		
		for(int i=0; i < booklist.size(); i++) {
			
			if (booklist.get(i).getBookId() == bookId) {
			
				Library lib=new Library();
				
				booklist.set(i, lib);
				
				booklist.remove(lib);
				
				System.out.println("Deleted sucessfully");
				
			  break;
			}
			
			System.out.println("you entered book id is wrong");	
		}
		
	}
	
	
	public static void main(String[] args) {

		Main col  = new Main();
		col.init();
	}
}
