package it.jac.pw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.jac.pw.service.AllestimentoService;
import it.jac.pw.dto.Response;
import it.jac.pw.entity.Allestimento;

@RestController
@RequestMapping("/allestimento")
public class AllestimentoController {
	
	private static Logger log = LoggerFactory.getLogger(AllestimentoController.class);

	@Autowired
	private AllestimentoService allestimentoService;
	
	@PostMapping("/create")
	public Response<?> createAllestimento(
			@RequestBody Allestimento allestimento
			) {
		
		log.info("Richiesta di create allestimento.");

		return allestimentoService.createAllestimento(allestimento);

	}
	
	@GetMapping(path="/findAll")
	public Response<?> findAllAllestimenti() {
		
		log.info("Richiesta di find all allestimenti.");
		
		return allestimentoService.findAllAllestimenti();
		
	}
	
	@PostMapping(path = "/delete")
	public Response<?> deleteAllestimenti(
			@RequestBody Allestimento allestimento
			) {

		log.info("Richiesta di delete allestimento.");

		return allestimentoService.deleteAllestimento(allestimento);
		
	}

}
