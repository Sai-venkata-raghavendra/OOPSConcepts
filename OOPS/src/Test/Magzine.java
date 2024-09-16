package Test;

public class Magzine extends Books {
	String type = "Vikramarka";

	Magzine() {
		System.out.println(price + "of book is and authour" + author + "name is" + type);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magzine m = new Magzine();
		Novel n = new Novel();
	}

}
