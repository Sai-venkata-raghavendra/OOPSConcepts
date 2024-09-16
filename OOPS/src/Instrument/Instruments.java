package Instrument;

public class Instruments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument arr[] = new Instrument[10];
		for (int i = 0; i < 10; i++) {
			switch (i % 3) {
			case 0:
				arr[i] = new Piano();
				break;
			case 1:
				arr[i] = new Guitar();
				break;
			case 2:
				arr[i] = new Flute();
				break;
			}
		}

		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
			//arr[i].Play();
			if (arr[i] instanceof Piano) {
				System.out.println();
			}
			if (arr[i] instanceof Guitar) {
				System.out.println();
			}
			if (arr[i] instanceof Flute) {
				System.out.println();
			}
		}
	}

}
