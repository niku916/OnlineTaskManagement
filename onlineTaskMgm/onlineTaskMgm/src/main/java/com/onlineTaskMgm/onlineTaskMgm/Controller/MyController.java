package com.onlineTaskMgm.onlineTaskMgm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineTaskMgm.onlineTaskMgm.Dto.UsersDto;
import com.onlineTaskMgm.onlineTaskMgm.Service.UserService;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/users")
@Tag(name = "User API", description = "API for managing users")
public class MyController {
	@Autowired
	UserService userService;
	private final Tracer tracer;

	public MyController(Tracer tracer) {
		this.tracer = tracer;
	}

	@GetMapping("/hello")
	public String sayHello() {
		Span span = tracer.spanBuilder("sayHello").startSpan();
		try {
			// Simulate some processing
			Thread.sleep(100);
			return "Hello, World!";
		} catch (InterruptedException e) {
			span.recordException(e);
			return "Error!";
		} finally {
			span.end();
		}
	}

	@GetMapping("/users")
	public List<UsersDto> getInfo() {

		List<UsersDto> usersDto = userService.getinfo();

		return usersDto;
	}

	@GetMapping("/userbyname/{id}")
	@Operation(summary = "Get User by ID", description = "Fetch a user by their unique ID.")
	public List<UsersDto> getUserByName(@PathVariable("id") long id) {

		List<UsersDto> userdto = userService.getUserByName(id);

		return userdto;

	}

	@PostMapping("/inseruserdata")
	@Operation(summary = "Create a New User", description = "Create a new user with the provided details.")
	public UsersDto postMethodName(@RequestBody UsersDto Userdata) {
		UsersDto usersDto = userService.saveData(Userdata);

		return usersDto;
	}

}
