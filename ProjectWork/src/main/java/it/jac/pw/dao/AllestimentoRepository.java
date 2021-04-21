package it.jac.pw.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.jac.pw.entity.Allestimento;

@Repository
public interface AllestimentoRepository extends CrudRepository<Allestimento, String> {
	
}