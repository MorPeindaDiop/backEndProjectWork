package it.jac.pw.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.jac.pw.dao.ColoreRepository;
import it.jac.pw.dto.Response;
import it.jac.pw.dto.ColoreDTO;
import it.jac.pw.entity.Colore;

@Service
public class ColoreService {

	private static Logger log = LoggerFactory.getLogger(ColoreService.class);

	@Autowired
	private ColoreRepository coloreRepository;

	public Response<Colore> createColore(Colore colore) {

		Response<Colore> response = new Response<Colore>();

		try {

			response.setResult(this.coloreRepository.save(colore));
			
			log.info("Colore creato/modificato.");

		} catch (Exception e) {

			response.setError("Colore non creato/modificato.");
			
			log.info("Colore non creato/modificato.");

		}

		return response;

	}


	public Response<String> deleteColore(Colore colore) {

		Response<String> response = new Response<String>();

		try {

			this.coloreRepository.delete(colore);			

			response.setResult("Colore eliminato.");
			
			log.info("Colore eliminato.");

		} catch (Exception e) {

			response.setError("Colore non eliminato.");

			log.info("Colore non eliminato.");
			
		}

		return response;

	}


	public Response<List<ColoreDTO>> findAllColori() {

		Response<List<ColoreDTO>> response = new Response<List<ColoreDTO>>();

		List<ColoreDTO> result = new ArrayList<>();

		try {

			Iterator<Colore> iterator = this.coloreRepository.findAll().iterator();

			while(iterator.hasNext()) {

				Colore colore = iterator.next();
				result.add(ColoreDTO.build(colore));

			}

			response.setResult(result);
			
			log.info("Lista colore.");

		} catch (Exception e) {

			response.setError("Nessun elemento trovato.");
			
			log.info("Nessun elemento trovato.");

		}

		return response;

	}

}
