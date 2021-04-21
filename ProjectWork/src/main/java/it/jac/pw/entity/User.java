package it.jac.pw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {
	
	@Id
	@Column(name = "email")
	private String email;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;

	@Override
	public String toString() {
		return "User [email = " + email + ", username = " + username + "]";
	}

}
