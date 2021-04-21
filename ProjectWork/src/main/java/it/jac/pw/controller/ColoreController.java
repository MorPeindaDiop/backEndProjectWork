package it.jac.pw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.jac.pw.service.ColoreService;
import it.jac.pw.dto.Response;
import it.jac.pw.entity.Colore;

@RestController
@RequestMapping("/colore")
public class ColoreController {
	
	private static Logger log = LoggerFactory.getLogger(ColoreController.class);

	@Autowired
	private ColoreService coloreService;
	
	@PostMapping("/create")
	public Response<?> createColore(
			@RequestBody Colore colore
			) {
		
		log.info("Richiesta di create colore.");

		return coloreService.createColore(colore);

	}
	
	@GetMapping(path="/findAll")
	public Response<?> findAllColori() {
		
		log.info("Richiesta di find all colori.");
		
		return coloreService.findAllColori();
		
	}
	
	@PostMapping(path = "/delete")
	public Response<?> deleteColore(
			@RequestBody Colore colore
			) {

		log.info("Richiesta di delete colore.");

		return coloreService.deleteColore(colore);
		
	}

}
