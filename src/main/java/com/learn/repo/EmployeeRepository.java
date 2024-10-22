package com.learn.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
