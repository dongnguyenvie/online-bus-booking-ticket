package org.dongnguyen.webservice.repository;

import org.dongnguyen.webservice.model.Role;
import org.dongnguyen.webservice.type.UserRoles;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByRole(UserRoles role);
}
