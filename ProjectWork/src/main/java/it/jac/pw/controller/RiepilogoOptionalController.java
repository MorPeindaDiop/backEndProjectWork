package it.jac.pw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.jac.pw.service.RiepilogoOptionalService;
import it.jac.pw.dto.Response;
import it.jac.pw.entity.RiepilogoOptional;

@RestController
@RequestMapping("/riepilogoOptional")
public class RiepilogoOptionalController {
	
	private static Logger log = LoggerFactory.getLogger(RiepilogoOptionalController.class);

	@Autowired
	private RiepilogoOptionalService riepilogoOptionalService;
	
	@PostMapping("/create")
	public Response<?> createRiepilogoOptional(
			@RequestBody RiepilogoOptional riepilogoOptional
			) {
		
		log.info("Richiesta di create riepilogoOptional.");

		return riepilogoOptionalService.createRiepilogoOptional(riepilogoOptional);

	}
	
	@GetMapping(path="/findAll")
	public Response<?> findAllRiepilogoOptionals() {
		
		log.info("Richiesta di find all riepilogoOptionals.");
		
		return riepilogoOptionalService.findAllRiepilogoOptionals();
		
	}
	
	@PostMapping(path = "/delete")
	public Response<?> deleteRiepilogoOptional(
			@RequestBody RiepilogoOptional riepilogoOptional
			) {

		log.info("Richiesta di delete riepilogoOptional.");

		return riepilogoOptionalService.deleteRiepilogoOptional(riepilogoOptional);
		
	}

}
