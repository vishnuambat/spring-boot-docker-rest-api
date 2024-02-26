package com.vishnu.restapi.repositories;

import com.vishnu.restapi.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Customer repository class for database interaction
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    /**
     * Getting customer by customer Id
     * @param customerId
     * @return
     */
    Customer getCustomerByCustomerId(Long customerId);
}
