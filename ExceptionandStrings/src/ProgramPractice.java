import java.util.Scanner;

public class ProgramPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the row and column size");
		int n = sc.nextInt();
		int m = sc.nextInt();
		// Require row and colum size to declare sicze of Array
		//Size of Array is  n*m 
		int[][] arr= new int [n][m];
		int arr1[][] = new int [n][m];
		int arr2[][] = new int[n][m];
		System.out.println("Enetr the 1st Array");
		int  sum=0 ;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		//i=0 j= 0-->10
		//i =0 j =1-->20
		//i=0; j=2 --> 30
		//i=1 j = 0 --> 10
		// i= 1 j= 1 -->20
		//i =1 j =2-->30
		// i= 2 j=0-->10
		// i=2 j=1 --> 50
		// i=2 j=2-->50
		
		System.out.println("Enter the second Array");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println(" 1st Array is");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(" 2nd Array is");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr2[i][j] = arr[i][j] + arr1[i][j];
			}
		}
		System.out.println("Addition of Arrays");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr2[i][j]+ " ");
			}
			System.out.println();
		}
			
	}

}
