package it.jac.pw.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.jac.pw.entity.RiepilogoOptional;

@Repository
public interface RiepilogoOptionalRepository extends CrudRepository<RiepilogoOptional, String> {
	
	
}