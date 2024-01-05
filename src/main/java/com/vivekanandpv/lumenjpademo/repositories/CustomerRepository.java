package com.vivekanandpv.lumenjpademo.repositories;

import com.vivekanandpv.lumenjpademo.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
