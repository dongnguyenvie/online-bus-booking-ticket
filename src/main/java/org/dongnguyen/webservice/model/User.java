package org.dongnguyen.webservice.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "mobile_number")
	private String mobileNumber;

	@ManyToMany(targetEntity = Role.class)
	@JoinColumn(name = "role_ids")
	private Set<Role> roles;

}
