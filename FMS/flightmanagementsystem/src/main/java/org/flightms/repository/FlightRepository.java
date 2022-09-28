package org.flightms.repository;

import java.math.BigInteger;
import org.flightms.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight,BigInteger>{


}