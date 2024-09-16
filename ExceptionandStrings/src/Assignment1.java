
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = args[0];
		int b = Integer.parseInt(args[1]);
		if (b >= 18 && b <= 60) {
			System.out.println(name + "you are eligible to vote");
		} else {
			try {
				System.out.println("Age must be in 18 years only");
			} catch (Exception e) {
				System.out.println("age");
			}
		}
	}

}
