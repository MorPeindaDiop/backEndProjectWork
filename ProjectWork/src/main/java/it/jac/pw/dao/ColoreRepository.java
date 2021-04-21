package it.jac.pw.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.jac.pw.entity.Colore;

@Repository
public interface ColoreRepository extends CrudRepository<Colore, String> {
	
	
}