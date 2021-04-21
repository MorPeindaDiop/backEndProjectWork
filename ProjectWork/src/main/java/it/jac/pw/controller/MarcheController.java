package it.jac.pw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.jac.pw.service.MarcheService;
import it.jac.pw.dto.Response;
import it.jac.pw.entity.Marche;

@RestController
@RequestMapping("/marche")
public class MarcheController {
	
	private static Logger log = LoggerFactory.getLogger(MarcheController.class);

	@Autowired
	private MarcheService marcheService;
	
	@PostMapping("/create")
	public Response<?> createMarche(
			@RequestBody Marche marche
			) {
		
		log.info("Richiesta di create marche.");

		return marcheService.createMarche(marche);

	}
	
	@GetMapping(path="/findAll")
	public Response<?> findAllMarche() {
		
		log.info("Richiesta di find all marche.");
		
		return marcheService.findAllMarche();
		
	}
	
	@PostMapping(path = "/delete")
	public Response<?> deleteMarche(
			@RequestBody Marche marche
			) {

		log.info("Richiesta di delete marche.");

		return marcheService.deleteMarche(marche);
		
	}

}
