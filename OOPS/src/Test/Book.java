package Test;

public class Book {
	String title;
	String author;
	int price;
	
//private int discount;
	int sellingprice;

	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void display() {
		System.out.println("The title of the book is" + title + "and the author of the book is " + author
				+ ".The price of the book is " + price);
	}

	void disc(int price, int discount) {
		sellingprice = price - discount;
		int k = sellingprice;
		System.out.println("The selling price of the book is after dicount" + k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book("Panchatantra", "Vikramarka", 2000);
		b.display();
		b.disc(2000, 100);
	}

}
