package problem6.repo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import problem6.beans.Department;
import problem6.beans.Employee;

public class EmployeeRepository {

	public static List<Employee> list = new ArrayList<>();
	
	static {
		//Department department = new Department(departmentId, departmentName, managerId);
		//Employee employee = new Employee(employeeId, firstName, lastName, email, phoneNumber, hireDate, designation, salary, managerId, department)
		
		Department hr = new Department(100, "HR", 1);
		Department finance = new Department(101, "Finance", 2);
		Department cs = new Department(102, "CS", 3);
		
		LocalDate ld = LocalDate.now().of(1997, 04, 12);
		list.add(new Employee(1001, "YANHSU", "GUPTA", "yanshugupta@engineer.com", "8979225022", ld, "CEO", 12000000, 1, hr));
		ld = LocalDate.now().of(2000, 05, 30);
		list.add(new Employee(1002, "NILESH", "GUPTA", "nileshgupta@engineer.com", "8979897949", ld, "HR", 6000000, 1, null));
		ld = LocalDate.now().of(2001, 12, 20);
		list.add(new Employee(1003, "SHUBHAM", "KUMAR", "shubhamkumar@engineer.com", "7060285628", ld, "MANAGER", 5000000, 3, cs));
		ld = LocalDate.now().of(1999, 12, 31);
		list.add(new Employee(1004, "YATHARTH", "DUBEY", "yathathdubey@engineer.com", "7656778181", ld, "MANAGER", 5000000, 2, finance));
		ld = LocalDate.now().of(2005, 10, 15);
		list.add(new Employee(1005, "RAJ", "KUMAR", "rajkumar@engineer.com", "7714271414", ld, "MANAGER", 5000000, 1, hr));
	}
	
}
