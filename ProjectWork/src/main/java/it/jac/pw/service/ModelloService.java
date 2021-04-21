package it.jac.pw.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.jac.pw.dao.ModelloRepository;
import it.jac.pw.dto.Response;
import it.jac.pw.dto.ModelloDTO;
import it.jac.pw.entity.Modello;

@Service
public class ModelloService {

	private static Logger log = LoggerFactory.getLogger(ModelloService.class);

	@Autowired
	private ModelloRepository modelloRepository;

	public Response<Modello> createModello(Modello modello) {

		Response<Modello> response = new Response<Modello>();

		try {

			response.setResult(this.modelloRepository.save(modello));
			
			log.info("Modello creato/modificato.");

		} catch (Exception e) {

			response.setError("Modello non creato/modificato.");
			
			log.info("Modello non creato/modificato.");

		}

		return response;

	}


	public Response<String> deleteModello(Modello modello) {

		Response<String> response = new Response<String>();

		try {

			this.modelloRepository.delete(modello);			

			response.setResult("Modello eliminato.");
			
			log.info("Modello eliminato.");

		} catch (Exception e) {

			response.setError("Movimento non eliminato.");

			log.info("Movimento non eliminato.");
			
		}

		return response;

	}


	public Response<List<ModelloDTO>> findAllModelli() {

		Response<List<ModelloDTO>> response = new Response<List<ModelloDTO>>();

		List<ModelloDTO> result = new ArrayList<>();

		try {

			Iterator<Modello> iterator = this.modelloRepository.findAll().iterator();

			while(iterator.hasNext()) {

				Modello modello = iterator.next();
				result.add(ModelloDTO.build(modello));

			}

			response.setResult(result);
			
			log.info("Lista modelli.");

		} catch (Exception e) {

			response.setError("Nessun elemento trovato.");
			
			log.info("Nessun elemento trovato.");

		}

		return response;

	}

}
