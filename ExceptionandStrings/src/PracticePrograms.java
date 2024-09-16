import java.util.Scanner;

public class PracticePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int arr[]= {1,2,3,4,5,};

		int arr1[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);

		int a;//Variables  
		int b;
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}

		for (int i[] : arr1) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
