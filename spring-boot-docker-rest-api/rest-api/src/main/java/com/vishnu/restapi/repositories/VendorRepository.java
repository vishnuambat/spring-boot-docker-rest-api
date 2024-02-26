package com.vishnu.restapi.repositories;

import com.vishnu.restapi.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Vendor repository class for database interaction
 */
@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {

}
