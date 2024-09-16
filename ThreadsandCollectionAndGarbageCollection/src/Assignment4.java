import java.util.HashMap;
import java.util.*;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> num = new HashMap<String, String>();
		num.put("raghava", "7075447896");
		num.put("ragava", "70755296");
		num.put("venkata", "7078796");
		Scanner a = new Scanner(System.in);
		System.out.println("enter name");
		String b = a.next();

		if (num.containsKey(b)) {
			System.out.println(b + "mobile number is:" + num.get(b));
		}
	}

}
