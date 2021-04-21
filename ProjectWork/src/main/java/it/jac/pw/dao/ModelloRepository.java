package it.jac.pw.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.jac.pw.entity.Modello;

@Repository
public interface ModelloRepository extends CrudRepository<Modello, String> {
	
}