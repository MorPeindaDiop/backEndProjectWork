package it.jac.pw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.jac.pw.service.ConfigurazioneService;
import it.jac.pw.dto.Response;
import it.jac.pw.entity.Configurazione;


@RestController
@RequestMapping("/configurazione")
public class ConfigurazioneController {
	
	private static Logger log = LoggerFactory.getLogger(ConfigurazioneController.class);

	@Autowired
	private ConfigurazioneService configurazioneService;
	
	@PostMapping("/create")
	public Response<?> createConfigurazione(
			@RequestBody Configurazione configurazione
			) {
		
		log.info("Richiesta di create configurazione.");

		return configurazioneService.createConfigurazione(configurazione);

	}
	
	@GetMapping(path="/findAll")
	public Response<?> findAllConfigurazioni() {
		
		log.info("Richiesta di find all configurazioni.");
		
		return configurazioneService.findAllConfigurazioni();
		
	}
	
	@PostMapping(path = "/delete")
	public Response<?> deleteConfigurazioni(
			@RequestBody Configurazione configurazione
			) {

		log.info("Richiesta di delete configurazione.");

		return configurazioneService.deleteConfigurazione(configurazione);
		
	}

}
