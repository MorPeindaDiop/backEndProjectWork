package it.jac.pw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.jac.pw.service.UserService;
import it.jac.pw.dto.Response;
import it.jac.pw.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private static Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public Response<?> createUser(
			@RequestBody User user
			) {
		
		log.info("Richiesta di create User.");

		return userService.createUser(user);

	}
	
	@GetMapping(path="/findAll")
	public Response<?> findAllUsers() {
		
		log.info("Richiesta di find all Users.");
		
		return userService.findAllUsers();
		
	}
	
	@PostMapping(path = "/delete")
	public Response<?> deleteUser(
			@RequestBody User user
			) {

		log.info("Richiesta di delete User.");

		return userService.deleteUser(user);
		
	}

}
