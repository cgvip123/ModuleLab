import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import problem6.beans.Department;
import problem6.beans.Employee;
import problem6.repo.EmployeeRepository;

public class Problem7 {

	public static void main(String[] args) {
		

		List<Employee> list = EmployeeRepository.list;
		
		//List out department names and count of employees in each department
		
		Map<Department, Long> map = list.stream().filter(emp -> emp.getDepartment()!=null).collect(groupingBy(Employee::getDepartment, counting()));
	
		for(Entry<Department, Long> entry: map.entrySet()) {
			System.out.println(entry.getKey().getDepartmentName()+" : "+entry.getValue());
		}
	}

}
