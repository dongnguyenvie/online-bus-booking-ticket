package org.dongnguyen.webservice.dto;

import java.util.Set;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@ToString
public class UserDto {
	private Long id;

	private String email;

	private String firstName;

	private String lastName;

	private String password;

	private String mobileNumber;

	private boolean isAdmin;

	private Set<Long> roles;

	public String getFullName() {
		return firstName != null ? firstName.concat(" ").concat(lastName) : "";
	}
}
