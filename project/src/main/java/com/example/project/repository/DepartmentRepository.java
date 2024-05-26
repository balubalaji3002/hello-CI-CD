package com.example.project.repository;

import com.example.project.entiy.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long>{
}
