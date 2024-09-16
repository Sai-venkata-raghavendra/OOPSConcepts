
public class Employee {

	int id;
	String name;
	String mail;
	char gender;
	double salary;

	public Employee(int eid, String ename, String email, char egender, double esalary) {
		super();
		id = eid;
		name = ename;
		mail = email;
		gender = egender;
		salary = esalary;
	}

	public String GetEmployeeDetails() {
		return "Emp id:" + id + "empname:" + name + "empmail:" + mail + "empgender" + gender + "emp salary" + salary;
	}

	public int getid() {
		return id;
	}

	public void setid(int eid) {
		id = eid;
	}

	public String getname() {
		return name;
	}

	public void setname(String ename) {
		name = ename;
	}

	public String getmail() {
		return mail;
	}

	public void setmail(String email) {
		mail = email;
	}

	public char getgender() {
		return gender;
	}

	public void setgender(char egender) {
		gender = egender;
	}

	public double getsalary() {
		return salary;
	}

	public void setsalary(double esalary) {
		salary = esalary;
	}

}
