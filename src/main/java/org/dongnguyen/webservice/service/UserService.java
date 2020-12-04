package org.dongnguyen.webservice.service;

import java.util.List;
import org.dongnguyen.webservice.dto.UserDto;

public interface UserService {
	List<UserDto> getUsers();

	UserDto signup(UserDto userDto);
}
