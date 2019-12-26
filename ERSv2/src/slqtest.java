import com.ers.v2.daoImpl.EmployeeDaoImpl;
import com.ers.v2.models.Employee;

public class slqtest {

	public static void main(String[] args) {
		Employee emp = new Employee("Kaylan2","kaylanhusband2@gmail.com","kayjay709");
		EmployeeDaoImpl empImpl = new EmployeeDaoImpl();
		empImpl.createEmployee(emp);
	}

}
