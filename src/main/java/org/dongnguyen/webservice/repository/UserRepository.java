package org.dongnguyen.webservice.repository;

import org.dongnguyen.webservice.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
