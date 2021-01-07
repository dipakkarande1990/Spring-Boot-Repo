package in.nareshit.raghu.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.modal.Employee;
import in.nareshit.raghu.service.IEmployeeService;


@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository repo;

	
	public void createEmployee(Employee employee) {
		repo.save(employee);
	}
	
	
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	
	public Optional<Employee> getOneEmployee(Integer id) {
		return repo.findById(id);
	}
}
