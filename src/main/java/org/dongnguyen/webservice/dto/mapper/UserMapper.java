package org.dongnguyen.webservice.dto.mapper;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.dongnguyen.webservice.dto.UserDto;
import org.dongnguyen.webservice.model.User;
import org.dongnguyen.webservice.model.Role;

public class UserMapper {
	public static UserDto toUserDto(User user) {
		return new UserDto().setEmail(user.getEmail()).setFirstName(user.getFirstName()).setId(user.getId())
				.setLastName(user.getLastName()).setMobileNumber(user.getMobileNumber())
				.setRoles(user.getRoles().stream().map(role -> role.getId()).collect(Collectors.toSet()));
	}
}
