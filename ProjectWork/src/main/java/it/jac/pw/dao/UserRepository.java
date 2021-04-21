package it.jac.pw.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.jac.pw.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
	
}