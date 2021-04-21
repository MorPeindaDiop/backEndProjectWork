package it.jac.pw.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.jac.pw.dao.MarcheRepository;
import it.jac.pw.dto.Response;
import it.jac.pw.dto.MarcheDTO;
import it.jac.pw.entity.Marche;

@Service
public class MarcheService {

	private static Logger log = LoggerFactory.getLogger(MarcheService.class);

	@Autowired
	private MarcheRepository marcheRepository;

	public Response<Marche> createMarche(Marche marche) {

		Response<Marche> response = new Response<Marche>();

		try {

			response.setResult(this.marcheRepository.save(marche));
			
			log.info("Marche creato/modificato.");

		} catch (Exception e) {

			response.setError("Marche non creato/modificato.");
			
			log.info("Marche non creato/modificato.");

		}

		return response;

	}


	public Response<String> deleteMarche(Marche marche) {

		Response<String> response = new Response<String>();

		try {

			this.marcheRepository.delete(marche);			

			response.setResult("Marche eliminato.");
			
			log.info("Marche eliminato.");

		} catch (Exception e) {

			response.setError("Marche non eliminato.");

			log.info("Marche non eliminato.");
			
		}

		return response;

	}


	public Response<List<MarcheDTO>> findAllMarche() {

		Response<List<MarcheDTO>> response = new Response<List<MarcheDTO>>();

		List<MarcheDTO> result = new ArrayList<>();

		try {

			Iterator<Marche> iterator = this.marcheRepository.findAll().iterator();

			while(iterator.hasNext()) {

				Marche marche = iterator.next();
				result.add(MarcheDTO.build(marche));

			}

			response.setResult(result);
			
			log.info("Lista marche.");

		} catch (Exception e) {

			response.setError("Nessun elemento trovato.");
			
			log.info("Nessun elemento trovato.");

		}

		return response;

	}

}
