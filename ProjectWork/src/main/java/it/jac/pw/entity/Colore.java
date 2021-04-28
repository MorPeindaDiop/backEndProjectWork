package it.jac.pw.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Colore")
@Data

public class Colore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Colore")
	private int id_Colore;
	
	@Column(name = "descrizione")
	private String descrizione;
	
	@Column(name = "id_Modello")
	private int id_Modello;
	
	@Column(name = "src")
	private String src;
	
	@Column(name = "colore")
	private String colore;
	
	@Override
	public String toString() {
		return "Colore [id_Colore = " + id_Colore + ", descrizione = " + descrizione+  ", id_Modello = " + id_Modello +"]";
	}

}
