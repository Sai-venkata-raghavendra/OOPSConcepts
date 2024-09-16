
public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalize f = new Finalize();
		f = new Finalize();
		f = new Finalize();
		Runtime.getRuntime().gc();
		System.out.println("Finalize");
	}

}
