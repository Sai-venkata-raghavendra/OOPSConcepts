public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 6; i++) {
			int random = (int) (Math.random() * 10);
			System.out.println("number" + random);
			int fact = 1;
			if (random == 0) {
				System.out.println("Factorrial of random" + random + ":1");
			} else {
				for (int j = 1; j <= random; j++) {
					fact = fact * j;
				}
				System.out.println("Final result of factorial is" + random + "of" + fact);
			}
		}
	}
}
