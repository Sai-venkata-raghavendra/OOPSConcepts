package exceptions;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 2; i++) {
			String sub = "Raghavendra";
			int s1 = 89;
			int s2 = 90;
			int s3 = 80;
			try {
				if (s1 < 0 || s1 > 100) {
					System.out.println("only upto 0 to 100 numbers are allowed");
				}
				if (s2 < 0 || s2 > 100) {
					System.out.println("only upto 0 to 100 numbers are allowed");
				}
				if (s3 < 0 || s3 > 100) {
					System.out.println("only upto 0 to 100 numbers are allowed");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("name" + sub);
			System.out.println("subject1:" + s1);
			System.out.println("subject2:" + s2);
			System.out.println("subject3:" + s3);

		}
	}
}
