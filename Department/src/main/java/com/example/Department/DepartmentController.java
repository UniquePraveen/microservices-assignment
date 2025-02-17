package com.example.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // Marks this class as a REST controller
@RequestMapping("/departments") // Base URL for all endpoints in this controller
public class DepartmentController {

    @Autowired // Injects the DepartmentRepository bean
    private DepartmentRepo departmentRepository;

    // POST /departments - Save a new department
    @PostMapping
    public department saveDepartment(@RequestBody department department) {
        return departmentRepository.save(department);
    }

    // GET /departments/{id} - Get a department by ID
    @GetMapping("/{id}")
    public department getDepartment(@PathVariable Long id) {
        return departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found"));
    }
}