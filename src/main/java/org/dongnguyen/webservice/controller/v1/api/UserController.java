package org.dongnguyen.webservice.controller.v1.api;

import java.util.List;

import org.dongnguyen.webservice.controller.v1.request.UserSignupRequest;
import org.dongnguyen.webservice.dto.UserDto;
import org.dongnguyen.webservice.service.UserService;
import org.dongnguyen.webservice.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/all")
	public List<UserDto> getUsers() {
		return userService.getUsers();
	}

	@PostMapping("/signup")
	public String signup(@Valid @RequestBody UserSignupRequest userSignupRequest) {
		return "a";
	}
}
