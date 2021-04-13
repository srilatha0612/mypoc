package com.org.employee.Repository;

import com.org.employee.model.Employeedetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends MongoRepository<Employeedetails,Integer> {
}
