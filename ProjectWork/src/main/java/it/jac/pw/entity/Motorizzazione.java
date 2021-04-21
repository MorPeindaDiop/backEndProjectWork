package it.jac.pw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Motorizzazioni")
@Data

public class Motorizzazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Motorizzazione")
	private int id_Motorizzazione;
	
	@Column(name = "descrizione")
	private String descrizione;
	
	@Column(name = "id_Modello")
	private int id_Modello;
	
	@Override
	public String toString() {
		return "Motorizzazione [id_Motorizzazione = " + id_Motorizzazione + ", descrizione = " + descrizione + ", id_Modello = " + id_Modello +"]";
	}

}
