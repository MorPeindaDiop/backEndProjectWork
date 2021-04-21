package it.jac.pw.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.jac.pw.dao.OptionalRepository;
import it.jac.pw.dto.Response;
import it.jac.pw.dto.OptionalDTO;
import it.jac.pw.entity.Optional;

@Service
public class OptionalService {

	private static Logger log = LoggerFactory.getLogger(OptionalService.class);

	@Autowired
	private OptionalRepository optionalRepository;

	public Response<Optional> createOptional(Optional optional) {

		Response<Optional> response = new Response<Optional>();

		try {

			response.setResult(this.optionalRepository.save(optional));
			
			log.info("Optional creato/modificato.");

		} catch (Exception e) {

			response.setError("Optional non creato/modificato.");
			
			log.info("Optional non creato/modificato.");

		}

		return response;

	}


	public Response<String> deleteOptional(Optional optional) {

		Response<String> response = new Response<String>();

		try {

			this.optionalRepository.delete(optional);			

			response.setResult("Movimento eliminato.");
			
			log.info("Movimento eliminato.");

		} catch (Exception e) {

			response.setError("Movimento non eliminato.");

			log.info("Movimento non eliminato.");
			
		}

		return response;

	}


	public Response<List<OptionalDTO>> findAllOptionals() {

		Response<List<OptionalDTO>> response = new Response<List<OptionalDTO>>();

		List<OptionalDTO> result = new ArrayList<>();

		try {

			Iterator<Optional> iterator = this.optionalRepository.findAll().iterator();

			while(iterator.hasNext()) {

				Optional optional = iterator.next();
				result.add(OptionalDTO.build(optional));

			}

			response.setResult(result);
			
			log.info("Lista optional.");

		} catch (Exception e) {

			response.setError("Nessun elemento trovato.");
			
			log.info("Nessun elemento trovato.");

		}

		return response;

	}

}
