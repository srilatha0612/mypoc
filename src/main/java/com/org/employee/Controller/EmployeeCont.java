package com.org.employee.Controller;

import com.org.employee.Repository.EmployeeRepo;
import com.org.employee.model.Employeedetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class EmployeeCont {
    @Autowired
    public EmployeeRepo employeeRepo;
    @PostMapping
    public void createemployeerecord(@RequestBody Employeedetails employeedetails){
        employeeRepo.save(employeedetails);
    }
    @GetMapping
    public List<Employeedetails>getDetails(){
        List<Employeedetails> all = employeeRepo.findAll();
        return all;
    }
    @PutMapping
    public void updateemployeerecord(@RequestBody Employeedetails employeedetails){
        employeeRepo.save(employeedetails);
    }
}
