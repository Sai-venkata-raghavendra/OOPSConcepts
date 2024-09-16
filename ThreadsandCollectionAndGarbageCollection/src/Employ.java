
public class Employ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EMployeeDb db = new EMployeeDb();
		Employee e1 = new Employee(1, "Raghava", "Raghav@gmail.com", 'm', 25000);
		Employee e2 = new Employee(2, "Raava", "Raav@gmail.com", 'm', 25000);
		Employee e3 = new Employee(3, "Raga", "Raga@gmail.com", 'm', 25000);
		Employee e4 = new Employee(4, "Raghu", "Raghv@gmail.com", 'm', 25000);

		db.addEmployee(e1);
		db.addEmployee(e2);
		db.addEmployee(e3);
		db.addEmployee(e4);

		for (Employee e : db.listAll()) {
			System.out.println(e.GetEmployeeDetails());
			System.out.println("------------------------------");
			db.deleteEmployee(2);
		}

		for (Employee e : db.listAll()) {
			System.out.println(e.GetEmployeeDetails());
			System.out.println();

		}
		System.out.println(db.payslip(3));

	}

}
