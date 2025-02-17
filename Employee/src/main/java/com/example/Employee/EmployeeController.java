package com.example.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // Marks this class as a REST controller
@RequestMapping("/employees") // Base URL for all endpoints in this controller
public class EmployeeController {

    @Autowired // Injects the EmployeeRepository bean
    private EmployeeRepo employeeRepository;

    // POST /employees - Save a new employee
    @PostMapping
    public employee saveEmployee(@RequestBody employee employee) {
        return employeeRepository.save(employee);
    }

    // GET /employees/{id} - Get an employee by ID
    @GetMapping("/{id}")
    public employee getEmployee(@PathVariable Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }
}