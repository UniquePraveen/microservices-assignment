package com.example.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

// EmployeeRepository extends JpaRepository to inherit CRUD methods
public interface EmployeeRepo extends JpaRepository<employee, Long> {
    // No need to write implementation; Spring Data JPA provides it automatically
}