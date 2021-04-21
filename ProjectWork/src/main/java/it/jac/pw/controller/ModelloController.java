package it.jac.pw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.jac.pw.service.ModelloService;
import it.jac.pw.dto.Response;
import it.jac.pw.entity.Modello;

@RestController
@RequestMapping("/modelli")
public class ModelloController {
	
	private static Logger log = LoggerFactory.getLogger(ModelloController.class);

	@Autowired
	private ModelloService modelloService;
	
	@PostMapping("/create")
	public Response<?> createModello(
			@RequestBody Modello modello
			) {
		
		log.info("Richiesta di create modello.");

		return modelloService.createModello(modello);

	}
	
	@GetMapping(path="/findAll")
	public Response<?> findAllModelli() {
		
		log.info("Richiesta di find all modelli.");
		
		return modelloService.findAllModelli();
		
	}
	
	@PostMapping(path = "/delete")
	public Response<?> deleteModello(
			@RequestBody Modello modello
			) {

		log.info("Richiesta di delete modello.");

		return modelloService.deleteModello(modello);
		
	}

}
