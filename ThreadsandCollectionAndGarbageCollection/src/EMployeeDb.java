import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EMployeeDb {
	ArrayList<Employee> db = new ArrayList<Employee>();

	public boolean addEmployee(Employee e) {
		return db.add(e);
	}

	public boolean deleteEmployee(int id) {
		boolean b = false;
		Iterator<Employee> it = db.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getid() == id) {
				// b=true;
				it.remove();
			}

		}
		return b;
	}

	public String payslip(int id) {
		String payslip = "Invalid";
		for (Employee e : db) {
			if (e.getid() == id) {
				payslip = "id is" + id + "is" + e.getsalary();
			}
		}
		return payslip;
	}

	public Employee[] listAll() {
		Employee[] emparr = new Employee[db.size()];
		for (int i = 0; i < db.size(); i++) {
			emparr[i] = db.get(i);
		}
		return emparr;
	}

}
