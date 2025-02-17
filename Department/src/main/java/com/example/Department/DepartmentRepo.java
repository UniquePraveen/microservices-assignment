package com.example.Department;

import org.springframework.data.jpa.repository.JpaRepository;

// DepartmentRepository extends JpaRepository to inherit CRUD methods
public interface DepartmentRepo extends JpaRepository<department, Long> {
    // No need to write implementation; Spring Data JPA provides it automatically
}