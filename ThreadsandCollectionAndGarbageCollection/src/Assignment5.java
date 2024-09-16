import java.util.HashSet;
import java.util.Iterator;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s = new HashSet<String>();
		s.add("Sai");
		s.add("Venkata");
		s.add("Raghavendra");
		Iterator<String> i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
