package com.frezateam.springbootrestfulapi.AddressModule.repository;

import com.frezateam.springbootrestfulapi.AddressModule.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {
}
