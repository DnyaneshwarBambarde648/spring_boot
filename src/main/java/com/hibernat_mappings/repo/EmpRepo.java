package com.hibernat_mappings.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernat_mappings.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
