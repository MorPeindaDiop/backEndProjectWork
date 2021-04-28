package it.jac.pw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Configurazione")
@Data

public class Configurazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Riepilogo")
	private int id_Riepilogo;
	
	@Column(name = "id_Motorizzazione")
	private String id_Motorizzazione;
	
	@Column(name = "id_Colore")
	private String id_Colore;
	
	@Column(name = "id_Allestimento")
	private String id_Allestimento;
	
	@Column(name = "id_Marca")
	private String id_Marca;
	
	@Column(name = "id_Modello")
	private String id_Modello;
	
	@Column(name = "id_Utente")
	private String id_Utente;
	
	@Override
	public String toString() {
		return "Marca [id_Riepilogo = " + id_Riepilogo + ", id_Motorizzazione = " + id_Motorizzazione +  
				" , id_Colore = " + id_Colore + " , id_Allestimento = " + id_Allestimento + " , id_Marca = " + id_Marca + " , id_Modello = " 
				+ id_Modello + ", id_Utente = " + id_Utente + "+]";
	}

}
