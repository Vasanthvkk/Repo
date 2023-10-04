package database;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@GetMapping("/getempdetailes")
	private List<Employee> getAllEmployees()
	{
		return getAllEmployees();
	}
}
