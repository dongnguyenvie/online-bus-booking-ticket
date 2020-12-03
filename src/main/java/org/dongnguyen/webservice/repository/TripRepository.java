package org.dongnguyen.webservice.repository;

import org.dongnguyen.webservice.model.Trip;
import org.springframework.data.repository.CrudRepository;

public interface TripRepository extends CrudRepository<Trip, Long> {

}
