package it.jac.pw.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.jac.pw.dao.MotorizzazioneRepository;
import it.jac.pw.dto.Response;
import it.jac.pw.dto.MotorizzazioneDTO;
import it.jac.pw.entity.Motorizzazione;

@Service
public class MotorizzazioneService {

	private static Logger log = LoggerFactory.getLogger(MotorizzazioneService.class);

	@Autowired
	private MotorizzazioneRepository motorizzazioneRepository;

	public Response<Motorizzazione> createMotorizzazione(Motorizzazione motorizzazione) {

		Response<Motorizzazione> response = new Response<Motorizzazione>();

		try {

			response.setResult(this.motorizzazioneRepository.save(motorizzazione));
			
			log.info("Motorizzazione creato/modificato.");

		} catch (Exception e) {

			response.setError("Motorizzazione non creato/modificato.");
			
			log.info("Motorizzazione non creato/modificato.");

		}

		return response;

	}


	public Response<String> deleteMotorizzazione(Motorizzazione motorizzazione) {

		Response<String> response = new Response<String>();

		try {

			this.motorizzazioneRepository.delete(motorizzazione);			

			response.setResult("Motorizzazione eliminato.");
			
			log.info("Motorizzazione eliminato.");

		} catch (Exception e) {

			response.setError("Motorizzazione non eliminato.");

			log.info("Motorizzazione non eliminato.");
			
		}

		return response;

	}


	public Response<List<MotorizzazioneDTO>> findAllMotorizzazioni() {

		Response<List<MotorizzazioneDTO>> response = new Response<List<MotorizzazioneDTO>>();

		List<MotorizzazioneDTO> result = new ArrayList<>();

		try {

			Iterator<Motorizzazione> iterator = this.motorizzazioneRepository.findAll().iterator();

			while(iterator.hasNext()) {

				Motorizzazione motorizzazione = iterator.next();
				result.add(MotorizzazioneDTO.build(motorizzazione));

			}

			response.setResult(result);
			
			log.info("Lista motorizzazioni.");

		} catch (Exception e) {

			response.setError("Nessun elemento trovato.");
			
			log.info("Nessun elemento trovato.");

		}

		return response;

	}

}
