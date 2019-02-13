import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import problem6.beans.Employee;
import problem6.repo.EmployeeRepository;

public class Problem8 {

	public static void main(String[] args) {
		
		List<Employee> list = EmployeeRepository.list;
		
		//Find out the senior most employee of an organization.
		
		Optional<Employee> emp = list.stream().min(Comparator.comparing(Employee::getHireDate));
		
		System.out.println(emp.get().getFirstName()+" "+emp.get().getLastName());

	}

}
