package org.dongnguyen.webservice.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.dongnguyen.webservice.dto.UserDto;
import org.dongnguyen.webservice.dto.mapper.UserMapper;
import org.dongnguyen.webservice.model.Role;
import org.dongnguyen.webservice.model.User;
import org.dongnguyen.webservice.repository.RoleRepository;
import org.dongnguyen.webservice.repository.UserRepository;
import org.dongnguyen.webservice.type.UserRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Component
public class UserServiceImpl implements UserService {
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public List<UserDto> getUsers() {
		List<User> users = (List<User>) userRepository.findAll();
		if (!users.isEmpty()) {
			return users.stream().map(user -> UserMapper.toUserDto(user)).collect(Collectors.toList());
		}
		return Collections.emptyList();
	}

	@Override
	public UserDto signup(UserDto userDto) {
		Role userRole;
		User user = userRepository.findByEmail(userDto.getEmail());
		if (user == null) {
			if (userDto.isAdmin()) {
				userRole = roleRepository.findByRole(UserRoles.ADMIN);
			} else {
				userRole = roleRepository.findByRole(UserRoles.PASSENGER);
			}
            user = new User()
                    .setEmail(userDto.getEmail())
                    .setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()))
                    .setRoles(new HashSet<>(Arrays.asList(userRole)))
                    .setFirstName(userDto.getFirstName())
                    .setLastName(userDto.getLastName())
                    .setMobileNumber(userDto.getMobileNumber());
			return UserMapper.toUserDto(userRepository.save(user));
		}
		return null;
	}

}
