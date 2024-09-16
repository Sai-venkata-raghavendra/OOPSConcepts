package cash;
 import java.util.*;
public class KthPower {

	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int a ;
	
	int z = 0/23;//0
	int y= 23/0;//Infinity........
	//Exception Handling Concepts
	int b=sc.nextInt();
	int k=sc.nextInt();
	a=k*k;
	if(k!=1||k!=2)
	{
	for(int i=0;i<k-1;i++)
	{
		a=a*k;	
	}
	System.out.println(a);
	}
	else
	{
	System.out.println(a);
	}
	}
}
