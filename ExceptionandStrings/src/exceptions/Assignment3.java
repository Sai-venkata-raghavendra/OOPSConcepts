package exceptions;

import java.util.*;

class Assignment3 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		float avg = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			avg += arr[i];

		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		try {
			if (n == 5) {
				avg = avg / n;
				System.out.println(avg);
			} else {
				throw new ArrayIndexOutOfBoundsException();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}
