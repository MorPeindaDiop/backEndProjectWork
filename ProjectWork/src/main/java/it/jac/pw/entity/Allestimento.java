package it.jac.pw.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Allestimento")
@Data

public class Allestimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Allestimento")
	private int id_Allestimento;
	
	@Column(name = "descrizione")
	private String descrizione;
	
	@Column(name = "id_Modello")
	private int id_Modello;
	
	@Override
	public String toString() {
		return "Allestimento [id_Allestimento = " + id_Allestimento + ", descrizione = " + descrizione+  ", id_Modello = " + id_Modello +"]";
	}
	
	

}
