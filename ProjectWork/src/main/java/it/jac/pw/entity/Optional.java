package it.jac.pw.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Optional")
@Data

public class Optional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id_Optional;
	
	@Column(name = "descrizione")
	private String descrizione;
	
	@Column(name = "id_Modello")
	private int id_Modello;
	
	@Override
	public String toString() {
		return "Optional [id_Optional = " + id_Optional + ", descrizione = " + descrizione+  ", id_Modello = " + id_Modello +"]";
	}

}
