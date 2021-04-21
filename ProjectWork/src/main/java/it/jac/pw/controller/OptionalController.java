package it.jac.pw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.jac.pw.service.OptionalService;
import it.jac.pw.dto.Response;
import it.jac.pw.entity.Optional;

@RestController
@RequestMapping("/optional")
public class OptionalController {
	
	private static Logger log = LoggerFactory.getLogger(OptionalController.class);

	@Autowired
	private OptionalService optionalService;
	
	@PostMapping("/create")
	public Response<?> createOptional(
			@RequestBody Optional optional
			) {
		
		log.info("Richiesta di create optional.");

		return optionalService.createOptional(optional);

	}
	
	@GetMapping(path="/findAll")
	public Response<?> findAllOptionals() {
		
		log.info("Richiesta di find all optionals.");
		
		return optionalService.findAllOptionals();
		
	}
	
	@PostMapping(path = "/delete")
	public Response<?> deleteMOptional(
			@RequestBody Optional optional
			) {

		log.info("Richiesta di delete Optional.");

		return optionalService.deleteOptional(optional);
		
	}

}
