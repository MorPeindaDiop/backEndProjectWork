package it.jac.pw.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.jac.pw.entity.Configurazione;

@Repository
public interface ConfigurazioneRepository extends CrudRepository<Configurazione, String> {
	
}