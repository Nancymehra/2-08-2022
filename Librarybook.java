import java.util.Scanner;
class Librarybook
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Book title :");
		String titleName = scan.nextLine();
		System.out.println("Enter Author Name :");
		String name = scan.nextLine();
		System.out.println("Enter Author city name :");
		String city = scan.nextLine();
		System.out.println("Enter Author state name :");
		String state = scan.nextLine();
		System.out.println("Enter Book Id number :");
		int id = scan.nextInt();
		System.out.println("Enter Author Address Pincode :");
		int pincode = scan.nextInt();
		
										//creating object bookAuthor of class Author
		Author bookAuthor = new Author(pincode,name,city,state);
										//creating object title1 of class bookEntry
		bookEntry title1 = new bookEntry(id,titleName,bookAuthor);
										//calling bookDetail method from class bookEntry
		title1.bookDetail();
		scan.close();
	}
}


									//creating Author class to store author name and address
class Author
{
	int pinCode;
	String authorName,cityName,stateName;
	
									//creating constructer that take author details as parameter
	Author(int pin,String name,String city,String State)
	{
		
						//Attribute of class Author
		pinCode = pin;
		authorName = name;
		cityName = city;
		stateName = State;
	}
}


						//Creating class book
class bookEntry
{
	int bookId;
	String bookTitle;
	
						//Aggregating from class Author
	Author  bookAuthor;
						//creating constructer that take book details as parameter
	bookEntry(int id,String title,Author writer)
	{
						//Attribute of book
		bookId = id;
		bookTitle = title;
		bookAuthor = writer;
	}
	
						//creating method of class book
	public void bookDetail(){
		/*
			printing Book details with Author details 
			using aggregation with class Author
		*/
		System.out.println("Book Details");
		System.out.println("Book : "+bookTitle+"\nBook Id : "+bookId+"\nAuthor Name : "+bookAuthor.authorName+"\nAuthor address : \n"+bookAuthor.cityName+",\n"+bookAuthor.stateName+",\npin-"+bookAuthor.pinCode);
		
	}
}