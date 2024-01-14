package com.sajl.cruddemo.dao;

import com.sajl.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="employee")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
