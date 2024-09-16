import java.util.*;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println(a);
		char ch = 'a';
		int b = a.length();
		String c = ch + "";
		String d = a.replace(c, "");
		System.out.println(d);
		int e = d.length();
		int f = b - e;

		System.out.println("character" + ch + "occured at " + f + "time");
	}

}
