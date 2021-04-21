package it.jac.pw.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.jac.pw.dao.RiepilogoOptionalRepository;
import it.jac.pw.dto.Response;
import it.jac.pw.dto.RiepilogoOptionalDTO;
import it.jac.pw.entity.RiepilogoOptional;

@Service
public class RiepilogoOptionalService {

	private static Logger log = LoggerFactory.getLogger(RiepilogoOptionalService.class);

	@Autowired
	private RiepilogoOptionalRepository riepilogoOptionalRepository;

	public Response<RiepilogoOptional> createRiepilogoOptional(RiepilogoOptional riepilogoOptional) {

		Response<RiepilogoOptional> response = new Response<RiepilogoOptional>();

		try {

			response.setResult(this.riepilogoOptionalRepository.save(riepilogoOptional));
			
			log.info("Riepilogo Optional creato/modificato.");

		} catch (Exception e) {

			response.setError("Riepilogo Optional non creato/modificato.");
			
			log.info("Riepilogo Optional non creato/modificato.");

		}

		return response;

	}


	public Response<String> deleteRiepilogoOptional(RiepilogoOptional riepilogoOptional) {

		Response<String> response = new Response<String>();

		try {

			this.riepilogoOptionalRepository.delete(riepilogoOptional);			

			response.setResult("Riepilogo Optional eliminato.");
			
			log.info("Riepilogo Optional eliminato.");

		} catch (Exception e) {

			response.setError("Riepilogo Optional non eliminato.");

			log.info("Riepilogo Optional non eliminato.");
			
		}

		return response;

	}


	public Response<List<RiepilogoOptionalDTO>> findAllRiepilogoOptionals() {

		Response<List<RiepilogoOptionalDTO>> response = new Response<List<RiepilogoOptionalDTO>>();

		List<RiepilogoOptionalDTO> result = new ArrayList<>();

		try {

			Iterator<RiepilogoOptional> iterator = this.riepilogoOptionalRepository.findAll().iterator();

			while(iterator.hasNext()) {

				RiepilogoOptional riepilogoOptional = iterator.next();
				result.add(RiepilogoOptionalDTO.build(riepilogoOptional));

			}

			response.setResult(result);
			
			log.info("Lista riepilogo optional.");

		} catch (Exception e) {

			response.setError("Nessun elemento trovato.");
			
			log.info("Nessun elemento trovato.");

		}

		return response;

	}

}
