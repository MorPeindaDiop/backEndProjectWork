package it.jac.pw.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.jac.pw.entity.Marche;

@Repository
public interface MarcheRepository extends CrudRepository<Marche, String> {
	
}