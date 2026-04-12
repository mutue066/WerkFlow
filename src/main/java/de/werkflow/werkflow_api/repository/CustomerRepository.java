package de.werkflow.werkflow_api.repository;

import de.werkflow.werkflow_api.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
