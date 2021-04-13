package com.org.employee.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Employeedetails {
    @Id
    private int EmployeeId;
    private String EmployeeName;
    private double Salary;
    private  String Address;

}
