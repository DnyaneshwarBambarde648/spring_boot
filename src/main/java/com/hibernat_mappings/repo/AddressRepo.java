package com.hibernat_mappings.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernat_mappings.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
