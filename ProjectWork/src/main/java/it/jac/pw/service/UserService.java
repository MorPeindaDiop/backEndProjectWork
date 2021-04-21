package it.jac.pw.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.jac.pw.dao.UserRepository;
import it.jac.pw.dto.Response;
import it.jac.pw.dto.UserDTO;
import it.jac.pw.entity.User;

@Service
public class UserService {

	private static Logger log = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRepository userRepository;

	public Response<User> createUser(User user) {

		Response<User> response = new Response<User>();

		try {

			response.setResult(this.userRepository.save(user));
			
			log.info("Utente creato/modificato.");

		} catch (Exception e) {

			response.setError("Utente non creato/modificato.");
			
			log.info("Utente non creato/modificato.");

		}

		return response;

	}


	public Response<String> deleteUser(User user) {

		Response<String> response = new Response<String>();

		try {

			this.userRepository.delete(user);			

			response.setResult("User eliminato.");
			
			log.info("User eliminato.");

		} catch (Exception e) {

			response.setError("User non eliminato.");

			log.info("User non eliminato.");
			
		}

		return response;

	}


	public Response<List<UserDTO>> findAllUsers() {

		Response<List<UserDTO>> response = new Response<List<UserDTO>>();

		List<UserDTO> result = new ArrayList<>();

		try {

			Iterator<User> iterator = this.userRepository.findAll().iterator();

			while(iterator.hasNext()) {

				User user = iterator.next();
				result.add(UserDTO.build(user));

			}

			response.setResult(result);
			
			log.info("Lista Utenti.");

		} catch (Exception e) {

			response.setError("Nessun elemento trovato.");
			
			log.info("Nessun elemento trovato.");

		}

		return response;

	}

}
