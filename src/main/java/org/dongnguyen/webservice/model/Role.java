package org.dongnguyen.webservice.model;

import java.util.Collection;
import java.util.Set;

import javax.persistence.*;
import org.dongnguyen.webservice.type.UserRoles;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "role")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_roles")
	@Enumerated(EnumType.STRING)
	private UserRoles role;

	@ManyToMany(targetEntity = User.class)
	@JoinColumn(name = "user_ids")
	private Collection<User> users;
}
