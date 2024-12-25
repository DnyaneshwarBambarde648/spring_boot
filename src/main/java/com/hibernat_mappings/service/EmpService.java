package com.hibernat_mappings.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernat_mappings.entity.Address;
import com.hibernat_mappings.entity.Employee;
import com.hibernat_mappings.repo.AddressRepo;
import com.hibernat_mappings.repo.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo empRepo;
	
	@Autowired
	private AddressRepo addRepo;
	
	public void saveEmp() {
		Employee emp = new Employee();
		emp.setName("Mauli");
		emp.setSalary(85000.00);
		
		
		Address a1 = new Address();
		a1.setCity("Abad");
		a1.setState("Maharashtra");
		a1.setCountry("India");
		a1.setAddressType("Permanant");
		
		Address a2 = new Address();
		a2.setCity("Banglore");
		a2.setState("Karnatka");
		a2.setCountry("India");
		a2.setAddressType("Present");
		
		a1.setEmp(emp);
		a2.setEmp(emp);
		
		emp.setAdd(Arrays.asList(a1,a2));
		
		empRepo.save(emp);
		
		
	}
	
	public void getEmo() {
		empRepo.findById(1);
		
	}
	
	public void getAddress() {
		addRepo.findById(1);
	}
}
