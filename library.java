import java.util.Scanner;
class library
{
	public static void main(String args[])
	{
		int bnum,bprice;
		String bname;
		Scanner na=new Scanner(System.in);
		System.out.println("Enter book number");
		bnum=na.nextInt();
		System.out.println("Enter book price");
		bprice=na.nextInt();
		System.out.println("Enter book name");
		bname=na.next();
		
		bookshell book=new bookshell();
		book.setBook(bname,bnum,bprice);
		book.getBook();
		System.out.println(bnum+" is the book number of " +bname+" and its price is "+bprice);
		na.close();
		
	}
}

class bookshell
{
	String bname;						//creating instance variable
	int bnum,bprice;
	
	public void setBook(String name,int num,int price)		//creating method setDetail to store information of book
	{
		bname= name;
		bnum = num;
		bprice = price;	
	}
	
	public void getBook()					//Creating method getDetail to display information of book
	{
		System.out.println("BOOK DETAIL");
		System.out.println("Book  NAME : "+bname );
		System.out.println("Book id  Number : "+bnum);
		System.out.println("Book PRICE : Rs."+bprice);
	}
}