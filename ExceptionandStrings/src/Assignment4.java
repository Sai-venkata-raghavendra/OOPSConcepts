import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
	
		int a[][] = new int [3][3];
		int b[][] = new int [3][3];
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 st array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter 2nd  array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println(" 1 st array is");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("2nd array is");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
			
		
		System.out.println("=================================");
		int c[][]=new int[3][3];  
	    
		 
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		c[i][j]+=a[i][k]*b[k][j];      
		}  
		System.out.print(c[i][j]+" ");  
		}
		System.out.println();    
		}
		
	}

}
