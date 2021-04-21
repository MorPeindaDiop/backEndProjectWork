package it.jac.pw.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.jac.pw.dao.ConfigurazioneRepository;
import it.jac.pw.dto.ConfigurazioneDTO;
import it.jac.pw.dto.Response;
import it.jac.pw.entity.Configurazione;

@Service
public class ConfigurazioneService {

	private static Logger log = LoggerFactory.getLogger(ConfigurazioneService.class);

	@Autowired
	private ConfigurazioneRepository configurazioneRepository;

	public Response<Configurazione> createConfigurazione(Configurazione configurazione) {

		Response<Configurazione> response = new Response<Configurazione>();

		try {

			response.setResult(this.configurazioneRepository.save(configurazione));
			
			log.info("Configurazione creato/modificato.");

		} catch (Exception e) {

			response.setError("Configurazione non creato/modificato.");
			
			log.info("Configurazione non creato/modificato.");

		}

		return response;

	}


	public Response<String> deleteConfigurazione(Configurazione configurazione) {

		Response<String> response = new Response<String>();

		try {

			this.configurazioneRepository.delete(configurazione);			

			response.setResult("Configurazione eliminato.");
			
			log.info("Configurazione eliminato.");

		} catch (Exception e) {

			response.setError("Configurazione non eliminato.");

			log.info("Configurazione non eliminato.");
			
		}

		return response;

	}


	public Response<List<ConfigurazioneDTO>> findAllConfigurazioni() {

		Response<List<ConfigurazioneDTO>> response = new Response<List<ConfigurazioneDTO>>();

		List<ConfigurazioneDTO> result = new ArrayList<>();

		try {

			Iterator<Configurazione> iterator = this.configurazioneRepository.findAll().iterator();

			while(iterator.hasNext()) {

				Configurazione configurazione = iterator.next();
				result.add(ConfigurazioneDTO.build(configurazione));

			}

			response.setResult(result);
			
			log.info("Lista configurazioni.");

		} catch (Exception e) {

			response.setError("Nessun elemento trovato.");
			
			log.info("Nessun elemento trovato.");

		}

		return response;

	}

}
