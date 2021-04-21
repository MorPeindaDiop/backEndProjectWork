package it.jac.pw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.jac.pw.service.MotorizzazioneService;
import it.jac.pw.dto.Response;
import it.jac.pw.entity.Motorizzazione;

@RestController
@RequestMapping("/motorizzazione")
public class MotorizzazioneController {
	
	private static Logger log = LoggerFactory.getLogger(MotorizzazioneController.class);

	@Autowired
	private MotorizzazioneService motorizzazioneService;
	
	@PostMapping("/create")
	public Response<?> createMotorizzazione(
			@RequestBody Motorizzazione motorizzazione
			) {
		
		log.info("Richiesta di create motorizzazione.");

		return motorizzazioneService.createMotorizzazione(motorizzazione);

	}
	
	@GetMapping(path="/findAll")
	public Response<?> findAllAllMotorizzazioni() {
		
		log.info("Richiesta di find all motorizzazioni.");
		
		return motorizzazioneService.findAllMotorizzazioni();
		
	}
	
	@PostMapping(path = "/delete")
	public Response<?> deleteMotorizzazioni(
			@RequestBody Motorizzazione motorizzazione
			) {

		log.info("Richiesta di delete motorizzazioni.");

		return motorizzazioneService.deleteMotorizzazione(motorizzazione);
		
	}

}
