package it.jac.pw.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.jac.pw.dto.AllestimentoDTO;
import it.jac.pw.dto.Response;
import it.jac.pw.entity.Allestimento;
import it.jac.pw.dao.AllestimentoRepository;


@Service
public class AllestimentoService {

	private static Logger log = LoggerFactory.getLogger(AllestimentoService.class);

	@Autowired
	private AllestimentoRepository allestimentoRepository;

	public Response<Allestimento> createAllestimento(Allestimento allestimento) {

		Response<Allestimento> response = new Response<Allestimento>();

		try {

			response.setResult(this.allestimentoRepository.save(allestimento));
			
			log.info("Allestimento creato/modificato.");

		} catch (Exception e) {

			response.setError("Allestimento non creato/modificato.");
			
			log.info("Allestimento non creato/modificato.");

		}

		return response;

	}


	public Response<String> deleteAllestimento(Allestimento allestimento) {

		Response<String> response = new Response<String>();

		try {

			this.allestimentoRepository.delete(allestimento);			

			response.setResult("Allestimento eliminato.");
			
			log.info("Allestimento eliminato.");

		} catch (Exception e) {

			response.setError("Allestimento non eliminato.");

			log.info("Allestimento non eliminato.");
			
		}

		return response;

	}


	public Response<List<AllestimentoDTO>> findAllAllestimenti() {

		Response<List<AllestimentoDTO>> response = new Response<List<AllestimentoDTO>>();

		List<AllestimentoDTO> result = new ArrayList<>();

		try {

			Iterator<Allestimento> iterator = this.allestimentoRepository.findAll().iterator();

			while(iterator.hasNext()) {

				Allestimento allestimento = iterator.next();
				result.add(AllestimentoDTO.build(allestimento));

			}

			response.setResult(result);
			
			log.info("Lista Allestimenti.");

		} catch (Exception e) {

			response.setError("Nessun elemento trovato.");
			
			log.info("Nessun elemento trovato.");

		}

		return response;

	}

}
