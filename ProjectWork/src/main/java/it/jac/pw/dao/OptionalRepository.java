package it.jac.pw.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.jac.pw.entity.Optional;

@Repository
public interface OptionalRepository extends CrudRepository<Optional, String> {
	
}