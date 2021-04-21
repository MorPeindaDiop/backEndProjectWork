package it.jac.pw.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.jac.pw.entity.Motorizzazione;

@Repository
public interface MotorizzazioneRepository extends CrudRepository<Motorizzazione, String> {
	
	
}