package database;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMySqlApplication implements CommandLineRunner {
	
	@Autowired
	EmployeeRepository empRepo;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMySqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee emp =new Employee();
		emp.setName("kiran");								//create
		emp.setSalary(50000);
		
		Employee emp2 =new Employee();
		emp2.setName("varun");
		emp2.setSalary(25000);
		
	 	Employee emp3=new Employee();
	 	emp3.setName("vinu");
	 	emp3.setSalary(10000);
	 	
	 	Employee emp4 =new Employee();
		emp4.setName("vikranth");
		emp4.setSalary(35000);
		
	 	Employee emp5=new Employee();
	 	emp5.setName("venu");
	 	emp5.setSalary(80000);
	 	
	  	List<Employee> listofemployees = Arrays.asList(emp,emp2,emp3,emp4,emp5);
		
	  	empRepo.saveAll(listofemployees);					//Read
		empRepo.save(emp);
		
		
		Employee employ = empRepo.findById(2).get();
		employ.setName("vasanth");
		employ.setSalary(5000);
		
		empRepo.save(employ);								//update
		System.out.println("emp Updated");
		
		//empRepo.deleteAll();								//Delete
		//System.out.println("Deleted");
		
	}
		
		
}
